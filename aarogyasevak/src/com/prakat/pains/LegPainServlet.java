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
 * Servlet implementation class LegPainServlet
 */
@WebServlet(urlPatterns = {
		"/LegPainUrl","/LegPainUrl2","/LegPainUrl3","/LegPainUrl4",})
public class LegPainServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LegPainServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    LegPainDAO app=new LegPainDAO();
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String link = null;
		String quest = null;
		String remarks=null;
		String disease="LegPain";
		Gson gson=new Gson();
		String servletPath = request.getServletPath();
		switch (servletPath) {
			case "/LegPainUrl":
				link = request.getParameter("s1");
				if (link.equalsIgnoreCase("link")) {
					app=new LegPainDAO();
					response.setContentType("application/json");
					quest=gson.toJson(app.node1);
					response.getWriter().write(quest);
					disease="LegPain";
					remarks=app.node1;
				}
			case "/LegPainUrl2":
				link = request.getParameter("s1");
				if (link.equalsIgnoreCase("injury")) {
					app=new LegPainDAO();
					response.setContentType("application/json");
					quest=gson.toJson(app.node2);
					response.getWriter().write(quest);
					remarks=app.node2;
				}else if (link.equalsIgnoreCase("exercise")) {
					app=new LegPainDAO();
					response.setContentType("application/json");
					quest=gson.toJson(app.node3);
					response.getWriter().write(quest);
				}else if (link.equalsIgnoreCase("neither")) {
					app=new LegPainDAO();
					response.setContentType("application/json");
					quest=gson.toJson(app.node4);
					response.getWriter().write(quest);
					remarks=app.node4;
				}
			case "/LegPainUrl3":
				link = request.getParameter("s1");
				if (link.equalsIgnoreCase("red")) {
					app=new LegPainDAO();
					response.setContentType("application/json");
					quest=gson.toJson(app.node5);
					response.getWriter().write(quest);
					remarks=app.node5;
				}else if (link.equalsIgnoreCase("sudden")) {
					app=new LegPainDAO();
					response.setContentType("application/json");
					quest=gson.toJson(app.node6);
					response.getWriter().write(quest);
					remarks=app.node6;
				}else if (link.equalsIgnoreCase("constant")) {
					app=new LegPainDAO();
					response.setContentType("application/json");
					quest=gson.toJson(app.node7);
					response.getWriter().write(quest);
					remarks=app.node7;
				}else if (link.equalsIgnoreCase("shooting")) {
					app=new LegPainDAO();
					response.setContentType("application/json");
					quest=gson.toJson(app.node8);
					response.getWriter().write(quest);
				}else if (link.equalsIgnoreCase("heavy")) {
					app=new LegPainDAO();
					response.setContentType("application/json");
					quest=gson.toJson(app.node9);
					response.getWriter().write(quest);
					remarks=app.node9;
				}else if (link.equalsIgnoreCase("none")) {
					app=new LegPainDAO();
					response.setContentType("application/json");
					quest=gson.toJson(app.node10);
					response.getWriter().write(quest);
					remarks=app.node10;
				}
			case "/LegPainUrl4":
				link = request.getParameter("s1");
				if (link.equalsIgnoreCase("yes")) {
					app=new LegPainDAO();
					response.setContentType("application/json");
					quest=gson.toJson(app.node11);
					response.getWriter().write(quest);
					remarks=app.node11;
				}else if (link.equalsIgnoreCase("no")) {
					app=new LegPainDAO();
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
