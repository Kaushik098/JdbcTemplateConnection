package com.kaushik.JdbcUsage.util;

import java.sql.Connection;

import javax.sql.DataSource;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.jdbc.core.JdbcTemplate;

public class ConnectionUtil {
	
	public static DataSource getDataSource(){
	
		BasicDataSource ds = new BasicDataSource();
		ds.setDriverClassName("com.mysql.jdbc.Driver");
		ds.setUrl("jdbc:mysql://13.233.226.80:3306/kaushik_db");
		ds.setUsername("kaushik");
		ds.setPassword("kaushik");
		
		return ds;
	}
	
	public static JdbcTemplate getJdbcTemplate(){
		
		JdbcTemplate jdbcTemplate = new JdbcTemplate();
		DataSource dataSource = getDataSource();
		jdbcTemplate.setDataSource(dataSource);
		
		return jdbcTemplate;
	}
	
	
	    public static Connection getConnection() throws Exception{
		    
		 Connection conn = null;
		
		 
		 try{
		 DataSource dataSource = getDataSource();
		 conn = dataSource.getConnection();
		 }
		 catch(Exception ae){
			 throw new Exception("Unable to connect");
		 }
		 
		 return conn;
		 
	 }	
}
