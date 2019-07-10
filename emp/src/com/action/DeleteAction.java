package com.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.db.AddDb;
import com.form.ViewForm;

public class DeleteAction extends Action {

	public ActionForward execute(ActionMapping mapping,ActionForm form,HttpServletRequest request,HttpServletResponse response) throws Exception
	
	{
		ViewForm add=(ViewForm)form;

		int empid=Integer.parseInt(add.getEmpid());
		System.out.println(empid);
		AddDb db=new AddDb();
		
		if(db.DeleteData(empid)==1)
			 return mapping.findForward("deletesuccess"); 
		else
			 return mapping.findForward("failure"); 
		
	
	}
}
