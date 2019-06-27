package com.zoho;

import javax.servlet.http.HttpSessionListener;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionEvent;
public class SessionListener implements HttpSessionListener{
	public void sessionCreated(HttpSessionEvent event)
	{
		System.out.println("Session is Created");
		HttpSession object=event.getSession();
		System.out.println("Session id is : "+object.getId()+"\nCreation Time : "+object.getCreationTime()+"\nmaximum inactive time "+object.getMaxInactiveInterval());
		object.setMaxInactiveInterval(120);
	}
	public void sessionDestroyed(HttpSessionEvent event)
	{
		System.out.println("Session is destroyed");
	}

}
