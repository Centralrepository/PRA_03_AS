package com.downloadFile;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sun.xml.internal.ws.api.message.Attachment;

/**
 * Servlet implementation class AdminServlet
 */
@WebServlet("/AdminServlet")
public class AdminServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AdminServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
		int id=Integer.parseInt(request.getParameter("id"));
	System.out.println(id);
	Connection conn=null;
	String email;
	int Id;
	Blob file;
	PreparedStatement pstmnt;
	ResultSet rs= null;
	 FileOutputStream fos = null;
	 response.setContentType("text/html");
	 String filename="AarogyaSevak";
	 String filepath="C:\\Users\\Prakat-Intern\\Desktop\\eclipse-jee-oxygen-3a-win32-x86_64\\Question&Em.xls";
	
	
	try {
		String url= "jdbc:mysql://localhost:3306/aarogyasevak";
		String user="root";
		String pass="root";
		String query="select file from login where Id=?";
			
		Class.forName("com.mysql.jdbc.Driver");
		conn=(Connection) DriverManager.getConnection(url, user, pass);
		pstmnt=conn.prepareStatement(query);
		pstmnt.setInt(1, id);
		rs = pstmnt.executeQuery();
		 
		File file1=new File("Question&Em.xls");
		fos=new FileOutputStream(file1);
		System.out.println("writting blop to file"+file1.getAbsolutePath());
		while(rs.next()) {
			InputStream input=rs.getBinaryStream("File");
			byte[] buffer=new byte[1024];
			while(input.read(buffer)>0) {
				fos.write(buffer);
			System.out.println("its comming!!!!!");
			}
			
		}
		
		 response.setContentType("APPLICATION/OCTET-STREAM");
		 response.setHeader("Content-Disposition", "attachment; filename=\""
					+ filename + "\"");
		 FileInputStream fileInputStream = new FileInputStream(filepath);
		 int i;
		 while((i=fileInputStream.read())!=-1) {
		 }
		 fileInputStream.close();
		 
	}
	catch(Exception e) {
		System.out.println(e);
		
	}
	
	}

	

	private Login getLoginFromDB(Connection conn, Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
