package dao;

import java.net.URI;
import java.net.URISyntaxException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DVDDAO {
	private static Connection getConnection() throws URISyntaxException,SQLException {
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
	
	//Rental 
	public static int dvdRental (int id) {
		String sql = "UPDATE dvd SET rental = false WHERE id = ?";
		int result = 0;
		
		try (
				Connection con = getConnection();
				PreparedStatement pstmt = con.prepareStatement(sql);
				){
			pstmt.setInt(1, id);
			
			result = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println(result+"件更新しました。");
		} catch (URISyntaxException e) {
			e.printStackTrace();
		}
		return result;
	}
	
	//Return
	public static int dvdReturn(int id) {
		String sql = "UPDATE dvd SET rental = true WHERE id = ?";
		int result = 0;
		
		try (
				Connection con = getConnection();
				PreparedStatement pstmt = con.prepareStatement(sql);
				){
			pstmt.setInt(1, id);
			
			result = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println(result+"件更新しました。");
		} catch (URISyntaxException e) {
			e.printStackTrace();
		}
		return result;
	}
	
}
