package com.prakat.decisionTree;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class HeadacheDAO {
	 public static void main(String[] args)
	  {
		 List<HeadacheBO> results=new ArrayList<>();
	    try
	    {
	      // create our mysql database connection
	      String myDriver = "com.mysql.jdbc.Driver";
	      String myUrl = "jdbc:mysql://localhost:3306/aarogyasevak";
	      Class.forName(myDriver);
	      Connection conn = DriverManager.getConnection(myUrl, "root", "root");
	      
	      // our SQL SELECT query. 
	      // if you only need a few columns, specify them by name instead of using "*"
	      String query = "SELECT * FROM headache";

	      // create the java statement
	      Statement st = conn.createStatement();
	      
	      // execute the query, and get a java resultset
	      ResultSet rs = st.executeQuery(query);
	      
	      // iterate through the java resultset
	      while (rs.next())
	      {
	    	  HeadacheBO result=new HeadacheBO();
	    	  result.setQid(rs.getInt("qid"));
	    	  result.setQuest(rs.getString("quest"));
	    	  result.setYes(rs.getInt("yes"));
	    	  result.setNo(rs.getInt("no"));
	    	  results.add(result);
	       
	      }
	      st.close();
	    }
	    catch (Exception e)
	    {
	      System.err.println("Got an exception! ");
	      System.err.println(e.getMessage());
	    }
	    
	    Iterator<HeadacheBO> itr=results.iterator();  
	    while(itr.hasNext()){ 
	    	int id=itr.next().getQid();
	    	if(id==1) {
	    		System.out.println(itr.next().getQuest());
	    	}
	
	     
	    }  
	      
	  }
}
