package Servlet.DVDRegister;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dto.DVD;

/**
 * Servlet implementation class DVDRegisterConfirmServlet
 */
@WebServlet("/DVDRegisterConfirmServlet")
public class DVDRegisterConfirmServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DVDRegisterConfirmServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
    	dvd_account account = (dvd_account)session.getAttribute("user");

		if(account == null){
			String view = "./";
			RequestDispatcher dispatcher = request.getRequestDispatcher(view);
			dispatcher.forward(request, response);
			return;
		}
		
		request.setCharacterEncoding("UTF-8");
		
		String name = request.getParameter("name");
		String directed_by = request.getParameter("directed_by");
		int number = Integer.parseInt(request.getParameter("number"));
		
		DVD dvd = new DVD(-1, name,directed_by,number);
		
		// セッションスコープのインスタンス取得
		HttpSession session = request.getSession();
		
		// セッションスコープに値の保存
		session.setAttribute("input_data", dvd);
		
		String view = "WEB-INF/DVDRegister/Confirm.jsp";
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
