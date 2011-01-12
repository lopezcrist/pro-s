package com.wozeze.pros.demo.action;

import javax.annotation.Resource;
import com.wozeze.pros.demo.domain.User;
import com.wozeze.pros.demo.service.iface.IUserService;

public class UserActionWithMethods {
	
	@Resource
	IUserService userService;
	
	/**
	 * 用户注册
	 * @return
	 * @throws Exception
	 */
	public String register() throws Exception{
		userService.addUser(user);
		return "success";
	}
	
	/**
	 * 用户登陆
	 * @return
	 * @throws Exception
	 */
	public String login() throws Exception {
		User user1 = userService.getUserByUsernameAndPassword(user);
		if(user1!=null){
			return "success";
		}else{
			return "error";
		}
	}

	private User user;

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
}