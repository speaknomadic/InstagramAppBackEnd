package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/users")
public class UserServlet extends HttpServlet {


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
//	//select from db
//		//build json
//		String json = "Zdrasti";
//		response.getWriter().append(json);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

//		 String userid = request.getParameter("userid");
//		 String pass = request.getParameter("password");
//		 System.out.println("data received : " + userid + " - " + pass);
//		 response.getWriter().write("data received : " + userid + " - " +
//		 pass);
	}

}
