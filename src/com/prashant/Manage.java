package com.prashant;

import com.opensymphony.xwork2.ActionSupport;

public class Manage extends ActionSupport{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public String actionName;
	
	public String execute() throws Exception{
		if(actionName.equals("VIEW_EDUCATION")){
			
		}
		
		
		return SUCCESS;
		
	}
	public String getActionName() {
		return actionName;
	}
	public void setActionName(String actionName) {
		this.actionName = actionName;
	}

}
