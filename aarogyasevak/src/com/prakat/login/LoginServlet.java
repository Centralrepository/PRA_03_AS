package com.prakat.login;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.prakat.pains.SwollenAnkles;
import com.prakat.pains.SwollenAnklesServlet;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginUrl")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
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
		 response.setContentType("text/html");  
		    PrintWriter out = response.getWriter();  
		   // SwollenAnkles serv=new SwollenAnkles();
		     
		        //  System.out.println(out);
		   /* String n=request.getParameter("email");  
		    String p=request.getParameter("pwd");*/  
		    String n=request.getParameter("email"); 
		    String p=request.getParameter("pwd");  
		    
		    if(LoginDAO.validate(n, p)){  
		    	
		    			String n1=request.getParameter("email");
		    			String p1=request.getParameter("pwd");
		    	      String ad="admin@prakat.in";
		 		      String pwd="admin";
		 		     System.out.println("valid mail");
		 		      if(n1.equals(ad) && p1.equals(pwd)) {
					  System.out.println("valid  admin mail");
					  RequestDispatcher rd=request.getRequestDispatcher("admin.jsp");
					  rd.include(request,response);
				    	}
				  else { ArrayList a = null;
			             SwollenAnklesServlet.setEmailId(n);
		                 RequestDispatcher rd1=request.getRequestDispatcher("indexWithAngular.jsp");  
		                 SwollenAnklesServlet serv=new SwollenAnklesServlet();
		                 serv.setEmailId(n);
		                 rd1.include(request,response); 
				       }
		        }  
		    else{  
		    	request.setAttribute("error", "Sorry!! Invalid Email id or Password.");  
		    	request.getRequestDispatcher("/NewFile1.jsp").forward(request, response);
		    	
		    }  
		   // serv.createExcel(n);  
		    out.close();  
	}

}
