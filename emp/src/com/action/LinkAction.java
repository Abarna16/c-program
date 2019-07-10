package com.action;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.actions.DispatchAction;

import com.db.AddDb;
import com.form.AddForm;
import com.form.ViewForm;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionForward;


public class LinkAction extends DispatchAction {
    
   
     
   
    public ActionForward user(ActionMapping mapping, ActionForm  form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {
        
        return mapping.findForward("user1");
    }
    public ActionForward userview(ActionMapping mapping, ActionForm  form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {
        
        return mapping.findForward("userview1");
    }
   
    public ActionForward login(ActionMapping mapping, ActionForm  form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {
        
    	
    	
        return mapping.findForward("login");
    }
    public ActionForward logout(ActionMapping mapping, ActionForm  form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {
        
        return mapping.findForward("logout");
    }
    public ActionForward view11(ActionMapping mapping, ActionForm  form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {
    	AddForm add=(AddForm)form;

		int empid=Integer.parseInt(add.getEmpid());
		System.out.println(empid);
		AddDb db=new AddDb();
		request.setAttribute("obj",db.viewData(empid));
	
		//System.out.println("json"+db.viewData(empid).toString());
		 return mapping.findForward("viewsuccess"); 
    }
    public ActionForward profile(ActionMapping mapping, ActionForm  form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {
        
    	
    	
        return mapping.findForward("profile");
    }
    
    public ActionForward add(ActionMapping mapping, ActionForm  form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {
        
    	
    	
        return mapping.findForward("add2");
    }
    public ActionForward edit(ActionMapping mapping, ActionForm  form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {
        
    	
    	
        return mapping.findForward("edit2");
    }
    
    public ActionForward view1(ActionMapping mapping, ActionForm  form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {
        
    	
    	
        return mapping.findForward("view1");
    }
    public ActionForward delete(ActionMapping mapping, ActionForm  form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {
        
    	
    	
        return mapping.findForward("delete2");
        
        
        
        
    }
    public ActionForward add1(ActionMapping mapping, ActionForm  form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {
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