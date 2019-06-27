package com.zoho;

import java.io.FileWriter;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
public class DisplayAsXml
{
	public static void main(String args[]) throws IOException
	{
		JSONObject json=new JSONObject();
		json.put("name","abar");
		json.put("pass","abar");
		JSONArray list=new JSONArray();
		list.add("java");
		list.add("jsp");
		list.add("servlet");
		json.put("courses",list);
		try(FileWriter writer=new FileWriter("myjson.json"))
		{
			writer.write(json.toString());
			writer.flush();
			
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		System.out.println(json);
	}
}