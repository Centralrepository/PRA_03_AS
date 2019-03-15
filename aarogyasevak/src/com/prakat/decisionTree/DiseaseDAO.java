package com.prakat.decisionTree;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import com.prakat.pains.SwollenAnklesServlet;

public class DiseaseDAO {

	public String DiseaseValue(DiseaseBean bean) {
		
		String DISEASETYPE=bean.getDisease();
		String email=SwollenAnklesServlet.getEmailId();
		Connection con=null;
		PreparedStatement stmt=null;
		try {
			// create our mysql database connection
		      String myDriver = "com.mysql.jdbc.Driver";
		      String myUrl = "jdbc:mysql://localhost:3306/aarogyasevak";
		      String user="root";
		  	  String pass="root";
		      Class.forName(myDriver);
		      con = DriverManager.getConnection(myUrl, user, pass);
		      stmt=con.prepareStatement("update login SET DISEASETYPE=? where EMAIL=? ");
		      stmt.setString(1,DISEASETYPE );
		      stmt.setString(2, email);
		      int i= stmt.executeUpdate();
		      if (i!=0) 	{
		    	  System.out.println("sucessfully updated");
		      }else System.out.println("failed");
			    	
		}
		catch(Exception e) {
			
		}
		
		return "sucess";
		
	
		
	}
	
	
}
