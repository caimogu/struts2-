package com.company.project;

import com.opensymphony.xwork2.ActionSupport;

public class HeloWorldAction extends ActionSupport{
	
	public String add(){
		System.out.println("add()");
		return "add";
	}
	public String update(){
		System.out.println("update()");
		return "update";
	}

	@Override
	public String execute() throws Exception {
		System.out.println("Ö´ÐÐAction");
		return SUCCESS;
	}
	
	
}
