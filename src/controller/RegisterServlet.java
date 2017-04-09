package controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashSet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

import model.User;
import model.dao.UserDAO;


@WebServlet("/RegisterServlet")
public class RegisterServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		//User just for test!!
//
//		User user = new User("tobleron", "Ivan", "Ivanov", "123456", "bb@bb.bb", "08954574554",
//				"profilePicUrl", "biography", "externalUrl", 0, 0, 
//				0, new HashSet<>(), new HashSet<>(), new ArrayList<>(), new ArrayList<>());
		
		
		
		      if(!request.getParameter("user").isEmpty()){
				String userJson=request.getParameter("user");
				Gson gson= new Gson();
				User user = gson.fromJson(userJson, User.class);
		
                
				try {
					 User newUser = UserDAO.addUser(user);
					if(newUser!=null){
					Gson json= new Gson();
					String userToJson=json.toJson(newUser);
					response.getWriter().write(userToJson);
					System.out.println(userToJson);
					}
					else {
						response.getWriter().write("");
						System.out.println("ima go ");
					}
				} catch (SQLException e) {

					System.out.println("DAO EXCEP" + e.getMessage()) ;
					e.printStackTrace();
					
				}
			}
		
	}

}
