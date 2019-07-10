package com.form;

import org.apache.struts.action.ActionForm;

public class AddForm extends ActionForm{

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String empName;
	String empid;
	String dob;
String basic;
	String hra;
	String ta;
	String email;
	public void setEmpName(String empName)
	{
		this.empName=empName;
	}
	public void setEmpid(String empid)
	{
		//System.out.println("String"+Integer.parseInt(empid));
		//System.out.println("kk"+Integer.parseInt(empid));
		this.empid=empid;
	}
	public void setDob(String dob)
	{
		this.dob=dob;
	}
	public void setBasic(String basic)
	{
		this.basic=basic;
	}
	public void setHra(String hra)
	{
		this.hra=hra;
	}
	public void setTa(String ta)
	{
		this.ta=ta;
	}
	public void setEmail(String email)
	{
		this.email=email;
	}
	
	
	public String getEmpName()
	{
		return this.empName;
	}
	public String getEmpid()
	{
		return this.empid;
	}
	public String getDob()
	{
		return this.dob;
	}
	public String getBasic()
	{
		return this.basic;
	}
	public String getHra()
	{
		return this.hra;
	}
	public String getTa()
	{
		return this.ta;
	}
	public String getEmail()
	{
	return this.email;
	}
	
	
	
}
