package com.zoho;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
@WebServlet("/DisplayJson")
public class DisplayJson extends HttpServlet 
{

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		
	JSONArray array=new JSONArray();
	JSONObject obj=new JSONObject();

	response.setContentType("application/json");
	
	obj.put("id","abar");
	obj.put("name","abar");
	array.add(obj);
	JSONObject resJSON = new JSONObject();
	resJSON.put("students", array);
	PrintWriter pw=response.getWriter();
	pw.append(resJSON.toJSONString());
	}
	


	

}
