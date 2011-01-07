package com.wozeze.pros.demo.action;

import javax.annotation.Resource;
import com.wozeze.pros.demo.domain.User;
import com.wozeze.pros.demo.service.iface.IUserService;

public class UserAction {
	
	@Resource
	IUserService userService;

	private User user;

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String execute() throws Exception {
		User user1 = userService.getUserByUsernameAndPassword(user);
		if(user1!=null){
			return "success";
		}else{
			return "failure";
		}
	}
}