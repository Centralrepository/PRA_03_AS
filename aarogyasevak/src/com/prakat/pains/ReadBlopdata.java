package com.prakat.pains;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ReadBlopdata {
	 
	  
	 static String myDriver = "com.mysql.jdbc.Driver";
	 static String myUrl = "jdbc:mysql://localhost:3306/aarogyasevak";
	public static void main(String[] args) throws SQLException, IOException {
		
		 
		try {
			Class.forName(myDriver);
			Connection con = DriverManager.getConnection(myUrl, "root", "root");		
			PreparedStatement psmnt=con.prepareStatement("Select EMAIL from login ");
			ResultSet resultset=psmnt.executeQuery();
			while(resultset.next()) {
				String Email=resultset.getString(1);
				File data=new File("E:\\report\\value.xls");
				FileOutputStream os=new FileOutputStream(data);
				byte[] buffer=new byte[1];
				InputStream is=resultset.getBinaryStream(1);
				while(is.read(buffer)>0) {
					os.write(buffer);
					System.out.println("sucessfull readed");	
				}
				
			}
			} 
		
		catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}
}
