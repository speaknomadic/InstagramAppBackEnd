package controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Scanner;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.JSONException;
import org.json.JSONObject;

import com.google.gson.Gson;

import model.dao.UserDAO;


@WebServlet("/UsernameExist")
public class UsernameExist extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	
	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Scanner sc = new Scanner(request.getInputStream());
		StringBuilder sb = new StringBuilder();
		
		while(sc.hasNextLine()){
			sb.append(sc.nextLine());
		}
		String username =null;
		
		try {
			JSONObject jsonObject= new JSONObject(sb.toString());
			username=jsonObject.getString("username");
			
			
		} catch (JSONException e1) {
			System.out.println("JSON Username LOGIN EXCEP"+ e1.getMessage());
		}
		
		try {
			if(UserDAO.checkUsername(username)){
				response.sendError(404);
				System.out.println("Is exist");
				}
			else{
				System.out.println("Do not exist");
				boolean bool= false;
				Gson gson= new Gson();
				response.getWriter().write(gson.toJson(bool));
			}
		} catch (SQLException e) {
			System.out.println("UsernameExist EXCEP"+ e.getMessage());
		}
		
		
	}

}
