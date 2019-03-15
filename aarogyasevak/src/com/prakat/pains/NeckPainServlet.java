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
 * Servlet implementation class NeckPainServlet
 */
@WebServlet(urlPatterns = {
		"/NeckPainUrl","/NeckPainUrl2","/NeckPainUrl3","/NeckPainUrl4","/NeckPainUrl5","/NeckPainUrl6","/NeckPainUrl7","/NeckPainUrl8","/NeckPainUrl9"
		,"/NeckPainUrl10","/NeckPainUrl11","/NeckPainUrl12","/NeckPainUrl13","/NeckPainUrl14","/NeckPainUrl15","/NeckPainUrl16","/NeckPainUrl17","/NeckPainUrl18","/NeckPainUrl19"})
public class NeckPainServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public NeckPainServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    NeckPainDAO app=null;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String link = null;
		String quest = null;
		String remarks=null;
		String disease="NeckPain";
		Gson gson=new Gson();
		String servletPath = request.getServletPath();
		switch (servletPath) {
			case "/NeckPainUrl":
				link = request.getParameter("s1");
				if (link.equalsIgnoreCase("link")) {
					app=new NeckPainDAO();
					response.setContentType("application/json");
					quest=gson.toJson(app.node1);
					response.getWriter().write(quest);
					disease="NeckPain";
				}
			case "/NeckPainUrl2":
				link = request.getParameter("s1");
				if (link.equalsIgnoreCase("less24")) {
					app=new NeckPainDAO();
					response.setContentType("application/json");
					quest=gson.toJson(app.node2);
					response.getWriter().write(quest);
				}else if (link.equalsIgnoreCase("more24")) {
					app=new NeckPainDAO();
					response.setContentType("application/json");
					quest=gson.toJson(app.node3);
					response.getWriter().write(quest);
				}
			case "/NeckPainUrl3":
				link = request.getParameter("s1");
				if (link.equalsIgnoreCase("neckInjury")) {
					app=new NeckPainDAO();
					response.setContentType("application/json");
					quest=gson.toJson(app.node4);
					response.getWriter().write(quest);
				}else if (link.equalsIgnoreCase("noNeckInjury")) {
					app=new NeckPainDAO();
					response.setContentType("application/json");
					quest=gson.toJson(app.node5);
					response.getWriter().write(quest);
					remarks=app.node5;
				}
			case "/NeckPainUrl4":
				link = request.getParameter("s1");
				if (link.equalsIgnoreCase("either")) {
					app=new NeckPainDAO();
					response.setContentType("application/json");
					quest=gson.toJson(app.node6);
					remarks=app.node6;
					response.getWriter().write(quest);
				}else if (link.equalsIgnoreCase("neither")) {
					app=new NeckPainDAO();
					response.setContentType("application/json");
					quest=gson.toJson(app.node7);
					response.getWriter().write(quest);
					remarks=app.node7;
				}
			case "/NeckPainUrl5":
				link = request.getParameter("s1");
				if (link.equalsIgnoreCase("either1")) {
					app=new NeckPainDAO();
					response.setContentType("application/json");
					quest=gson.toJson(app.node8);
					response.getWriter().write(quest);
					remarks=app.node8;
				}else if (link.equalsIgnoreCase("neither1")) {
					app=new NeckPainDAO();
					response.setContentType("application/json");
					quest=gson.toJson(app.node9);
					response.getWriter().write(quest);
					remarks=app.node9;
				}
			case "/NeckPainUrl6":
				link = request.getParameter("s1");
				if (link.equalsIgnoreCase("either2")) {
					app=new NeckPainDAO();
					response.setContentType("application/json");
					quest=gson.toJson(app.node10);
					response.getWriter().write(quest);
					remarks=app.node10;
				}else if (link.equalsIgnoreCase("neither2")) {
					app=new NeckPainDAO();
					response.setContentType("application/json");
					quest=gson.toJson(app.node11);
					response.getWriter().write(quest);
					remarks=app.node11;
				}
			case "/NeckPainUrl7":
				link = request.getParameter("s1");
				if (link.equalsIgnoreCase("either3")) {
					app=new NeckPainDAO();
					response.setContentType("application/json");
					quest=gson.toJson(app.node12);
					response.getWriter().write(quest);
					remarks=app.node12;
				}else if (link.equalsIgnoreCase("neither3")) {
					app=new NeckPainDAO();
					response.setContentType("application/json");
					quest=gson.toJson(app.node13);
					response.getWriter().write(quest);
					remarks=app.node13;
				}
			case "/NeckPainUrl8":
				link = request.getParameter("s1");
				if (link.equalsIgnoreCase("yes")) {
					app=new NeckPainDAO();
					response.setContentType("application/json");
					quest=gson.toJson(app.node14);
					response.getWriter().write(quest);
					remarks=app.node14;
				}else if (link.equalsIgnoreCase("no")) {
					app=new NeckPainDAO();
					response.setContentType("application/json");
					quest=gson.toJson(app.node33);
					response.getWriter().write(quest);
				}
			case "/NeckPainUrl9":
				link = request.getParameter("s1");
				if (link.equalsIgnoreCase("red")) {
					app=new NeckPainDAO();
					response.setContentType("application/json");
					quest=gson.toJson(app.node15);
					response.getWriter().write(quest);
					remarks=app.node15;
				}else if (link.equalsIgnoreCase("other")) {
					app=new NeckPainDAO();
					response.setContentType("application/json");
					quest=gson.toJson(app.node16);
					response.getWriter().write(quest);
					remarks=app.node16;
				}
			case "/NeckPainUrl10":
				link = request.getParameter("s1");
				if (link.equalsIgnoreCase("either4")) {
					app=new NeckPainDAO();
					response.setContentType("application/json");
					quest=gson.toJson(app.node34);
					response.getWriter().write(quest);
				}else if (link.equalsIgnoreCase("neither4")) {
					app=new NeckPainDAO();
					response.setContentType("application/json");
					quest=gson.toJson(app.node7);
					response.getWriter().write(quest);
				}
			case "/NeckPainUrl11":
				link = request.getParameter("s1");
				if (link.equalsIgnoreCase("oneArea")) {
					app=new NeckPainDAO();
					response.setContentType("application/json");
					quest=gson.toJson(app.node17);
					response.getWriter().write(quest);
				}else if (link.equalsIgnoreCase("severalArea")) {
					app=new NeckPainDAO();
					response.setContentType("application/json");
					quest=gson.toJson(app.node18);
					response.getWriter().write(quest);
					remarks=app.node18;
				}
			case "/NeckPainUrl12":
				link = request.getParameter("s1");
				if (link.equalsIgnoreCase("soreThroat")) {
					app=new NeckPainDAO();
					response.setContentType("application/json");
					quest=gson.toJson(app.node18);
					remarks=app.node18;
					response.getWriter().write(quest);
				}else if (link.equalsIgnoreCase("noSoreThroat")) {
					app=new NeckPainDAO();
					response.setContentType("application/json");
					quest=gson.toJson(app.node7);
					response.getWriter().write(quest);
				}
			case "/NeckPainUrl13":
				link = request.getParameter("s1");
				if (link.equalsIgnoreCase("fever")) {
					app=new NeckPainDAO();
					response.setContentType("application/json");
					quest=gson.toJson(app.node20);
					response.getWriter().write(quest);
				}else if (link.equalsIgnoreCase("noFever")) {
					app=new NeckPainDAO();
					response.setContentType("application/json");
					quest=gson.toJson(app.node21);
					response.getWriter().write(quest);
				}
			case "/NeckPainUrl14":
				link = request.getParameter("s1");
				if (link.equalsIgnoreCase("fever1")) {
					app=new NeckPainDAO();
					response.setContentType("application/json");
					quest=gson.toJson(app.node22);
					response.getWriter().write(quest);
				}else if (link.equalsIgnoreCase("noFever1")) {
					app=new NeckPainDAO();
					response.setContentType("application/json");
					quest=gson.toJson(app.node23);
					response.getWriter().write(quest);
					remarks=app.node23;
				}
			case "/NeckPainUrl15":
				link = request.getParameter("s1");
				if (link.equalsIgnoreCase("injury")) {
					app=new NeckPainDAO();
					response.setContentType("application/json");
					quest=gson.toJson(app.node24);
					response.getWriter().write(quest);
				}else if (link.equalsIgnoreCase("noInjury")) {
					app=new NeckPainDAO();
					response.setContentType("application/json");
					quest=gson.toJson(app.node7);
					response.getWriter().write(quest);
				}
			case "/NeckPainUrl16":
				link = request.getParameter("s1");
				if (link.equalsIgnoreCase("rash")) {
					app=new NeckPainDAO();
					response.setContentType("application/json");
					quest=gson.toJson(app.node25);
					response.getWriter().write(quest);
					remarks=app.node25;
				}else if (link.equalsIgnoreCase("noRash")) {
					app=new NeckPainDAO();
					response.setContentType("application/json");
					quest=gson.toJson(app.node26);
					response.getWriter().write(quest);
					remarks=app.node26;
				}
			case "/NeckPainUrl17":
				link = request.getParameter("s1");
				if (link.equalsIgnoreCase("yes1")) {
					app=new NeckPainDAO();
					response.setContentType("application/json");
					quest=gson.toJson(app.node27);
					response.getWriter().write(quest);
					remarks=app.node27;
				}else if (link.equalsIgnoreCase("no1")) {
					app=new NeckPainDAO();
					response.setContentType("application/json");
					quest=gson.toJson(app.node28);
					response.getWriter().write(quest);
				}
			case "/NeckPainUrl18":
				link = request.getParameter("s1");
				if (link.equalsIgnoreCase("yes2")) {
					app=new NeckPainDAO();
					response.setContentType("application/json");
					quest=gson.toJson(app.node29);
					response.getWriter().write(quest);
				}else if (link.equalsIgnoreCase("no2")) {
					app=new NeckPainDAO();
					response.setContentType("application/json");
					quest=gson.toJson(app.node30);
					response.getWriter().write(quest);
				}
			case "/NeckPainUrl19":
				link = request.getParameter("s1");
				if (link.equalsIgnoreCase("yes3")) {
					app=new NeckPainDAO();
					response.setContentType("application/json");
					quest=gson.toJson(app.node31);
					response.getWriter().write(quest);
					remarks=app.node31;
				}else if (link.equalsIgnoreCase("no3")) {
					app=new NeckPainDAO();
					response.setContentType("application/json");
					quest=gson.toJson(app.node32);
					response.getWriter().write(quest);
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
