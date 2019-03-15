package com.prakat.decisionTree;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;



/**
 * Servlet implementation class HeadacheServlet
 */
@WebServlet(urlPatterns = {
		"/ControllerUrl", "/rootUrl","/root1Url","/root2Url","/root3Url","/root4Url","/root5Url","/root6Url","/root7Url","/root8Url","/root9Url"
		})
public class HeadacheServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
    
	public HeadacheServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter pw = null;
		String link = null;
		String disease=null;
		String quest = null;
		Gson gson=new Gson();
		String servletPath = request.getServletPath();
		DecisionTreeApp1 app = new DecisionTreeApp1();
		pw = response.getWriter();
		response.setContentType("text/html");
		
		

		switch (servletPath) {
		case "/ControllerUrl":
			link=request.getParameter("s1");
			if (link.equalsIgnoreCase("link")) {
				response.setContentType("application/json");
				quest=gson.toJson(DecisionTreeApp1.node1);
				response.getWriter().write(quest);
				disease="Headache";
				
			}
		
			break;
		case "/rootUrl":
			link = request.getParameter("r");
			if (link.equalsIgnoreCase("link1")) {
				response.setContentType("application/json");
				quest=gson.toJson(DecisionTreeApp1.node2);
				response.getWriter().write(quest);
		
			} else if (link.equalsIgnoreCase("link2")) {
				response.setContentType("application/json");
				quest=gson.toJson(DecisionTreeApp1.node3);
				response.getWriter().write(quest);
				
			}
			break;
		case "/root1Url":
			link = request.getParameter("r1");
			if (link.equalsIgnoreCase("injury1")) {
				response.setContentType("application/json");
				quest=gson.toJson(DecisionTreeApp1.node4);
				response.getWriter().write(quest);
				/*String node=DecisionTreeApp1.node4;
				System.out.println(node);*/
				

			} else if (link.equalsIgnoreCase("injury2")) {
				response.setContentType("application/json");
				quest=gson.toJson(DecisionTreeApp1.node5);
				response.getWriter().write(quest);
				
				
			}
			break;
		case "/root2Url":
			link = request.getParameter("r1");
			if (link.equalsIgnoreCase("fever1")) {
				response.setContentType("application/json");
				quest=gson.toJson(DecisionTreeApp1.node6);
				response.getWriter().write(quest);
				

			} else if (link.equalsIgnoreCase("fever2")) {
				
				response.setContentType("application/json");
				quest=gson.toJson(DecisionTreeApp1.node7);
				response.getWriter().write(quest);
				
			}
			break;
		case "/root3Url":
			link = request.getParameter("r1");
			if (link.equalsIgnoreCase("vomiting1")) {
				response.setContentType("application/json");
				quest=gson.toJson(DecisionTreeApp1.node8);
				response.getWriter().write(quest);
				
			} else if (link.equalsIgnoreCase("vomiting2")) {
				response.setContentType("application/json");
				quest=gson.toJson(DecisionTreeApp1.node9);
				response.getWriter().write(quest);
			
			}
			break;

		case "/root4Url":
			link = request.getParameter("r1");
			if (link.equalsIgnoreCase("vision1")) {
				response.setContentType("application/json");
				quest=gson.toJson(DecisionTreeApp1.node10);
				response.getWriter().write(quest);


			} else if (link.equalsIgnoreCase("vision2")) {
				
				response.setContentType("application/json");
				quest=gson.toJson(DecisionTreeApp1.node11);
				response.getWriter().write(quest);
	
			}
			break;

		case "/root5Url":
			link = request.getParameter("r1");
			if (link.equalsIgnoreCase("shown1")) {
				response.setContentType("application/json");
				quest=gson.toJson(DecisionTreeApp1.node12);
				response.getWriter().write(quest);
		

			} else if (link.equalsIgnoreCase("shown2")) {
				response.setContentType("application/json");
				quest=gson.toJson(DecisionTreeApp1.node13);
				response.getWriter().write(quest);


			}
			break;

		case "/root6Url":
			link = request.getParameter("r1");
			if (link.equalsIgnoreCase("runnyNose1")) {
				response.setContentType("application/json");
				quest=gson.toJson(DecisionTreeApp1.node14);
				response.getWriter().write(quest);
			
			} else if (link.equalsIgnoreCase("runnyNose2")) {
				response.setContentType("application/json");
				quest=gson.toJson(DecisionTreeApp1.node15);
				response.getWriter().write(quest);


			}
			break;

		case "/root7Url":
			link = request.getParameter("r1");
			if (link.equalsIgnoreCase("bothTemples1")) {
				response.setContentType("application/json");
				quest=gson.toJson(DecisionTreeApp1.node16);
				response.getWriter().write(quest);


			} else if (link.equalsIgnoreCase("bothTemples2")) {
				response.setContentType("application/json");
				quest=gson.toJson(DecisionTreeApp1.node17);
				response.getWriter().write(quest);
	
			}
			break;

		case "/root8Url":
			link = request.getParameter("r1");
			if (link.equalsIgnoreCase("medication1")) {
				response.setContentType("application/json");
				quest=gson.toJson(DecisionTreeApp1.node18);
				response.getWriter().write(quest);
				


			} else if (link.equalsIgnoreCase("medication2")) {
				response.setContentType("application/json");
				quest=gson.toJson(DecisionTreeApp1.node19);
				response.getWriter().write(quest);
				
			

			}
			break;
		case "/root9Url":
			link = request.getParameter("r1");
			if (link.equalsIgnoreCase("recurrent1")) {
				response.setContentType("application/json");
				quest=gson.toJson(DecisionTreeApp1.node20);
				response.getWriter().write(quest);
				
			} else if (link.equalsIgnoreCase("recurrent2")) {
				response.setContentType("application/json");
				quest=gson.toJson(DecisionTreeApp1.node21);
				response.getWriter().write(quest);
				
			
			}
			DiseaseBean bean=new DiseaseBean();
			System.out.println("Creation is comming bean..!!");
			bean.setDisease(disease);
			DiseaseDAO diseaseDAO=new DiseaseDAO();
			System.out.println("DAO is comming...!!");
			String diseasevalue=diseaseDAO.DiseaseValue(bean);
		
		}//end off switch case
		
		
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
