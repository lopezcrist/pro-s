package com.wozeze.webapp.demo.action;

import javax.annotation.Resource;

import com.wozeze.webapp.demo.dao.UserBo;


public class UserSpringAction{

	@Resource
	UserBo userBo;
	
	private String name = "dudu";
	
	public String getName() {
		return name;
	}

	public String execute() throws Exception {
		
		userBo.printUser();
		
		return "success";
		
	}
}