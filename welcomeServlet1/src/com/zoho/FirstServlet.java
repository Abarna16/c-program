package com.zoho;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.annotation.*;
import javax.servlet.ServletException;
import javax.servlet.http.*;
@WebServlet("/FirstServlet")
public class FirstServlet extends HttpServlet {
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
public void doPost(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException
{
	PrintWriter object=response.getWriter();
	String name=request.getParameter("name");
	object.println(name);
}
}
