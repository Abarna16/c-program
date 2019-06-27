package com.zoho.blog;

import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.Iterator;
import java.util.Map;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;



public class View extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// ServletContext context=getServletContext();
		resp.setContentType("text/html");
		PrintWriter pw = resp.getWriter();
		req.getRequestDispatcher("Home.html").include(req, resp);
		// String path= context.getInitParameter("Path");

		try {
			JSONObject jobject = (JSONObject) new JSONParser().parse(new FileReader("E://servlet.json"));
			// JSONArray ja = jobject.getJSONArray("Details");
			JSONArray jarray = ((JSONArray) jobject.get("Details"));
			
			for(int i=0;i<jarray.size();i++)
			{
				JSONObject jo=(JSONObject)jarray.get(i);
				Iterator<Map.Entry> it1=jo.entrySet().iterator();
				while(it1.hasNext())
				{
					Map.Entry pair=it1.next();
					pw.println(pair.getKey()+" : "+pair.getValue());
					pw.println("<br>");
				}
				pw.println("<br>");
			}
		//	pw.println(jobject.get("Details"));
			// pw.println(jobject.toString());

		} catch (Exception ex) {
			System.out.println("Error Displaying the content");
		}

	}

}
