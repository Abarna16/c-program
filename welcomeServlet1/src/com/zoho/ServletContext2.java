package com.zoho;
import java.io.*;  
import javax.servlet.*;   
import javax.servlet.http.*;  
public class ServletContext2  extends HttpServlet {
	public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException,ServletException
	{  
		res.setContentType("text/html");  
		PrintWriter out=res.getWriter();  
		  
		ServletContext context=getServletContext();  
	
		ServletConfig config=getServletConfig(); 
		
		 out.println("ServletConfig  "+config.getInitParameter("driver")+".....");
		 
		 out.println(" ServletContext "+context.getInitParameter("System")+".....");
		 context.removeAttribute("driver");
		 out.println(" ServletContext after remove driver"+context.getInitParameter("driver")+".....");
		 
		
		out.println("Welcome to "+ (String)context.getAttribute("company"));  
		
	}


	

}
