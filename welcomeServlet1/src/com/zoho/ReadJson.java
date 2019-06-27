package com.zoho;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.Iterator;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class ReadJson 
{
	public static void main(String args[])
	{
	
	 JSONParser parser = new JSONParser();
	 JSONObject obj;
	 String line = null;
     try {
         System.out.println("Reading JSON file from Java program");
         FileReader fileReader = new FileReader("D:\\newjson.json");
       

     } 
     catch (Exception ex) 
     {
         ex.printStackTrace();
     }
	}
}
