package com.kaushik.JdbcUsage.test;

import javax.sql.DataSource;

import org.apache.commons.dbcp2.BasicDataSource;

import com.kaushik.JdbcUsage.util.ConnectionUtil;

import java.sql.Connection;
import java.sql.SQLException;

public class ConnectionTest {
    
	  public static void main(String args[]) throws Exception{
		  
		  Connection conn = null;
		  
		  conn = ConnectionUtil.getConnection();
		  System.out.println("Database Connected");
		  
	  }
}
