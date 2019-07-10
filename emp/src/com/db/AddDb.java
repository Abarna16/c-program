package com.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import com.action.LoginAction;

public class AddDb {
	private final static Logger LOGGER=Logger.getLogger("example");
	public int insertData(String empName,int empId,String dob,int basic,int hra,int ta,String email,int net)throws Exception
	{
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/abar","root","root");
		System.out.println("Connection established");
		try
		{
			try
			{
			Statement st=con.createStatement();
			int result=st.executeUpdate("insert into detail values('"+empName+"','"+empId+"','"+dob+"','"+basic+"','"+hra+"','"+ta+"','"+email+"','"+net+"')");
			//System.out.println(result+"row affected");
			if(result!=0)
			{
				 LOGGER.log(Level.INFO,"Admin inserted a new record");
				 return 1;
			}
			}
			catch(SQLException ex)
			{
				System.out.println(ex);
			}
			con.close();
		}catch(Exception e)
		{
			
			 LOGGER.log(Level.INFO,"Exception occured during admin try to insert a details");
		
			System.out.println(e);
		}
		return 0;
}

	public JSONArray viewData(int empid) throws ClassNotFoundException, SQLException
	{
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/abar","root","root");
		System.out.println("Connection established");
		JSONArray json = new JSONArray();
		try
		{
			try
			{
			Statement st=con.createStatement();
			
			System.out.println(empid);
			ResultSet rs=st.executeQuery("select * from detail where empId="+empid);  
			ResultSetMetaData rsmd = rs.getMetaData();
			
			//System.out.println(rsmd);
			while(rs.next()) {
				  int numColumns = rsmd.getColumnCount();
				  JSONObject obj = new JSONObject();
				  for (int i=1; i<=numColumns; i++) {
				    String column_name = rsmd.getColumnName(i);
				    obj.put(column_name, rs.getObject(column_name));
				  }
				  json.add(obj);
				}
			if(!json.isEmpty())
			{	
				 LOGGER.log(Level.INFO,"Admin views the details");		
			}
			else
			{
				 LOGGER.log(Level.INFO,"Admin entered a wrong userid ");
			
			}
			
			
			
			}
			catch(SQLException ex)
			{
				System.out.println(ex);
				
			}
			con.close();
		}catch(Exception e)
		{
			LOGGER.log(Level.INFO,"Exception occured during admin try to view the details");
			System.out.println(e);
		}
		return json;
		
	}
	public JSONArray viewData(int empid,String dob) throws ClassNotFoundException, SQLException
	{
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/abar","root","root");
		System.out.println("Connection established");
		JSONArray json = new JSONArray();
		try
		{
			try
			{
			PreparedStatement st=con.prepareStatement("select * from detail where empId=? and dob=?");
			st.setInt(1, empid);
			st.setString(2, dob);
			System.out.println(empid);
			ResultSet rs=st.executeQuery();  
			ResultSetMetaData rsmd = rs.getMetaData();
			
			
			//System.out.println(rsmd);
			while(rs.next()) {
				  int numColumns = rsmd.getColumnCount();
				  JSONObject obj = new JSONObject();
				  for (int i=1; i<=numColumns; i++) {
				    String column_name = rsmd.getColumnName(i);
				    obj.put(column_name, rs.getObject(column_name));
				  }
				  json.add(obj);
				}
		
			if(!json.isEmpty())
			{	
				 LOGGER.log(Level.INFO,"user view details");		
			}
			else
			{
				 LOGGER.log(Level.INFO,"user entered a wrong userid or date of birth ");
			
			}
			}
			catch(SQLException ex)
			{
				System.out.println(ex);
			}
			con.close();
		}catch(Exception e)
		{
			System.out.println(e);
			 LOGGER.log(Level.INFO,"Exception occured during user  try to insert a details");
		}
		return json;
		
	}
	
	public int editData(String empName,int empId,String dob,int basic,int hra,int ta,String email,int net)throws Exception
	{
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/abar","root","root");
		System.out.println("Connection established");
		String sql="update detail set empName=?,dob=?,basic=?,hra=?,ta=?,email=?,net=? where empId=?";
		try
		{
			try
			{
				PreparedStatement st = con.prepareStatement(sql);
			//Statement st=con.createStatement();
			//stmt.executeUpdate("update emp set name='Vimal',age=20 where id=1");  
			System.out.println("update"+empId);
				/*
				 * int
				 * result=st.executeUpdate("update details set empName="+empName+",dob="+dob+
				 * ",basic="+basic+",hra="+hra+",ta="+ta+",email="+email+",net="+
				 * net+"where empId="+empId);
				 */	
			
			 st.setString(1, empName);
			 st.setString(2, dob);
			 st.setInt(3,basic);
			 st.setInt(4,hra);
			 st.setInt(5,ta);
			 st.setString(6,email);
			 st.setInt(7, net);
		      st.setInt(8, empId);
		      LOGGER.log(Level.INFO,"Admin edit the details");
		      int result=st.executeUpdate();
		      if(result!=0)
		    	  return 1;
		     
			System.out.println(result+"row affected");
			}
			catch(SQLException ex)
			{
				System.out.println(ex);
			}
			con.close();
		}catch(Exception e)
		{
			 LOGGER.log(Level.INFO,"Exception occured during admin try to edit a details");
			System.out.println(e);
		}

  	  return 0;
   }

	public int DeleteData(int empid) throws ClassNotFoundException, SQLException
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/abar","root","root");
			System.out.println("Connection established");
			try
			{
				try
				{
				Statement st=con.createStatement();
				
				System.out.println(empid);
				int result=st.executeUpdate("delete from detail where empId="+empid);
				if(result!=0)
				{
					 LOGGER.log(Level.INFO,"admin delete  the  details");
					 
				    	  return 1;
				}System.out.println(result+"row affected");
				
				}
				catch(SQLException ex)
				{
					System.out.println(ex);
				}
				con.close();
			}catch(Exception e)
			{
				 LOGGER.log(Level.INFO,"Exception occured during admin try to delete insert a details");
				System.out.println(e);
			}
			return 0;
		}
	
	
}
