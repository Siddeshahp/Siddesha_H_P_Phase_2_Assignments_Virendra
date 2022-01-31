package com.siddesh;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/servlet1")
public class servlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public servlet1() {
        super();
 
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
		try{  
		    response.setContentType("text/html");  
		    PrintWriter out = response.getWriter();  
		          
		    String m=request.getParameter("userName");  
		    String n=request.getParameter("password");
		    out.print("Welcome "+ m);  
		    out.println("your password is:"+n);
		  
		    Cookie ck=new Cookie("username",m);		//creating cookie object 
		    response.addCookie(ck);					//adding cookie in the response  
		    Cookie ck1=new Cookie("password",n);
		    response.addCookie(ck1);
		  
		    //creating submit button  
		    out.print("<form action='servlet2'>");  
		    out.print("<input type='submit' value='go'>");  
		    out.print("</form>");  
		          
		    out.close();
		//doGet(request, response);
	}
		catch(Exception e){System.out.println(e);}  
	  }  

	}


