package model.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBManager {

	private static DBManager instance;

	// TODO:SetConnection parameters
	private static final String DB_IP = "";
	private static final String DB_PORT = "";
	private static final String DB_NAME = "";
	private static final String DB_USER = "";
	private static final String DB_PASS = "";

	private Connection connection = null;

	private DBManager() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			System.out.println("Driver not found");
		}
		try {
			connection = DriverManager.getConnection("jdbc:mysql://" + DB_IP + ":" + DB_PORT + "/" + DB_NAME, DB_USER,
					DB_PASS);
		} catch (SQLException e) {
			System.out.println("Error connecting to Database - " + e.getMessage());
		}
	}

	public static synchronized DBManager getInstance() {
		if (instance == null) {
			instance = new DBManager();
		}
		return instance;
	}

	public Connection getConnection() {
		return connection;
	}

}