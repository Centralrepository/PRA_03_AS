package com.prakat.pains;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Iterator;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.prakat.decisionTree.DiseaseBean;
import com.prakat.decisionTree.DiseaseDAO;
import com.prakat.decisionTree.RemarksDAO;
/**
 * Servlet implementation class SwollenAnklesServlet
 */
@WebServlet(urlPatterns = {
		"/SwollenAnklesUrl","/SwollenAnkles2Url","/SwollenAnkles3Url","/SwollenAnkles4Url","/SwollenAnkles5Url","/SwollenAnkles6Url","/SwollenAnkles7Url"
		,"/SwollenAnkles8Url","/SwollenAnkles9Url","/SwollenAnkles10Url"})
public class SwollenAnklesServlet extends HttpServlet {
	ArrayList l=new ArrayList();
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SwollenAnklesServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
   SwollenAnklesDAO app=null;
   
   static String emailId;
   static String name;
   
 	
 	public static String getEmailId() {
 	return emailId;
 }

 public static void setEmailId(String emailId) {
 	SwollenAnklesServlet.emailId = emailId;
 }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		SwollenAnklesServlet s2=new SwollenAnklesServlet();
		String link = null;
		String quest = null;
		String remarks=null;
		String disease="SwollenAnkles";
		Gson gson=new Gson();
		String input=null;
		StringBuilder buffer=new StringBuilder();
		JsonParser parser=new JsonParser();
		String e1 = SwollenAnklesServlet.getEmailId();
		String servletPath = request.getServletPath();
		PrintWriter out=response.getWriter();
		ArrayList allQuestions=new ArrayList();
		/*String name=request.getParameter("ankles");
		System.out.println("value"+name);*/

		switch (servletPath) {
		case"/SwollenAnklesUrl":
			
			link = request.getParameter("s1");
			if (link.equalsIgnoreCase("affect")) {
				
				app=new SwollenAnklesDAO();
				response.setContentType("application/json");
				quest=gson.toJson(app.node1);
				response.getWriter().write(quest);
				disease="SwollenAnkles";
				String q1=app.node1;
				l.add(q1);	
			}
		case"/SwollenAnkles2Url":
		
			link = request.getParameter("s1");
			if (link.equalsIgnoreCase("suffer")) {
				
				app=new SwollenAnklesDAO();
				response.setContentType("application/json");
				quest=gson.toJson(app.node2);
				response.getWriter().write(quest);
				String q2=app.node2;
				l.add(q2);	
				
			}else if (link.equalsIgnoreCase("leg")) {
				app=new SwollenAnklesDAO();
				response.setContentType("application/json");
				quest=gson.toJson(app.node3);
				response.getWriter().write(quest);
				remarks=app.node3;
				String q3=app.node3;
				l.add(q3);	
			}
		case"/SwollenAnkles3Url":
			link = request.getParameter("s1");
			if (link.equalsIgnoreCase("either")) {
				app=new SwollenAnklesDAO();
				response.setContentType("application/json");
				quest=gson.toJson(app.node4);
				response.getWriter().write(quest);
				String q4=app.node4;
				l.add(q4);	
				
			}else if (link.equalsIgnoreCase("become")) {
				app=new SwollenAnklesDAO();
				response.setContentType("application/json");
				quest=gson.toJson(app.node5);
				response.getWriter().write(quest);
				remarks=app.node5;
				String q5=app.node5;
				l.add(q5);	
			}
		case"/SwollenAnkles4Url":
			link = request.getParameter("s1");
			if (link.equalsIgnoreCase("thrombos")) {
				app=new SwollenAnklesDAO();
				response.setContentType("application/json");
				quest=gson.toJson(app.node6);
				response.getWriter().write(quest);
				remarks=app.node6;
				String q6=app.node6;
				l.add(q6);	
				
			}else if (link.equalsIgnoreCase("weeks")) {
				app=new SwollenAnklesDAO();
				response.setContentType("application/json");
				quest=gson.toJson(app.node7);
				response.getWriter().write(quest);
				String q7=app.node7;
				l.add(q7);	
			}
		case"/SwollenAnkles5Url":
			link = request.getParameter("s1");
			if (link.equalsIgnoreCase("does")) {
				app=new SwollenAnklesDAO();
				response.setContentType("application/json");
				quest=gson.toJson(app.node8);
				response.getWriter().write(quest);
				String q8=app.node8;
				l.add(q8);	
				
			}else if (link.equalsIgnoreCase("did")) {
				app=new SwollenAnklesDAO();
				response.setContentType("application/json");
				quest=gson.toJson(app.node9);
				response.getWriter().write(quest);
				String q9=app.node9;
				l.add(q9);	
			}
		case"/SwollenAnkles6Url":
			link = request.getParameter("s1");
			if (link.equalsIgnoreCase("persist")) {
				app=new SwollenAnklesDAO();
				response.setContentType("application/json");
				quest=gson.toJson(app.node10);
				response.getWriter().write(quest);
				remarks=app.node10;
				String q10=app.node10;
				l.add(q10);	
				
			}else if (link.equalsIgnoreCase("current")) {
				app=new SwollenAnklesDAO();
				response.setContentType("application/json");
				quest=gson.toJson(app.node11);
				response.getWriter().write(quest);
				String q11=app.node11;
				l.add(q11);	
			}
		case"/SwollenAnkles7Url":
			link = request.getParameter("s1");
			if (link.equalsIgnoreCase("retain")) {
				app=new SwollenAnklesDAO();
				response.setContentType("application/json");
				quest=gson.toJson(app.node12);
				response.getWriter().write(quest);
				remarks=app.node12;
				String q12=app.node12;
				l.add(q12);	
				
			}else if (link.equalsIgnoreCase("fluid")) {
				app=new SwollenAnklesDAO();
				response.setContentType("application/json");
				quest=gson.toJson(app.node13);
				response.getWriter().write(quest);
				remarks=app.node13;
				String q13=app.node13;
				l.add(q13);	
			}
		case"/SwollenAnkles8Url":
			link = request.getParameter("s1");
			if (link.equalsIgnoreCase("several")) {
				app=new SwollenAnklesDAO();
				response.setContentType("application/json");
				quest=gson.toJson(app.node14);
				response.getWriter().write(quest);
				remarks=app.node14;
				String q14=app.node14;
				l.add(q14);	
			}
		case"/SwollenAnkles9Url":
			link = request.getParameter("s1");
			if (link.equalsIgnoreCase("side")) {
				app=new SwollenAnklesDAO();
				response.setContentType("application/json");
				quest=gson.toJson(app.node15);
				response.getWriter().write(quest);
				remarks=app.node15;
				String q15=app.node15;
				l.add(q15);	
				
			}else if (link.equalsIgnoreCase("have")) {
				app=new SwollenAnklesDAO();
				response.setContentType("application/json");
				quest=gson.toJson(app.node16);
				response.getWriter().write(quest);
				remarks=app.node16;
				String q16=app.node16;
				l.add(q16);	
			}
		case"/SwollenAnkles10Url":
			link = request.getParameter("s1");
			if (link.equalsIgnoreCase("vari")) {
				app=new SwollenAnklesDAO();
				response.setContentType("application/json");
				quest=gson.toJson(app.node17);
				response.getWriter().write(quest);
				String q17=app.node17;
				l.add(q17);	
				
			}else if (link.equalsIgnoreCase("chart")) {
				app=new SwollenAnklesDAO();
				response.setContentType("application/json");
				quest=gson.toJson(app.node18);
				response.getWriter().write(quest);
				remarks=app.node18;
				String q18=app.node18;
				l.add(q18);	
			}
			DiseaseBean bean=new DiseaseBean();
			bean.setDisease(disease);
			bean.setRemarks(remarks);
			DiseaseDAO diseaseDAO=new DiseaseDAO();
			String diseasevalue=diseaseDAO.DiseaseValue(bean);
			RemarksDAO remarksDAO=new RemarksDAO();
			String  remarksvalue=remarksDAO.Remarks(bean);

		
		}//end of switch  caase
		SwollenAnkles serv=new SwollenAnkles();
		serv.setList(l);
		serv.createExcel(e1,l);
		
	}
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);

	}

}
