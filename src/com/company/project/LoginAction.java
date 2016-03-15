package com.company.project;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

import beans.User;

public class LoginAction extends ActionSupport implements ModelDriven<User>{
	
	private User user = new User();
	
	public String login(){
		System.out.println("用户名：" + user.getUsername());
		System.out.println("密码：" + user.getPassword());
		System.out.println("书籍1：" + user.getBookList().get(0));
		System.out.println("书籍2：" + user.getBookList().get(1));

		return SUCCESS;
	}

	@Override
	public User getModel() {
		// TODO Auto-generated method stub
		return user;
	}
}
