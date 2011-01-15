package com.wozeze.pros.action.system;

import javax.annotation.Resource;
import com.wozeze.pros.domain.system.User;
import com.wozeze.pros.service.iface.system.IUserService;

public class UserAction {
	
	@Resource
	IUserService userService;
	
	/**
	 * 跳转到注册页面
	 * @return
	 * @throws Exception
	 */
	public String toRegisterPage() throws Exception{
		return "registerPage";
	}
	
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