package com.action;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.db.AddDb;
import com.form.AddForm;

public class AddAction extends Action {

	public ActionForward execute(ActionMapping mapping,ActionForm form,HttpServletRequest request,HttpServletResponse response) throws Exception
	
	{
		
		AddForm add=(AddForm)form;
		String empName=add.getEmpName();
		int empid=Integer.parseInt(add.getEmpid());
		//System.out.println("action "+empid);
		String dob=add.getDob();
		int basic=Integer.parseInt(add.getBasic());
		int hra=Integer.parseInt(add.getHra());
		int ta=Integer.parseInt(add.getTa());
		String email=add.getEmail();
		AddDb db=new AddDb();
		int da=(basic*12)/100;
		int pf=(basic*14)/100;
		int it=(basic*15)/100;
		int net=basic+da+hra+ta-(pf+it);
		if(db.insertData(empName,empid,dob,basic,hra,ta,email,net)==1)
			return mapping.findForward("addsuccess");
		else
			return mapping.findForward("failure");
		
		
		
	}
}
