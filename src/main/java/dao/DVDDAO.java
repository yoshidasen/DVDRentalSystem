package dao;

import java.net.URI;
import java.net.URISyntaxException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import dto.DVD;

public class DVDDAO {
	private static Connection getConnection() throws URISyntaxException, SQLException {
		try {
			Class.forName("org.postgresql.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	    URI dbUri = new URI(System.getenv("DATABASE_URL"));

	    String username = dbUri.getUserInfo().split(":")[0];
	    String password = dbUri.getUserInfo().split(":")[1];
	    String dbUrl = "jdbc:postgresql://" + dbUri.getHost() + ':' + dbUri.getPort() + dbUri.getPath();

	    return DriverManager.getConnection(dbUrl, username, password);
	}
	
	//情報作成
	public static int registerDVD(DVD dvd) {
		String sql = "INSERT INTO dvd VALUES(default, ?, ?, ?, false)";
		int result = 0;
				
		try (
				Connection con = getConnection();
				PreparedStatement pstmt = con.prepareStatement(sql);
				){
			pstmt.setString(1, dvd.getName());
			pstmt.setString(2, dvd.getDirected_by());
			pstmt.setInt(3, dvd.getNumber());

			result = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (URISyntaxException e) {
			e.printStackTrace();
		} finally {
			System.out.println(result + "件更新しました。");
		}
		return result;
	}
	
	//情報削除
		public static int deleteDVD(DVD dvd) {
			String sql = "DELETE FROM dvd WHERE name = ?";
			int result = 0;

			try (
					Connection con = getConnection();
					PreparedStatement pstmt = con.prepareStatement(sql);
					){
				
				pstmt.setString(1, dvd.getName());

				result = pstmt.executeUpdate();
			} catch (SQLException e) {
				e.printStackTrace();
			} catch (URISyntaxException e) {
				e.printStackTrace();
			} finally {
				System.out.println(result + "件削除しました。");
			}
			return result;
		}
		
	//情報表示
		public static int DisplayDVD(DVD dvd) {
			String sql = "select FROM dvd WHERE name = ?";
			int result = 0;

			try (
					Connection con = getConnection();
					PreparedStatement pstmt = con.prepareStatement(sql);
					){
				
				pstmt.setString(1, dvd.getName());

				result = pstmt.executeUpdate();
			} catch (SQLException e) {
				e.printStackTrace();
			} catch (URISyntaxException e) {
				e.printStackTrace();
			} finally {
				System.out.println(result + "件削除しました。");
			}
			return result;
		}
}
