package com.siddesh;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/servlet4")
public class servlet4 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public servlet4() {
        super();
       
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		try{
		      response.setContentType("text/html");
		      PrintWriter pwriter = response.getWriter();
		     
		      HttpSession session=request.getSession(false);
		      
		      String uName=(String)session.getAttribute("username");
		      String uPass=(String)session.getAttribute("password");
		      String uage=(String)session.getAttribute("age");
		      String uemail=(String)session.getAttribute("email");
		      String ucountry=(String)session.getAttribute("country");
		      
		      pwriter.println("session creation time" + session.getCreationTime());
		      pwriter.println("session last accessed time" +session.getLastAccessedTime());
		      pwriter.println("session max interval time" +session.getMaxInactiveInterval());
		     
		      
		      pwriter.print("Name= "+uName+"Password= "+uPass+"age="+uage+"email="+uemail+"country="+ucountry);
		      pwriter.close();
		  }catch(Exception exp){
		      System.out.println(exp);
		   }
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
