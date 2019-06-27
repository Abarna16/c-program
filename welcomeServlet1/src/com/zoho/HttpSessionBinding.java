package com.zoho;

import javax.servlet.http.*;
import javax.servlet.*;
public class HttpSessionBinding implements HttpSessionBindingListener{
	/*
	 * ServletContext context; public HttpSessionBinding(ServletContext context) {
	 * this.context=context; }
	 */
	public void valueBound(HttpSessionBindingEvent event)
	{
		System.out.println("Value bounded : "+event.getName());
	}
	public void valueUnbound(HttpSessionBindingEvent event)
	{
		System.out.println("Value unbounded : "+event.getName());
	}
	
}
