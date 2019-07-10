package com.form;

import java.util.regex.Pattern;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;

public class LoginForm extends ActionForm {
/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
String userName;
String password;
public void setUserName(String userName)
{
	this.userName=userName;
}
public void setPassword(String password)
{
	this.password=password;
}
public String getUserName()
{
	return this.userName;
}
public String getPassword()
{
	return this.password;
}

public ActionErrors validate(ActionMapping mapping,
        HttpServletRequest request) {
    ActionErrors errors = new ActionErrors();

    if (userName == null || userName.length() == 0) {
        errors.add("userName", new ActionMessage("userName.not.entered"));
    }
    
    if (password == null || password.length() == 0) {
        errors.add("password", new ActionMessage("password.not.entered"));
    }
    if(!(Pattern.compile("^[0-9a-zA-Z]*$").matcher(password).matches()))
    {
    	errors.add("password",new ActionMessage("password.invalid"));
    }
    return errors;
}
public void reset(ActionMapping mapping,HttpServletRequest request)
{
	this.userName="";
	this.password="";
}
}
