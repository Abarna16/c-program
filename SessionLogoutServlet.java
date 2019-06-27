package com.zoho;
import java.io.IOException;  
import java.io.PrintWriter;  
  
import javax.servlet.ServletException;  
import javax.servlet.http.HttpServlet;  
import javax.servlet.http.HttpServletRequest;  
import javax.servlet.http.HttpServletResponse;  
import javax.servlet.http.HttpSession;  
public class SessionLogoutServlet extends HttpServlet {
	
	
	        protected void doGet(HttpServletRequest request, HttpServletResponse response)  
	                                throws ServletException, IOException {  
	            response.setContentType("text/html");  
	            PrintWriter out=response.getWriter();  
	              
	            request.getRequestDispatcher("SessionLink.html").include(request, response);  
	              
	            HttpSession session=request.getSession();  
	            session.invalidate();  
	              
	            out.print("You are successfully logged out!");  
	              
	            out.close();  
	    }  
	}  

