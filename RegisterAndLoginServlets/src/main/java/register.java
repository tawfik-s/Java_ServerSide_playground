
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class register
 */
//@WebServlet("/register")
public class register extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession session=request.getSession();
		PrintWriter pr=response.getWriter();
		pr.println(session.getAttribute("email"));
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		PrintWriter pr=response.getWriter();
		
		HttpSession session=request.getSession();
		String account=request.getParameter("account");
		String name=request.getParameter("name");
		String email=request.getParameter("email");
		String password=request.getParameter("phone");
		String gender=request.getParameter("gender");
		
		session.setAttribute("email", email);
		//what about storing data in the database?
		
		pr.println("hellow mr: "+name+" "+password+" "+email+" "+account+" "+gender);
		pr.println("email stored in session"+(String)session.getAttribute("email"));
		
	}

}
