package com.wozeze.pros.demo.action;

import net.sf.json.JSONObject;

import com.opensymphony.xwork2.ActionSupport;
import com.wozeze.pros.demo.domain.User;

public class AjaxJsonUserAction extends ActionSupport {
	
	public String execute(){
		JSONObject userJson = JSONObject.fromObject(user);
		this.result = userJson.toString();
		System.out.println(result);
		return "success";
	}

	private static final long serialVersionUID = 1L;

	private String result;
	
	private User user;

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	
}
