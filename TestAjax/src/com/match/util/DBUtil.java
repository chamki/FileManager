package com.match.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DBUtil {
	private static DBUtil dbUtil = null;
	
	static {
		if(dbUtil == null) {
			dbUtil = new DBUtil();
		}
	}
	
	public DBUtil getInstance() {
		return dbUtil;
	}
	
	public static Connection getConn() {
		Connection conn = null;
		 String url = "jdbc:mysql://localhost:3166/test" ;    
	     String username = "icm" ;   
	     String password = "icm" ;  
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection(url, username, password);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return conn;
	}
	
	public static void close(Connection conn) {
		try {
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static void close(PreparedStatement ps) {
		try {
			ps.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
