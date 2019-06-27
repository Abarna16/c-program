package com.zoho;
import java.io.*;  
import javax.servlet.*;   
import javax.servlet.http.*;  
public class ServletContext1  extends HttpServlet {
	public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException,ServletException
	{  
		res.setContentType("text/html");  
		PrintWriter out=res.getWriter();  
		  
		ServletContext context=getServletContext();  
	 context.setAttribute("company","ZOHO"); 
		
	 ServletConfig config=getServletConfig(); 
	
	 out.println(" ServletConfig  "+config.getInitParameter("driver")+".....");
	
		out.println(" ServletContext "+context.getInitParameter("System")+".....");  
		out.println("<a href='ServletContext2'>visit</a>");  
	}


	

}
