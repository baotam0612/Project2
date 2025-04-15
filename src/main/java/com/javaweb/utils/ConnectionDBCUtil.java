package com.javaweb.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
@PropertySource("classpath:application-uat.properties")
public class ConnectionDBCUtil {
	@Value("${spring.datasource.url}")
	static final String DB_URL ="jdbc:mysql://localhost:3306/estatebasic";
	static final String USER = "root";
	static final String PASS = "Tam06122005@";
	
	public static Connection getConnection() {
		Connection conn = null;
		try {
			conn = DriverManager.getConnection(DB_URL, USER, PASS);
		}catch(SQLException e){
			e.printStackTrace();
		}
		return conn;
	}

}
