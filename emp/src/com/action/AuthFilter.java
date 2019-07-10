
  package com.action;
  import java.io.*;
  import javax.servlet.*; import javax.servlet.http.HttpServletRequest; import
  javax.servlet.http.HttpServletResponse; import
  javax.servlet.http.HttpSession; import java.io.IOException; import
  java.util.logging.Level;
  
  public class AuthFilter implements Filter {
  
  @Override public void init(FilterConfig filterConfig) throws ServletException
  {
  
  }
  
  @Override public void doFilter(ServletRequest servletRequest, ServletResponse
  servletResponse, FilterChain filterChain) throws IOException,
  ServletException {
  
	  HttpServletRequest request=(HttpServletRequest)servletRequest;
	  HttpServletResponse response=(HttpServletResponse)servletResponse;
	 
	   HttpSession session=request.getSession(false); 
	  String name=(String)session.getAttribute("username1");
	  System.out.println("session is"+name);
	  if(name!=null)
	  {
	  if(name.equals("admin"))
	{

		  filterChain.doFilter(request,response); 
	}
	  else
	  {
		  System.out.println("user name incorrect");
		 response.sendRedirect("Link1.do?method=login");
	  }
  // HttpSession session=request.getSession(false); String
  }
  
  else
  {
	  response.sendRedirect("Link1.do?method=login");
  }
  }
  @Override public void destroy() {
  
  } }
  
  