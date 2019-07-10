package com.action;
import java.io.IOException;  
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

import javax.servlet.ServletException;  
import javax.servlet.http.HttpServlet;  
import javax.servlet.http.HttpServletRequest;  
import javax.servlet.http.HttpServletResponse;  
import javax.servlet.http.HttpSession;

import com.db.AddDb;
import com.db.SignupDb;

   
public class SessionLoginServlet extends HttpServlet{
	private final static Logger LOGGER=Logger.getLogger("example");

	    protected void doPost(HttpServletRequest request, HttpServletResponse response)  
	                    throws ServletException, IOException {  
	    	boolean append = true;
		    FileHandler handler = null;
			try {
				handler = new FileHandler("D://log/logfile.log", append);
			} catch (SecurityException | IOException e) {
							e.printStackTrace();
			}
		    SimpleFormatter formatter = new SimpleFormatter();  
		    handler.setFormatter(formatter);
		    
		   
		    LOGGER.addHandler(handler);
		   
	    	
	        response.setContentType("text/html");  
	        PrintWriter out=response.getWriter();  
	       
	          System.out.println("hiiii");
	        String userName=request.getParameter("userName");  
	        String password=request.getParameter("password");  
	        //  out.println(name);
	         // out.println(password);
	        if(userName.equals("admin")&&password.equals("admin"))
	        {  
	        HttpSession session=request.getSession(false);  
	        session.setAttribute("username1",userName); 
			 LOGGER.log(Level.INFO,"Admin Login Successful");

	       response.sendRedirect("Link.do?method=profile");
	        }  
	        else{  
	        	 response.sendRedirect("Link.do?method=login");
	        	 LOGGER.log(Level.INFO,userName +" try to login...But login Failed");
			/*
			 * SignupDb db=new SignupDb(); boolean res = false; try { res =
			 * db.checkData(userName,password); } catch (Exception e) { e.printStackTrace();
			 * } if(res) { HttpSession session = request.getSession();
			 * session.setAttribute("username1", userName);
			 * LOGGER.log(Level.INFO,userName+" Loged in");
			 * response.sendRedirect("Link1.do?method=userview"); } else {
			 * LOGGER.log(Level.INFO,userName +" try to login...But login Failed");
			 * response.sendRedirect("Link.do?method=login");
			 * 
			 * }
			 */
	    		
	        	
	        }
	        out.close();  
	    }  
	} 

