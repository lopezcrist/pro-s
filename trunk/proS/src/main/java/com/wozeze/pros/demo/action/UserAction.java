package com.wozeze.pros.demo.action;


import com.wozeze.pros.demo.domain.User;
import com.wozeze.pros.demo.service.iface.IUserService;

public class UserAction {
	
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
		System.out.println(user1.getPassword());
		System.out.println(user1.getUsername());
		return "success";
	}
	
	public void setUserService(IUserService userService) {
		this.userService = userService;
	}
}