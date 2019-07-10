package com.action;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;
public class LoginServlet1 extends HttpServlet {
	 
	    protected void doPost(HttpServletRequest request, HttpServletResponse response)
	            throws ServletException, IOException {
	        response.setContentType("text/html;charset=UTF-8");
	        PrintWriter out = response.getWriter();
	        
	        String username = request.getParameter("userName");
	        String password = request.getParameter("password");
	       // System.out.println(username+" "+password);
	        if(username.equals("admin")&& password.equals("admin"))
	        {
	            RequestDispatcher rs = request.getRequestDispatcher("servletprofile");
	            rs.forward(request, response);
	        }
	        else
	        {
	           out.println("Username or Password incorrect");
	           RequestDispatcher rs = request.getRequestDispatcher("login.jsp");
	           rs.include(request, response);
	        }
	    }  
	}


