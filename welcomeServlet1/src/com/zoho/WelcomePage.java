package com.zoho;

import java.io.IOException;
import javax.servlet.http.*;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.annotation.*;
//@WebServlet("/WelcomePage")
public class WelcomePage extends HttpServlet{
	protected void doGet(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException
	{
		response.setContentType("text/html");
		PrintWriter ob=response.getWriter();
		Cookie ck[]=request.getCookies();
		
			String name=ck[0].getName();
			ob.println("Welcome "+ck[0].getValue());
			
			ob.println("<br><form action='Logout' >");  
		    ob.println("<br><br><input type='submit' value='Logout'>");  
		    ob.println("</form>");  
		
		
		
		
}
}
