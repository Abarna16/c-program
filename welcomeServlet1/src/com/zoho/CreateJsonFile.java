package com.zoho;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import jdk.nashorn.internal.parser.JSONParser;
public class CreateJsonFile extends HttpServlet{

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
	
		String name=request.getParameter("name");
		String password=request.getParameter("password");
		JSONObject json=new JSONObject();
		json.put("name",name);
		json.put("pass",password);

		
		 
        JSONArray jsonArray = new JSONArray();
        jsonArray.add(json);

        try {
            System.out.println("Writting JSON into file ...");
            System.out.println(jsonArray.toJSONString());
            FileWriter jsonFileWriter = new FileWriter("D://newjson.json",true);
            jsonFileWriter.write(json.toString());
            jsonFileWriter.write(System.lineSeparator());
           
            
            jsonFileWriter.close();
            System.out.println("Done");

        } catch (IOException e) {
            e.printStackTrace();
        }
		System.out.println(json);
		 
		 
		  
		
	}
}
