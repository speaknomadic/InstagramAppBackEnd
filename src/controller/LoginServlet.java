package controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.google.gson.Gson;

import model.User;
import model.dao.UserDAO;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doGet(req, resp);
	}
	
	
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String username = "toblerone";
		String password ="123456";
		try {
			User user =UserDAO.loginUser(username, password);
			Gson gson= new Gson();
			if(user!=null){
				response.getWriter().write(gson.toJson(user));
				System.out.println(gson.toJson(user));
			}
			else{
				response.getWriter().write("");
				System.out.println("nqma takuv");
			}
		} catch (SQLException e) {
			System.out.println("Login EXCEP"+ e.getMessage());
		}
		
	}

	

}
