package com.zoho;
import java.io.IOException;  
import java.io.PrintWriter;  
  
import javax.servlet.*;  
  
public class LoginFilter  implements Filter{  
	static int count=0;
public void init(FilterConfig config) throws ServletException
{
}
public void doFilter(ServletRequest request,ServletResponse response,FilterChain chain) throws IOException,ServletException
{
	PrintWriter object=response.getWriter();
	response.setContentType("text/html");
	object.print("before invoke<br>");
	String name=request.getParameter("name");
	String password=request.getParameter("password");
	//object.print(name+password);
	long before=System.currentTimeMillis();
	if((request.getParameter("name").equals("admin"))&&(request.getParameter("password").equals("admin")))
	{
		
	chain.doFilter(request,response);
	}
	else
	{
		object.print("User name or password incorrect");
		 request.getRequestDispatcher("FilterIndex.html").include(request, response); 
		 }
	long after=System.currentTimeMillis();
	object.println("<br>Total number of visitors :"+(++count));
	object.println("<br>Total Response time : "+(after-before));
	object.print("<br>after invoke");
	
}
public void destroy() {}

}  



