package com.action;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import com.form.LoginForm;


public class LoginAction extends Action {
	private final static Logger LOGGER=Logger.getLogger(LoginAction.class.getName());
	public ActionForward execute(ActionMapping mapping,ActionForm form,HttpServletRequest request,HttpServletResponse response) throws Exception
	
	{
		System.out.println("loginAction");
		boolean append = true;
	    FileHandler handler = null;
		try {
			handler = new FileHandler("D://loger5.log", append);
		} catch (SecurityException | IOException e) {
						e.printStackTrace();
		}
	    SimpleFormatter formatter = new SimpleFormatter();  
	    handler.setFormatter(formatter);
	    
	   
	    LOGGER.addHandler(handler);
	     
		LoginForm login=(LoginForm)form;
		String userName=login.getUserName();
		String password=login.getPassword();
		
		
		if(userName.equals("admin")&& password.equals("admin"))
		{
			HttpSession session = request.getSession(false);
			session.setAttribute("username", userName);
			 LOGGER.log(Level.INFO,"Admin Login Successful");
		return mapping.findForward("welcome");
		
		}
		else
		{
			 LOGGER.log(Level.INFO,"Admin Login Failed");
		return mapping.findForward("failure");
		}
	}
}