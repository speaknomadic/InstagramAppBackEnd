package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RegisterServlet
 */
@WebServlet("/RegisterServlet")
public class RegisterServlet extends HttpServlet {
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		//add the new user to db
		// String user = request.getParameter("user");
		// String name = request.getParameter("name");
		// String pass = request.getParameter("pass");
		// String pass2 = request.getParameter("pass2");
		// .name....
		//
				//validate data - if user.isEmpty and ....
				//if not valid data
//				
//				boolean validData = true;
//				
//				String json= ;
//				if(validData){
//					User u = new User(name, pass, user, .....);
//					try {
//						UserDAO.getInstance().addUser(u);
//					} catch (SQLException e) {
//						System.out.println(e.getMessage());
//				
//					}
//				}
//				RequestDispatcher rd = req.getRequestDispatcher(filename);
//				
//			}
	}

}
