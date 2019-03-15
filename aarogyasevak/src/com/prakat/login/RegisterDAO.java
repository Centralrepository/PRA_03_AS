package com.prakat.login;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.service.MailSendingService;

public class RegisterDAO {

	public String registerUser(RegisterBean bean) {
		String EMAIL=bean.getEmail();
		String PASSWORD=bean.getPwd();
		String NAME=bean.getName();
		Connection con=null;
		PreparedStatement stmt=null;
		String query="insert into login(EMAIL,PASSSWORD,NAME) values (?,?,?)";
		try {
			// create our mysql database connection
		      String myDriver = "com.mysql.jdbc.Driver";
		      String myUrl = "jdbc:mysql://localhost:3306/aarogyasevak";
		      Class.forName(myDriver);
		      con = DriverManager.getConnection(myUrl, "root", "root");
		      stmt=con.prepareStatement(query);
		      stmt.setString(1, EMAIL);
		      stmt.setString(2, PASSWORD);
		      stmt.setString(3, NAME);
		      int i= stmt.executeUpdate();
		      if (i!=0) {
		    	  MailSendingService msg = new MailSendingService();
		    	  msg.sendMail(EMAIL, PASSWORD);
		    	  
		    	  return "SUCCESS"; 
		    	  //Just to ensure data has been inserted into the database
		      }
		    	  
		      
		}catch(SQLException | ClassNotFoundException e){
			e.printStackTrace();
		}
				
		return "Oops.. Something went wrong there..!";
		
	}

}
