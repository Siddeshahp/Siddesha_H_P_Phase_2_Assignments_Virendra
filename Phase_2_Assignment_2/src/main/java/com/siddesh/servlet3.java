package com.siddesh;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/servlet3")
public class servlet3 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public servlet3() {
        super();
        
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//doGet(request, response);
		try{  
		    response.setContentType("text/html");  
		    PrintWriter out = response.getWriter();  
		          
		    String m1=request.getParameter("userName");  
		    String m2=request.getParameter("password");
		    String m3=request.getParameter("age");  
		    String m4=request.getParameter("email");  
		    String m5=request.getParameter("country");  
		    out.print("Welcome "+ m1);
		    out.println("your password is="+m2);
		    out.println("your age is="+m3);
		    out.println("your email is="+m4);
		    out.println("your country is="+m5);
		    HttpSession session=request.getSession(); 
		    session.setAttribute("username",m1);
		    session.setAttribute("password",m2);
		    session.setAttribute("age",m3);
		    session.setAttribute("email",m4);
		    session.setAttribute("country",m5);
		    
		    
		  
		    //creating submit button  
		    out.print("<form action='servlet4'>");  
		    out.print("<input type='submit' value='go'>");  
		    out.print("</form>");  
		          
		    out.close();
	}
	 catch(Exception e){System.out.println(e);}  
}  
	
	}


