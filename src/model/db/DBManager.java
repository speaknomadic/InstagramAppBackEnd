package model.db;

import java.sql.Connection;

//TODO
public class DBManager {

	private static Connection connection;
	// TODO
	// singleton
	// contrutor contains code from method in jdbc demo

	public static Connection getConnection() {
		return connection;
	}
}
