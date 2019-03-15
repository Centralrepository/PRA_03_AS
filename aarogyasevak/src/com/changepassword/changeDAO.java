package com.changepassword;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mysql.jdbc.Statement;





/**
 * Servlet implementation class changeDAO
 */
@WebServlet("/changeDAO")
public class changeDAO extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public changeDAO() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		String EMAIL=request.getParameter("EMAIL");
		String PASSSWORD=request.getParameter("PASSSWORD");
		String Current=request.getParameter("current");
		String Newpass=request.getParameter("new");
		String conpass=request.getParameter("confirm");
		
		
		try {
			String myDriver = "com.mysql.jdbc.Driver";
		    String myUrl = "jdbc:mysql://localhost:3306/aarogyasevak";
			Class.forName(myDriver);
			Connection con = DriverManager.getConnection(myUrl, "root", "root");
			java.sql.Statement st =  con.createStatement();	
			ResultSet rs=st.executeQuery("select * from login where PASSSWORD='" + Current+ "'");
			while(rs.next()) {
				EMAIL=rs.getString(1);
				PASSSWORD=rs.getString(2);
			}
			if(PASSSWORD.equals(Current)) {
				java.sql.Statement stmt=con.createStatement();
				
			int s=stmt.executeUpdate("update login set PASSSWORD='"+Newpass+"' where EMAIL='"+EMAIL+"' ");
			out.println("Password change sucessfully");
			}
			else{
				out.println("invalid current password");
			}
			}
		catch (Exception e){
			out.println(e);
		}
		
		
	}

}
