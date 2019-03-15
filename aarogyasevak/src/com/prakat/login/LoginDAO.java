package com.prakat.login;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class LoginDAO {
	
	public static boolean validate(String email, String password) {
		Connection con=null;
		PreparedStatement ps=null;
		boolean status=false; 
		String query="select * from login where EMAIL=? and PASSSWORD=?";
		 String myDriver = "com.mysql.jdbc.Driver";
	      String myUrl = "jdbc:mysql://localhost:3306/aarogyasevak";
	      try {
			Class.forName(myDriver);
			con = DriverManager.getConnection(myUrl, "root", "root");
		    ps=con.prepareStatement(query);
		    ps.setString(1,email);  
		    ps.setString(2,password);  
		          
		    ResultSet rs=ps.executeQuery();  
		    status=rs.next();  
		} catch (Exception e) {
			e.printStackTrace();
		}
	      
		return status;
	}

}
