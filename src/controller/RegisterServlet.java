package controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

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

		// User just for test!!
		//
		// User user = new User("tobleron", "Ivan", "Ivanov", "123456",
		// "bb@bb.bb", "08954574554",
		// "profilePicUrl", "biography", "externalUrl", 0, 0,
		// 0, new HashSet<>(), new HashSet<>(), new ArrayList<>(), new
		// ArrayList<>());

		Scanner sc = new Scanner(request.getInputStream());
		StringBuilder sb = new StringBuilder();
		while(sc.hasNextLine()){
			sb.append(sc.nextLine());
		}
		
		String userJson = sb.toString();
		Gson gson = new Gson();
		User user = gson.fromJson(userJson, User.class);

		try {
			System.out.println("Received from android : " + userJson);
			user = UserDAO.addUser(user);
			if (user != null) {
				Long id=user.getId();
			  response.getWriter().write(gson.toJson(id));
				System.out.println("Will send to android : " + gson.toJson(id));
			} else {
				boolean bool= false;
				response.getWriter().write(gson.toJson(bool));
				System.out.println("ima go ");
			}
		} catch (SQLException e) {

			System.out.println("DAO EXCEP" + e.getMessage());

		}

	}

}
