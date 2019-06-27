package com.zoho;
import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionBindingEvent;
public class HttpSessionAttribute implements HttpSessionAttributeListener {
	
public void attributeAdded(HttpSessionBindingEvent event)
{
	System.out.println("Attribute added");
	System.out.println("Attribute name: "+event.getName()+"\nAttribute value :"+event.getValue());
}
public void attributeRemoved(HttpSessionBindingEvent event)
{
	System.out.println("Attribute removed");
	System.out.println("Attribute name: "+event.getName()+"\nAttribute value :"+event.getValue());
}
public void attributeReplaced(HttpSessionBindingEvent event)
{
	System.out.println("Attribute replaced");
	System.out.println("Attribute name: "+event.getName()+"\nAttribute value :"+event.getValue());
}
	
}
