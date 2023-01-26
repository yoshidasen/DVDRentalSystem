package Servlet.DVDDelete;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.DVDDAO;
import dto.DVD;

/**
 * Servlet implementation class DVDDeleteConfirmServlet
 */
@WebServlet("/DVDDeleteConfirmServlet")
public class DVDDeleteConfirmServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DVDDeleteConfirmServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		
		String name = request.getParameter("name");
		
		DVD dvd = new DVD(-1, name);
		List<DVD> result = DVDDAO.DisplayDVD(name);
		request.setAttribute("list", result);
		
		// セッションスコープのインスタンス取得
		HttpSession session = request.getSession();
		
		// セッションスコープに値の保存
		session.setAttribute("input_data", dvd);
		
		String view = "WEB-INF/DVDDelete/DeleteConfirm.jsp";
		RequestDispatcher dispatcher = request.getRequestDispatcher(view);
		dispatcher.forward(request, response);
		}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
