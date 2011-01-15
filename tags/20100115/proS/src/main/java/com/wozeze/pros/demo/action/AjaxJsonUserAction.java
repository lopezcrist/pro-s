package com.wozeze.pros.demo.action;

import java.util.HashMap;
import java.util.Map;
import net.sf.json.JSONObject;
import com.wozeze.pros.demo.domain.User;

public class AjaxJsonUserAction {
	
	public String execute(){
		Map<String, String> userMap = new HashMap<String, String>();
		userMap.put("username", username);
		userMap.put("password", password);
		JSONObject userJson = JSONObject.fromObject(userMap);
		this.result = userJson.toString();
		System.out.println(result);
		return "success";
	}

	private static final long serialVersionUID = 1L;

	private String result;
	
	private String username;
	
	private String password;
	
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

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
