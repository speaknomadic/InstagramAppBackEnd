package controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Scanner;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.json.JSONException;
import org.json.JSONObject;

import com.google.gson.Gson;
import com.google.gson.JsonObject;

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
		Scanner sc = new Scanner(request.getInputStream());
		StringBuilder sb = new StringBuilder();
		
		while(sc.hasNextLine()){
			sb.append(sc.nextLine());
		}
		String username =null;
		String password =null;
		
		try {
			JSONObject jsonObject= new JSONObject(sb.toString());
			username=jsonObject.getString("username");
			password=jsonObject.getString("password");
			
		} catch (JSONException e1) {
			System.out.println("JSON LOGIN EXCEP"+ e1.getMessage());
		}
		
		
		
		try {
			User user =UserDAO.loginUser(username, password);
			Gson gson= new Gson();
			if(user!=null){
				response.getWriter().write(gson.toJson(user));
				System.out.println(gson.toJson(user));
			}
			else{
				response.sendError(404);
				System.out.println("nqma takuv");
			}
		} catch (SQLException e) {
			System.out.println("Login EXCEP"+ e.getMessage());
		}
		
	}

	

}
