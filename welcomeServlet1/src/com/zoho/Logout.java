package com.zoho;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Logout extends HttpServlet{
	protected void doGet(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException
	{
		  response.setContentType("text/html");  
		PrintWriter ob=response.getWriter();
		Cookie ck=new Cookie("name","");
		
			ck.setMaxAge(0);//changing the maximum age to 0 seconds
			response.addCookie(ck);
		ob.println("Logout successfull");
		
	}
}
