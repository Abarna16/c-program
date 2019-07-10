package com.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.db.AddDb;
import com.form.ViewForm;

public class UserViewAction extends Action {

	public ActionForward execute(ActionMapping mapping,ActionForm form,HttpServletRequest request,HttpServletResponse response) throws Exception
	
	{
		ViewForm add=(ViewForm)form;

		int empid=Integer.parseInt(add.getEmpid());
		String dob=add.getDob();
		System.out.println(empid);
		AddDb db=new AddDb();
		request.setAttribute("obj",db.viewData(empid,dob));
	
		//System.out.println("json"+db.viewData(empid,dob).toString());
		 return mapping.findForward("userviewsuccess"); 
	
	}

}
