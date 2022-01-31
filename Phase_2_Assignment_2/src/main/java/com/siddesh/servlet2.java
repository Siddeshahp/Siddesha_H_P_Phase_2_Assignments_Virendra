package com.siddesh;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/servlet2")
public class servlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public servlet2() {
        super();
        
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		doGet(request, response);
		doGet(request, response);
		try{  
		    response.setContentType("text/html");  
		    PrintWriter out = response.getWriter();  
		      
		    Cookie ck[]=request.getCookies();  
		    
		    for(int i=0;i<ck.length;i++){  
		    	 out.print("<br>"+ck[i].getName()+""+ck[i].getValue());//printing name and value of cookie  
		    	} 
		    Cookie ck1[]=request.getCookies();  
		    for(int i=0;i<ck.length;i++){  
		    	 out.print("<br>"+ck1[i].getName()+""+ck1[i].getValue());//printing name and value of cookie  
		    	} 
	        out.close();  
	         }
		catch(Exception e)
		{
			System.out.println(e);
		}  
	}

	}


