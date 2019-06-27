package com.zoho;
import java.io.*;
import javax.servlet.*;

import java.util.Enumeration;
import java.util.Enumeration.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
//@WebServlet("/SecondServlet") 
public class SecondServlet extends HttpServlet {

	protected void service(HttpServletRequest req,HttpServletResponse res) throws ServletException, IOException
		{
		String method=req.getMethod();
		PrintWriter object=res.getWriter();
		object.println(method);
		if(method.equalsIgnoreCase("get"))
			doGet(req,res);
		else if(method.equalsIgnoreCase("post"))
			doPost(req,res);
		}
	protected void doPost(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException
	{
		response.setContentType("text/html");
		PrintWriter object=response.getWriter();
		object.println("hi fga");
		
		//String name1=request.ge
		Enumeration<String> ob=request.getParameterNames();
		while(ob.hasMoreElements())
		{
			String name=ob.nextElement();
			object.println(name);
			String value=request.getParameter(name);
			///object.println(value);
		}
		int len=request.getContentLength();
		object.println("ContentType is: "+response.getContentType()+"\nContent Length is "+len+"\nCharecter encoding is:"+response.getCharacterEncoding());
		object.println("Server name is"+request.getServerName()+"\nServer port number is :"+request.getServerPort());
		object.println("Display header information\n");
		Enumeration<String> ob1=request.getHeaderNames();
		while(ob1.hasMoreElements())
		{
			String name=ob1.nextElement();
			object.println(name+": ");
			
			String value=request.getHeader(name);
			object.println(value+"....");
		}
	}
	protected void doGet(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException
	{
		response.setContentType("text/html");
		PrintWriter object=response.getWriter();
		object.println("hi");
		//String name1=request.ge
		Enumeration<String> ob=request.getParameterNames();
		while(ob.hasMoreElements())
		{
			String name=ob.nextElement();
			object.println(name);
			String value=request.getParameter(name);
			///object.println(value);
		}
		int len=request.getContentLength();
		object.println("ContentType is: "+response.getContentType()+"\nContent Length is "+len+"\nCharecter encoding is:"+response.getCharacterEncoding());
		object.println("Server name is"+request.getServerName()+"\nServer port number is :"+request.getServerPort());
		object.println("Display header information\n");
		Enumeration<String> ob1=request.getHeaderNames();
		while(ob1.hasMoreElements())
		{
			String name=ob1.nextElement();
			String value=request.getHeader(name);
			object.println("  value  "+value);
		}
	}
}