package Servlet.DVDDelete;

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
 * Servlet implementation class DVDDeleteSuccessServlet
 */
@WebServlet("/DVDDeleteSuccessServlet")
public class DVDDeleteSuccessServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DVDDeleteSuccessServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		DVD dvd = (DVD)session.getAttribute("input_data");
		int result = DVDDAO.deleteDVD(dvd);
		
		String path = "";
		if(result == 1) {
			session.removeAttribute("input_data");
			
			path = "WEB-INF/DVDDelete/DeleteSuccess.jsp";
		} else {
			path = "WEB-INF/DVDDelete/Deleteform.jsp?error=1";
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
