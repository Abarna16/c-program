package com.db;
import java.sql.*;
public class SignupDb {
public void insertData(String userName,String password)throws Exception
{
	Class.forName("com.mysql.jdbc.Driver");
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/abar","root","root");
	System.out.println("Connection established");
	try
	{
		try
		{
		Statement st=con.createStatement();
		int result=st.executeUpdate("insert into signup values('"+userName+"','"+password+"')");
		System.out.println(result+"row affected");
		}
		catch(SQLException ex)
		{
			System.out.println("error executing the sql statement");
		}
		con.close();
	}catch(Exception e)
	{
		System.out.println(e);
	}
}

public boolean checkData(String userName,String password) throws Exception
{
	boolean status=false;
	Class.forName("com.mysql.jdbc.Driver");
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/abar","root","root");
	System.out.println("Connection established");
	try
	{
		try
		{
		PreparedStatement st=con.prepareStatement("select * from signup where userName=? and password=?");
		st.setString(1,userName);
		st.setString(2,password);
		ResultSet rs=st.executeQuery();
		status=rs.next();
		}
		catch(SQLException ex)
		{
			System.out.println("error executing the sql statement");
		}
		con.close();
	}catch(Exception e)
	{
		System.out.println(e);
	}
	return status;
}
}
