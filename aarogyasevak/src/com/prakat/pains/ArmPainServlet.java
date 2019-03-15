package com.prakat.pains;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;
import com.prakat.decisionTree.DiseaseBean;
import com.prakat.decisionTree.DiseaseDAO;
import com.prakat.decisionTree.RemarksDAO;

/**
 * 
 * Servlet implementation class ArmPainServlet
 */
@WebServlet(urlPatterns = {
		"/ArmPainUrl","/ArmPainUrl2","/ArmPainUrl3","/ArmPainUrl4",})
public class ArmPainServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ArmPainServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    ArmPainDAO app= new ArmPainDAO();
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String link = null;
		String quest = null;
		String disease="Arm Pain";
		String remarks=null;
		Gson gson=new Gson();
		String servletPath = request.getServletPath();
		switch (servletPath) {
			case "/ArmPainUrl":
				link = request.getParameter("s1");
				if (link.equalsIgnoreCase("link")) {
					app=new ArmPainDAO();
					response.setContentType("application/json");
					quest=gson.toJson(app.node1);
					response.getWriter().write(quest);
					disease="ArmPain";
				}
			case "/ArmPainUrl2":
				link = request.getParameter("s1");
				if (link.equalsIgnoreCase("injury")) {
					app=new ArmPainDAO();
					response.setContentType("application/json");
					quest=gson.toJson(app.node2);
					response.getWriter().write(quest);
					remarks=app.node2;
					System.out.println(remarks);
				}else if (link.equalsIgnoreCase("repetitive")) {
					app=new ArmPainDAO();
					response.setContentType("application/json");
					quest=gson.toJson(app.node3);
					response.getWriter().write(quest);
					remarks=app.node3;
					System.out.println(remarks);
				}else if (link.equalsIgnoreCase("neither")) {
					app=new ArmPainDAO();
					response.setContentType("application/json");
					quest=gson.toJson(app.node4);
					response.getWriter().write(quest);
					remarks=app.node4;
					System.out.println(remarks);
				}
			case "/ArmPainUrl3":
				link = request.getParameter("s1");
				if (link.equalsIgnoreCase("yes")) {
					app=new ArmPainDAO();
					response.setContentType("application/json");
					quest=gson.toJson(app.node5);
					response.getWriter().write(quest);
					remarks=app.node5;
				}else if (link.equalsIgnoreCase("no")) {
					app=new ArmPainDAO();
					response.setContentType("application/json");
					quest=gson.toJson(app.node6);
					response.getWriter().write(quest);
					remarks=app.node6;
				}
			case "/ArmPainUrl4":
				link = request.getParameter("s1");
				if (link.equalsIgnoreCase("localize")) {
					app=new ArmPainDAO();
					response.setContentType("application/json");
					quest=gson.toJson(app.node7);
					response.getWriter().write(quest);
				}else if (link.equalsIgnoreCase("shoot")) {
					app=new ArmPainDAO();
					response.setContentType("application/json");
					quest=gson.toJson(app.node8);
					response.getWriter().write(quest);
					remarks=app.node8;
					
				}
				else if (link.equalsIgnoreCase("extend")) {
					app=new ArmPainDAO();
					response.setContentType("application/json");
					quest=gson.toJson(app.node9);
					response.getWriter().write(quest);
					remarks=app.node9;
				}
				else if (link.equalsIgnoreCase("neither")) {
					app=new ArmPainDAO();
					response.setContentType("application/json");
					quest=gson.toJson(app.node10);
					response.getWriter().write(quest);
					remarks=app.node10;
				}

				DiseaseBean bean=new DiseaseBean();
				bean.setDisease(disease);
				bean.setRemarks(remarks);
				DiseaseDAO diseaseDAO=new DiseaseDAO();
				String diseasevalue=diseaseDAO.DiseaseValue(bean);
				RemarksDAO remarksDAO=new RemarksDAO();
				String  remarksvalue=remarksDAO.Remarks(bean);
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
