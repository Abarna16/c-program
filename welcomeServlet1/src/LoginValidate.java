
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.*;
import javax.servlet.annotation.*;
import javax.servlet.*;
import java.io.*;
import javax.servlet.http.*;
//@WebServlet("/LoginValidate")
public class LoginValidate extends HttpServlet
{
protected void doPost(HttpServletRequest request,HttpServletResponse response)throws IOException,ServletException
{
	response.setContentType("text/html");
	PrintWriter object=response.getWriter();
	String name=request.getParameter("name");
	String password=request.getParameter("password");
	if(name.equals("admin") && (password.equals("admin")))
	{
		RequestDispatcher requestDispatcher=request.getRequestDispatcher("WelcomePage");
		requestDispatcher.forward(request, response);
		//response.sendRedirect("WelcomePage");

	}
	else
	{
		object.println("User name or Password are incorrect");
//		RequestDispatcher requestDispatcher=request.getRequestDispatcher("/Login.html");
//		requestDispatcher.include(request, response);
		response.sendRedirect("login.html");
	}
}

}
