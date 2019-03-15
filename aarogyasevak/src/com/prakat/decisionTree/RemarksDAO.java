package com.prakat.decisionTree;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import com.prakat.pains.SwollenAnklesServlet;

public class RemarksDAO {

	public String Remarks(DiseaseBean bean) {
		
		String Remarks=bean.getRemarks();
		System.out.println("remarks value is"+Remarks);
		String email=SwollenAnklesServlet.getEmailId();
		Connection con=null;
		PreparedStatement stmt=null;
		try {
			  String myDriver = "com.mysql.jdbc.Driver";
		      String myUrl = "jdbc:mysql://localhost:3306/aarogyasevak";
		      String user="root";
		  	  String pass="root";
		      Class.forName(myDriver);
		      con = DriverManager.getConnection(myUrl, user, pass);
		      stmt=con.prepareStatement("update login SET Remarks=? where EMAIL=? ");
		      stmt.setString(1,Remarks );
		      stmt.setString(2, email);
		      int i= stmt.executeUpdate();
		      if (i!=0) 	{
		    	  System.out.println("sucessfully updated");
		      }
		      else System.out.println("failed");
			    	
		     
		}catch(Exception e) {
			
		}
		
		
		
		
		
		
		
		
		
		
		
		return null;
	}

}
