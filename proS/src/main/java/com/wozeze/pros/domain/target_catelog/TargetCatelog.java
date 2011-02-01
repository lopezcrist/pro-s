package com.wozeze.pros.domain.target_catelog;

import com.wozeze.pros.domain.BaseDomain;
import com.wozeze.pros.domain.system.User;

public class TargetCatelog extends BaseDomain{
	
	private String catelogDetail;
	private User user;
	
	public String getCatelogDetail() {
		return catelogDetail;
	}
	public void setCatelogDetail(String catelogDetail) {
		this.catelogDetail = catelogDetail;
	} 
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
}
