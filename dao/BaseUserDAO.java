package dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class BaseUserDAO {
	private final String DB_URL = "";
	private final String DB_USER = "";
	private final String DB_PASS = "";
	
	protected Connection getConnection() throws SQLException{
		Connection conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASS);
		return conn;
	}
}
