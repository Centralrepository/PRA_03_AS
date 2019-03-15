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
 * Servlet implementation class JointsPainServlet
 */
@WebServlet(urlPatterns = {
		"/JointsPainUrl","/JointsPainUrl2","/JointsPainUrl3","/JointsPainUrl4","/JointsPainUrl5","/JointsPainUrl6","/JointsPainUrl7","/JointsPainUrl8","/JointsPainUrl9","/JointsPainUrl10"})
public class JointsPainServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public JointsPainServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    JointsPainDAO app= new JointsPainDAO();
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String link = null;
		String quest = null;
		String remarks=null;
		String disease="JointsPain";
		Gson gson=new Gson();
		String servletPath = request.getServletPath();
		switch (servletPath) {
			case "/JointsPainUrl":
				link = request.getParameter("s1");
				if (link.equalsIgnoreCase("link")) {
					app=new JointsPainDAO();
					response.setContentType("application/json");
					quest=gson.toJson(app.node1);
					response.getWriter().write(quest);
					disease="JointsPain";
				}
			case "/JointsPainUrl2":
				link = request.getParameter("s1");
				if (link.equalsIgnoreCase("injury")) {
					app=new JointsPainDAO();
					response.setContentType("application/json");
					quest=gson.toJson(app.node2);
					response.getWriter().write(quest);
				}else if (link.equalsIgnoreCase("noInjury")) {
					app=new JointsPainDAO();
					response.setContentType("application/json");
					quest=gson.toJson(app.node3);
					response.getWriter().write(quest);
					remarks=app.node3;
				}
			case "/JointsPainUrl3":
				link = request.getParameter("s1");
				if (link.equalsIgnoreCase("either")) {
					app=new JointsPainDAO();
					response.setContentType("application/json");
					quest=gson.toJson(app.node4);
					response.getWriter().write(quest);
					remarks=app.node4;
				}else if (link.equalsIgnoreCase("neither")) {
					app=new JointsPainDAO();
					response.setContentType("application/json");
					quest=gson.toJson(app.node5);
					response.getWriter().write(quest);
					remarks=app.node5;
				}
			case "/JointsPainUrl4":
				link = request.getParameter("s1");
				if (link.equalsIgnoreCase("either1")) {
					app=new JointsPainDAO();
					response.setContentType("application/json");
					quest=gson.toJson(app.node6);
					response.getWriter().write(quest);
				}else if (link.equalsIgnoreCase("neither1")) {
					app=new JointsPainDAO();
					response.setContentType("application/json");
					quest=gson.toJson(app.node7);
					response.getWriter().write(quest);
				}
			case "/JointsPainUrl5":
				link = request.getParameter("s1");
				if (link.equalsIgnoreCase("one")) {
					app=new JointsPainDAO();
					response.setContentType("application/json");
					quest=gson.toJson(app.node8);
					response.getWriter().write(quest);
				}else if (link.equalsIgnoreCase("more")) {
					app=new JointsPainDAO();
					response.setContentType("application/json");
					quest=gson.toJson(app.node9);
					response.getWriter().write(quest);
					remarks=app.node9;
				}
			case "/JointsPainUrl6":
				link = request.getParameter("s1");
				if (link.equalsIgnoreCase("considerably")) {
					app=new JointsPainDAO();
					response.setContentType("application/json");
					quest=gson.toJson(app.node10);
					response.getWriter().write(quest);
				}else if (link.equalsIgnoreCase("slightly")) {
					app=new JointsPainDAO();
					response.setContentType("application/json");
					quest=gson.toJson(app.node11);
					response.getWriter().write(quest);
				}
			case "/JointsPainUrl7":
				link = request.getParameter("s1");
				if (link.equalsIgnoreCase("with")) {
					app=new JointsPainDAO();
					response.setContentType("application/json");
					quest=gson.toJson(app.node12);
					response.getWriter().write(quest);
				}else if (link.equalsIgnoreCase("without")) {
					app=new JointsPainDAO();
					response.setContentType("application/json");
					quest=gson.toJson(app.node13);
					response.getWriter().write(quest);
					remarks=app.node13;
				}
				else if (link.equalsIgnoreCase("neither2")) {
					app=new JointsPainDAO();
					response.setContentType("application/json");
					quest=gson.toJson(app.node14);
					response.getWriter().write(quest);
					remarks=app.node14;
				}
			case "/JointsPainUrl8":
				link = request.getParameter("s1");
				if (link.equalsIgnoreCase("hip")) {
					app=new JointsPainDAO();
					response.setContentType("application/json");
					quest=gson.toJson(app.node15);
					response.getWriter().write(quest);
					remarks=app.node15;
				}else if (link.equalsIgnoreCase("shoulder")) {
					app=new JointsPainDAO();
					response.setContentType("application/json");
					quest=gson.toJson(app.node16);
					response.getWriter().write(quest);
				}
				else if (link.equalsIgnoreCase("other")) {
					app=new JointsPainDAO();
					response.setContentType("application/json");
					quest=gson.toJson(app.node17);
					response.getWriter().write(quest);
					remarks=app.node17;
				}
			case "/JointsPainUrl9":
				link = request.getParameter("s1");
				if (link.equalsIgnoreCase("yes")) {
					app=new JointsPainDAO();
					response.setContentType("application/json");
					quest=gson.toJson(app.node18);
					response.getWriter().write(quest);
					remarks=app.node18;
				}else if (link.equalsIgnoreCase("no")) {
					app=new JointsPainDAO();
					response.setContentType("application/json");
					quest=gson.toJson(app.node19);
					response.getWriter().write(quest);
					remarks=app.node19;
				}
			case "/JointsPainUrl10":
				link = request.getParameter("s1");
				if (link.equalsIgnoreCase("under")) {
					app=new JointsPainDAO();
					response.setContentType("application/json");
					quest=gson.toJson(app.node20);
					response.getWriter().write(quest);
					remarks=app.node20;
				}else if (link.equalsIgnoreCase("over")) {
					app=new JointsPainDAO();
					response.setContentType("application/json");
					quest=gson.toJson(app.node19);
					response.getWriter().write(quest);
					remarks=app.node19;
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
