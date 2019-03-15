package com.prakat.login;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Login
 */
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegisterServlet() {
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
	String pwd=null;
	String msg=null;
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");  
	    PrintWriter out = response.getWriter();
	    String email = request.getParameter("emailId");
	    String name=request.getParameter("name");
	    System.out.println(name);
	   pwd=getRandomNumber();
	   
	   RegisterBean bean= new RegisterBean();
	   bean.setEmail(email);
	   bean.setPwd(pwd);
	   bean.setName(name);
	   RegisterDAO registerDAO= new RegisterDAO();
	  String userRegistered=registerDAO.registerUser(bean);
	  if(userRegistered.equals("SUCCESS"))   //On success, you can display a message to user on Home page
	  {
		 msg = " SignUp Success!! Please Log in. Password has already been sent to your email id.";
		 request.setAttribute("msg", msg);
		// request.getRequestDispatcher("/Home.jsp").forward(request, response);
		 request.getRequestDispatcher("/NewFile1.jsp").forward(request, response);
	  }
	  else   //On Failure, display a meaningful message to the User.
	  {
		  msg = "SignUp Failed!! Email Id is already registered.";
		  request.setAttribute("msg", msg);
		  //request.getRequestDispatcher("/Home.jsp").forward(request, response);
		  request.getRequestDispatcher("/NewFile1.jsp").forward(request, response);
	  }
	}
	
	
	public static String getRandomNumber() {
	StringBuffer buffer = new StringBuffer();
    Random random = new Random();
    char[] chars = new char[] { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h',
            'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't',
            'u', 'v', 'w', 'x', 'y', 'z', 'A', 'B', 'C', 'D', 'E', 'F',
            'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R',
            'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', '1', '2', '3', '4',
            '5', '6', '7', '8', '9', '0' };
    for (int i = 0; i <8; i++) {
        buffer.append(chars[random.nextInt(chars.length)]);
    }
    return buffer.toString();
	}

}
