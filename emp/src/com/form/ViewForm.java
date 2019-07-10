package com.form;

import org.apache.struts.action.ActionForm;

public class ViewForm extends ActionForm{
/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
String empid;
String dob;
public void setEmpid(String empid)
{
	//System.out.println("hiii"+empid);
	this.empid=empid;
}
public void setDob(String dob)
{
	//System.out.println("hiii"+empid);
	this.dob=dob;
}

public String getEmpid()
{
	System.out.println("hrl"+empid);
	return this.empid;
}

public String getDob() {
	
	return this.dob;
}

}
