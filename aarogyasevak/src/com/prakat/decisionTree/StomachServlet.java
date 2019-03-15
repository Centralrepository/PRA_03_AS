package com.prakat.decisionTree;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

/**
 * Servlet implementation class StomachServlet
 */
@WebServlet(urlPatterns = {
		"/StomachUrl","/Quest2Url","/Quest3Url","/Quest4Url","/Quest5Url","/Quest6Url","/Quest7Url","/Quest8Url",
		"/StomachMaleUrl","/StomachMaleUrl1","/StomachMaleUrl2","/StomachMaleUrl3","/StomachMaleUrl4","/StomachMaleUrl5","/StomachMaleUrl6","/StomachMaleUrl7",
		"/StomachRecMaleUrl1","/StomachRecMaleUrl2","/StomachRecMaleUrl3","/StomachRecMaleUrl4","/StomachRecMaleUrl5","/StomachRecMaleUrl6","/StomachRecMaleUrl7","/StomachRecMaleUrl8",
		"/StomachFemaleUrl1","/StomachFemaleUrl2","/StomachFemaleUrl3","/StomachFemaleUrl4","/StomachFemaleUrl5","/StomachFemaleUrl6","/StomachFemaleUrl7","/StomachFemaleUrl8",
		"/StomachLGBTUrl"})
public class StomachServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public StomachServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    StomachDAO app=null;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String link = null;
		String quest = null;
		String disease="Stomache";
		Gson gson=new Gson();
		String servletPath = request.getServletPath();
		switch (servletPath) {
			case "/StomachUrl":
				link = request.getParameter("s1");
				if (link.equalsIgnoreCase("link")) {
					app=new StomachDAO();
					response.setContentType("application/json");
					quest=gson.toJson(app.node50);
					response.getWriter().write(quest);
				}
			case "/Quest2Url":
				link=request.getParameter("s1");
				if (link.equalsIgnoreCase("link1")) {
					app=new StomachDAO();
					response.setContentType("application/json");
					quest=gson.toJson(app.node51);
					response.getWriter().write(quest);
					
				}else if (link.equalsIgnoreCase("link2")) {
					app=new StomachDAO();
					response.setContentType("application/json");
					quest=gson.toJson(app.node52);
					response.getWriter().write(quest);
				}
			case "/Quest3Url":
				link=request.getParameter("s1");
				if (link.equalsIgnoreCase("continuousPain")) {
					app=new StomachDAO();
					response.setContentType("application/json");
					quest=gson.toJson(app.node53);
					response.getWriter().write(quest);
					
				}else if (link.equalsIgnoreCase("bloodInFeces")) {
					app=new StomachDAO();
					response.setContentType("application/json");
					quest=gson.toJson(app.node54);
					response.getWriter().write(quest);
				}else if (link.equalsIgnoreCase("greenishVomit")) {
					app=new StomachDAO();
					response.setContentType("application/json");
					quest=gson.toJson(app.node55);
					response.getWriter().write(quest);
				}
				else if (link.equalsIgnoreCase("noneOf")) {
					app=new StomachDAO();
					response.setContentType("application/json");
					quest=gson.toJson(app.node56);
					response.getWriter().write(quest);
				}
				
			case "/Quest4Url":
				link=request.getParameter("s1");
				if (link.equalsIgnoreCase("yes1")) {
					app=new StomachDAO();
					response.setContentType("application/json");
					quest=gson.toJson(app.node58);
					response.getWriter().write(quest);
					
				}else if (link.equalsIgnoreCase("no1")) {
					app=new StomachDAO();
					response.setContentType("application/json");
					quest=gson.toJson(app.node57);
					response.getWriter().write(quest);
				}
			case "/Quest5Url":
				link=request.getParameter("s1");
				if (link.equalsIgnoreCase("yes2")) {
					app=new StomachDAO();
					response.setContentType("application/json");
					quest=gson.toJson(app.node58);
					response.getWriter().write(quest);
					
				}else if (link.equalsIgnoreCase("no2")) {
					app=new StomachDAO();
					response.setContentType("application/json");
					quest=gson.toJson(app.node59);
					response.getWriter().write(quest);
				}
			case "/Quest6Url":
				link=request.getParameter("s1");
				if (link.equalsIgnoreCase("yes3")) {
					app=new StomachDAO();
					response.setContentType("application/json");
					quest=gson.toJson(app.node60);
					response.getWriter().write(quest);
					
				}else if (link.equalsIgnoreCase("no3")) {
					app=new StomachDAO();
					response.setContentType("application/json");
					quest=gson.toJson(app.node61);
					response.getWriter().write(quest);
				}
			case "/Quest7Url":
				link=request.getParameter("s1");
				if (link.equalsIgnoreCase("yes4")) {
					app=new StomachDAO();
					response.setContentType("application/json");
					quest=gson.toJson(app.node62);
					response.getWriter().write(quest);
					
				}else if (link.equalsIgnoreCase("no4")) {
					app=new StomachDAO();
					response.setContentType("application/json");
					quest=gson.toJson(app.node63);
					response.getWriter().write(quest);
				}
			case "/Quest8Url":
				link=request.getParameter("s1");
				if (link.equalsIgnoreCase("yes5")) {
					app=new StomachDAO();
					response.setContentType("application/json");
					quest=gson.toJson(app.node64);
					response.getWriter().write(quest);
					
				}else if (link.equalsIgnoreCase("no5")) {
					app=new StomachDAO();
					response.setContentType("application/json");
					quest=gson.toJson(app.node65);
					response.getWriter().write(quest);
				}

			case "/StomachMaleUrl":
				link = request.getParameter("s1");
				if (link.equalsIgnoreCase("questM1")) {
					app=new StomachDAO();
					response.setContentType("application/json");
					quest=gson.toJson(app.node1);
					response.getWriter().write(quest);
				}
			case "/StomachMaleUrl1":
				link=request.getParameter("s1");
				if (link.equalsIgnoreCase("yes6")) {
					app=new StomachDAO();
					response.setContentType("application/json");
					quest=gson.toJson(app.node2);
					response.getWriter().write(quest);
					
				}else if (link.equalsIgnoreCase("no6")) {
					app=new StomachDAO();
					response.setContentType("application/json");
					quest=gson.toJson(app.node16);
					response.getWriter().write(quest);
				}
			case "/StomachMaleUrl2":
				link=request.getParameter("s1");
				if (link.equalsIgnoreCase("severe")) {
					app=new StomachDAO();
					response.setContentType("application/json");
					quest=gson.toJson(app.node3);
					response.getWriter().write(quest);
					
				}else if (link.equalsIgnoreCase("mild")) {
					app=new StomachDAO();
					response.setContentType("application/json");
					quest=gson.toJson(app.node4);
					response.getWriter().write(quest);
				}
			case "/StomachMaleUrl3":
				link=request.getParameter("s1");
				if (link.equalsIgnoreCase("danger")) {
					app=new StomachDAO();
					response.setContentType("application/json");
					quest=gson.toJson(app.node5);
					response.getWriter().write(quest);
					
				}else if (link.equalsIgnoreCase("noDanger")) {
					app=new StomachDAO();
					response.setContentType("application/json");
					quest=gson.toJson(app.node4);
					response.getWriter().write(quest);
				}
			case "/StomachMaleUrl4":
				link=request.getParameter("s1");
				if (link.equalsIgnoreCase("diarrhea")) {
					app=new StomachDAO();
					response.setContentType("application/json");
					quest=gson.toJson(app.node6);
					response.getWriter().write(quest);
					
				}else if (link.equalsIgnoreCase("noDiarrhea")) {
					app=new StomachDAO();
					response.setContentType("application/json");
					quest=gson.toJson(app.node7);
					response.getWriter().write(quest);
				}
			case "/StomachMaleUrl5":
				link=request.getParameter("s1");
				if (link.equalsIgnoreCase("option1")) {
					app=new StomachDAO();
					response.setContentType("application/json");
					quest=gson.toJson(app.node8);
					response.getWriter().write(quest);
					
				}else if (link.equalsIgnoreCase("option2")) {
					app=new StomachDAO();
					response.setContentType("application/json");
					quest=gson.toJson(app.node9);
					response.getWriter().write(quest);
				}else if (link.equalsIgnoreCase("option3")) {
					app=new StomachDAO();
					response.setContentType("application/json");
					quest=gson.toJson(app.node10);
					response.getWriter().write(quest);
				}else if (link.equalsIgnoreCase("option4")) {
					app=new StomachDAO();
					response.setContentType("application/json");
					quest=gson.toJson(app.node11);
					response.getWriter().write(quest);
				}else if (link.equalsIgnoreCase("option5")) {
					app=new StomachDAO();
					response.setContentType("application/json");
					quest=gson.toJson(app.node12);
					response.getWriter().write(quest);
				}
			case "/StomachMaleUrl6":
				link=request.getParameter("s1");
				if (link.equalsIgnoreCase("yes7")) {
					app=new StomachDAO();
					response.setContentType("application/json");
					quest=gson.toJson(app.node13);
					response.getWriter().write(quest);
					
				}else if (link.equalsIgnoreCase("no7")) {
					app=new StomachDAO();
					response.setContentType("application/json");
					quest=gson.toJson(app.node14);
					response.getWriter().write(quest);
				}
			case "/StomachMaleUrl7":
				link=request.getParameter("s1");
				if (link.equalsIgnoreCase("yes8")) {
					app=new StomachDAO();
					response.setContentType("application/json");
					quest=gson.toJson(app.node15);
					response.getWriter().write(quest);
					
				}else if (link.equalsIgnoreCase("no8")) {
					app=new StomachDAO();
					response.setContentType("application/json");
					quest=gson.toJson(app.node12);
					response.getWriter().write(quest);
				}
				else if (link.equalsIgnoreCase("no8f")) {
					app=new StomachDAO();
					response.setContentType("application/json");
					quest=gson.toJson(app.node33);
					response.getWriter().write(quest);
				}
			case "/StomachRecMaleUrl1":
				link=request.getParameter("s1");
				if (link.equalsIgnoreCase("below")) {
					app=new StomachDAO();
					response.setContentType("application/json");
					quest=gson.toJson(app.node17);
					response.getWriter().write(quest);
					
				}else if (link.equalsIgnoreCase("above")) {
					app=new StomachDAO();
					response.setContentType("application/json");
					quest=gson.toJson(app.node18);
					response.getWriter().write(quest);
				}
			case "/StomachRecMaleUrl2":
				link=request.getParameter("s1");
				if (link.equalsIgnoreCase("recDiarrhea")) {
					app=new StomachDAO();
					response.setContentType("application/json");
					quest=gson.toJson(app.node19);
					response.getWriter().write(quest);
					
				}else if (link.equalsIgnoreCase("noRecDiarrhea")) {
					app=new StomachDAO();
					response.setContentType("application/json");
					quest=gson.toJson(app.node20);
					response.getWriter().write(quest);
				}
			case "/StomachRecMaleUrl3":
				link=request.getParameter("s1");
				if (link.equalsIgnoreCase("common")) {
					app=new StomachDAO();
					response.setContentType("application/json");
					quest=gson.toJson(app.node21);
					response.getWriter().write(quest);
					
				}else if (link.equalsIgnoreCase("upperRight")) {
					app=new StomachDAO();
					response.setContentType("application/json");
					quest=gson.toJson(app.node22);
					response.getWriter().write(quest);
				}else if (link.equalsIgnoreCase("none")) {
					app=new StomachDAO();
					response.setContentType("application/json");
					quest=gson.toJson(app.node23);
					response.getWriter().write(quest);
				}
			case "/StomachRecMaleUrl4":
				link=request.getParameter("s1");
				if (link.equalsIgnoreCase("common1")) {
					app=new StomachDAO();
					response.setContentType("application/json");
					quest=gson.toJson(app.node24);
					response.getWriter().write(quest);
					
				}else if (link.equalsIgnoreCase("none1")) {
					app=new StomachDAO();
					response.setContentType("application/json");
					quest=gson.toJson(app.node25);
					response.getWriter().write(quest);
				}
			case "/StomachRecMaleUrl5":
				link=request.getParameter("s1");
				if (link.equalsIgnoreCase("common2")) {
					app=new StomachDAO();
					response.setContentType("application/json");
					quest=gson.toJson(app.node26);
					response.getWriter().write(quest);
					
				}else if (link.equalsIgnoreCase("none2")) {
					app=new StomachDAO();
					response.setContentType("application/json");
					quest=gson.toJson(app.node27);
					response.getWriter().write(quest);
				}
			case "/StomachRecMaleUrl6":
				link=request.getParameter("s1");
				if (link.equalsIgnoreCase("common3")) {
					app=new StomachDAO();
					response.setContentType("application/json");
					quest=gson.toJson(app.node28);
					response.getWriter().write(quest);
					
				}else if (link.equalsIgnoreCase("none3")) {
					app=new StomachDAO();
					response.setContentType("application/json");
					quest=gson.toJson(app.node29);
					response.getWriter().write(quest);
				}
			case "/StomachRecMaleUrl7":
				link=request.getParameter("s1");
				if (link.equalsIgnoreCase("medi")) {
					app=new StomachDAO();
					response.setContentType("application/json");
					quest=gson.toJson(app.node30);
					response.getWriter().write(quest);
					
				}else if (link.equalsIgnoreCase("noMedi")) {
					app=new StomachDAO();
					response.setContentType("application/json");
					quest=gson.toJson(app.node31);
					response.getWriter().write(quest);
				}
			case "/StomachRecMaleUrl8":
				link=request.getParameter("s1");
				if (link.equalsIgnoreCase("common4")) {
					app=new StomachDAO();
					response.setContentType("application/json");
					quest=gson.toJson(app.node32);
					response.getWriter().write(quest);
					
				}else if (link.equalsIgnoreCase("none4")) {
					app=new StomachDAO();
					response.setContentType("application/json");
					quest=gson.toJson(app.node27);
					response.getWriter().write(quest);
				}else if (link.equalsIgnoreCase("fnone4")) {
					app=new StomachDAO();
					response.setContentType("application/json");
					quest=gson.toJson(app.node33);
					response.getWriter().write(quest);
				}
				
			case "/StomachFemaleUrl1":
				link=request.getParameter("s1");
				if (link.equalsIgnoreCase("fYes")) {
					app=new StomachDAO();
					response.setContentType("application/json");
					quest=gson.toJson(app.node34);
					response.getWriter().write(quest);
					
				}else if (link.equalsIgnoreCase("fNo")) {
					app=new StomachDAO();
					response.setContentType("application/json");
					quest=gson.toJson(app.node35);
					response.getWriter().write(quest);
				}
			case "/StomachFemaleUrl2":
				link=request.getParameter("s1");
				if (link.equalsIgnoreCase("fMore")) {
					app=new StomachDAO();
					response.setContentType("application/json");
					quest=gson.toJson(app.node36);
					response.getWriter().write(quest);
				}else if (link.equalsIgnoreCase("fLess")) {
					app=new StomachDAO();
					response.setContentType("application/json");
					quest=gson.toJson(app.node37);
					response.getWriter().write(quest);
				}else if (link.equalsIgnoreCase("fDont")) {
					app=new StomachDAO();
					response.setContentType("application/json");
					quest=gson.toJson(app.node38);
					response.getWriter().write(quest);
				}
			case "/StomachFemaleUrl3":
				link=request.getParameter("s1");
				if (link.equalsIgnoreCase("fYes1")) {
					app=new StomachDAO();
					response.setContentType("application/json");
					quest=gson.toJson(app.node39);
					response.getWriter().write(quest);
					
				}else if (link.equalsIgnoreCase("fNo1")) {
					app=new StomachDAO();
					response.setContentType("application/json");
					quest=gson.toJson(app.node40);
					response.getWriter().write(quest);
				}
			case "/StomachFemaleUrl4":
				link=request.getParameter("s1");
				if (link.equalsIgnoreCase("fCommon1")) {
					app=new StomachDAO();
					response.setContentType("application/json");
					quest=gson.toJson(app.node42);
					response.getWriter().write(quest);
					
				}else if (link.equalsIgnoreCase("fNone1")) {
					app=new StomachDAO();
					response.setContentType("application/json");
					quest=gson.toJson(app.node43);
					response.getWriter().write(quest);
				}
			case "/StomachFemaleUrl5":
				link=request.getParameter("s1");
				if (link.equalsIgnoreCase("fOntime")) {
					app=new StomachDAO();
					response.setContentType("application/json");
					quest=gson.toJson(app.node40);
					response.getWriter().write(quest);
					
				}else if (link.equalsIgnoreCase("fMissed")) {
					app=new StomachDAO();
					response.setContentType("application/json");
					quest=gson.toJson(app.node41);
					response.getWriter().write(quest);
				}
			case "/StomachFemaleUrl6":
				link=request.getParameter("s1");
				if (link.equalsIgnoreCase("fPre")) {
					app=new StomachDAO();
					response.setContentType("application/json");
					quest=gson.toJson(app.node44);
					response.getWriter().write(quest);
					
				}else if (link.equalsIgnoreCase("fPost")) {
					app=new StomachDAO();
					response.setContentType("application/json");
					quest=gson.toJson(app.node45);
					response.getWriter().write(quest);
				}
			case "/StomachFemaleUrl7":
				link=request.getParameter("s1");
				if (link.equalsIgnoreCase("fBefore")) {
					app=new StomachDAO();
					response.setContentType("application/json");
					quest=gson.toJson(app.node46);
					response.getWriter().write(quest);
					
				}else if (link.equalsIgnoreCase("fBriefly")) {
					app=new StomachDAO();
					response.setContentType("application/json");
					quest=gson.toJson(app.node47);
					response.getWriter().write(quest);
				}
				else if (link.equalsIgnoreCase("fUnrelated")) {
					app=new StomachDAO();
					response.setContentType("application/json");
					quest=gson.toJson(app.node45);
					response.getWriter().write(quest);
				}
			case "/StomachFemaleUrl8":
				link=request.getParameter("s1");
				if (link.equalsIgnoreCase("fIUD")) {
					app=new StomachDAO();
					response.setContentType("application/json");
					quest=gson.toJson(app.node48);
					response.getWriter().write(quest);
					
				}else if (link.equalsIgnoreCase("fNoIUD")) {
					app=new StomachDAO();
					response.setContentType("application/json");
					quest=gson.toJson(app.node49);
					response.getWriter().write(quest);
				}
			case "/StomachLGBTUrl":
				link = request.getParameter("s1");
				if (link.equalsIgnoreCase("LGBT1")) {
					app=new StomachDAO();
					response.setContentType("application/json");
					quest=gson.toJson(app.node66);
					response.getWriter().write(quest);
				}
				DiseaseBean bean=new DiseaseBean();
				bean.setDisease(disease);
				DiseaseDAO diseaseDAO=new DiseaseDAO();
				String diseasevalue=diseaseDAO.DiseaseValue(bean);
		}//end of while
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
