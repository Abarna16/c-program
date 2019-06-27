package com.zoho.blog;

import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;


public class Add extends HttpServlet {
	
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//ServletContext context=getServletContext();		
		resp.setContentType("text/html");		
		PrintWriter pw=resp.getWriter();
		//String path= context.getInitParameter("Path");
		Map<String, String[]> m=req.getParameterMap();
		Map<String,String> map=new LinkedHashMap<String, String>(3);
		for(Map.Entry<String, String[]> k:m.entrySet())
		{
			//pw.println(k.getKey());
			if(!k.getKey().equals("Submit"))
			{
			String[] value=k.getValue();
			for(int j=0;j<value.length;j++)
				map.put(k.getKey(), value[j]);
			}
		}
		try {               
            JSONObject jo = (JSONObject)new JSONParser().parse(new FileReader("E://servlet.json")); 
            JSONArray ja=((JSONArray)jo.get("Details")); 
            ja.add(map);
            PrintWriter pwr = new PrintWriter("E://servlet.json"); 
            pwr.write(jo.toJSONString());         
            pwr.flush(); 
            pwr.close();          
            jo=(JSONObject)new JSONParser().parse(new FileReader("E://servlet.json"));
            req.getRequestDispatcher("View").include(req, resp);  
           // pw.println("added Successfully");
            //resp.sendRedirect("home.html");
        } catch (Exception ex) {
           System.out.println("Some error Occured....Please Try again");
        }  
	
	}

}
