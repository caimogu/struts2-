package com.company.project;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

import beans.User;

public class LoginAction extends ActionSupport implements ModelDriven<User>{
	
	private User user = new User();
	
	public String login(){
		System.out.println("�û�����" + user.getUsername());
		System.out.println("���룺" + user.getPassword());
		System.out.println("�鼮1��" + user.getBookList().get(0));
		System.out.println("�鼮2��" + user.getBookList().get(1));

		return SUCCESS;
	}

	@Override
	public User getModel() {
		// TODO Auto-generated method stub
		return user;
	}
}
