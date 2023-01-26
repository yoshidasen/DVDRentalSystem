package Servlet.DVDRegister;

import java.io.IOException;

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
 * Servlet implementation class DVDRegisterSuccessServlet
 */
@WebServlet("/DVDRegisterSuccessServlet")
public class DVDRegisterSuccessServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DVDRegisterSuccessServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		DVD dvd = (DVD)session.getAttribute("input_data");
		int result = DVDDAO.registerDVD(dvd);
		
		String path = "";
		if(result == 1) {
			session.removeAttribute("input_data");
			
			path = "WEB-INF/DVDRegister/Success.jsp";
		} else {
			path = "WEB-INF/DVDRegister/Register.jsp?error=1";
		}
		RequestDispatcher dispatcher = request.getRequestDispatcher(path);
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
