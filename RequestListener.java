/*
 * package com.zoho; import javax.servlet.*;
 * 
 * public class RequestLitener implements ServletRequestListener { public void
 * requestInitialized(ServletRequestEvent req) {
 * System.out.println("Request initiated"); } public void
 * requestDestroyed(ServletRequestEvent req) {
 * System.out.println("Request Destroyed"); }
 * 
 * 
 * }
 */

package com.zoho;
import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;

public class RequestListener implements ServletRequestListener {

	public void requestInitialized(ServletRequestEvent event) {
		System.out.println("request is initiated");

	}

	
	public void requestDestroyed(ServletRequestEvent event) {
		System.out.println("request is destroyed");
	}

	
}