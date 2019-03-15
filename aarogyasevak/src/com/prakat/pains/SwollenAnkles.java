package com.prakat.pains;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;




public class SwollenAnkles {
	  String emailId;
	  ArrayList list;
	  String name,mail=null;
	  String myDriver = "com.mysql.jdbc.Driver";
	    String myUrl = "jdbc:mysql://localhost:3306/aarogyasevak";
	    String query="Select ";
	  							///////------------get and set process---------/////////
	public String getEmailId() {
		return emailId;
		
	} 

	public void  setEmailId(String emailId ) {
		this.emailId = emailId;
	}  
	public ArrayList getList() {
		return list;
	}
	
	public void setList(ArrayList list) {
		this.list=list;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

///////------------End of   get and set process---------/////////
public  void createExcel (String s, ArrayList l){ 
	
	//String em = getEmailId();
	System.out.println(s);
	mail=s;
	ArrayList qu=getList();
	System.out.println(qu);
	 HSSFWorkbook workbook = new HSSFWorkbook();
	 HSSFSheet spreadsheet = workbook.createSheet( "User info");

	
	 Map<Integer, Object[]> userinfo = new HashMap<Integer, Object[]>();
	 userinfo.put( 1, new Object[] {"Email Id", "Questions"});
	 
	 
	 
	 for(int i=0;i<l.size();i++) {
	 userinfo.put( i+2, new Object[] {s, l.get(i)}); 
	 }
	 
	 
	 Set<Integer> keyid = userinfo.keySet();
	 int rowid = 0;
	 for (Integer key : keyid) {
		HSSFRow row = spreadsheet.createRow(rowid++);
		System.out.println(row);
		 Object [] objectArr = userinfo.get(key);
		 int cellid = 0;
		 for (Object obj : objectArr){
	            HSSFCell cell = row.createCell(cellid++);
	            if(obj instanceof Date) 
	            cell.setCellValue((Date)obj);
	            else if(obj instanceof Boolean) 
		            cell.setCellValue((Boolean)obj);
		            else if(obj instanceof String) 
			            cell.setCellValue((String)obj);
		            else if(obj instanceof Double) 
			            cell.setCellValue((Double)obj);
		            
	       	  
	         }
	 }

	try( FileOutputStream out = new FileOutputStream("Question&Em.xls")){
		workbook.write(out);
	}catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
				e.printStackTrace();
	}
	catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
     
    
     System.out.println("Question&Em.xls written successfully");
	 
     try {
 			

    	 Class.forName(myDriver);
    			    Connection con = DriverManager.getConnection(myUrl, "root", "root");
    			    String currentusermailid = mail;
    			   // PreparedStatement psmnt=con.prepareStatement("insert into login(File)"+"values(?)");
    			   // PreparedStatement psmnt=con.prepareStatement("update login SET File=? where EMAIL='anknaveenkumar24@gmail.com'");
    			    PreparedStatement psmnt=con.prepareStatement("update login SET File=? where EMAIL=?");
    			    File excel=new File("C:\\Users\\Prakat-Intern\\Desktop\\eclipse-jee-oxygen-3a-win32-x86_64\\Question&Em.xls");
    			    FileInputStream fis=new FileInputStream(excel);
    			    psmnt.setBinaryStream(1, (InputStream)fis,(int)(excel.length()));
    			    psmnt.setString(2, currentusermailid);
    			    System.out.println("File for :"+currentusermailid);
    			    int last=psmnt.executeUpdate();		}
		catch(Exception e) {
			System.out.println(e);
		}
	
	}//main	
}//end

