package com.wozeze.pros.domain.target_catelog;

import com.wozeze.pros.domain.BaseDomain;

public class TargetCatelog extends BaseDomain{
	
	private String catelogId;
	private String catelogName;
	private String catelogDetail;
	
	public String getCatelogId() {
		return catelogId;
	}
	public void setCatelogId(String catelogId) {
		this.catelogId = catelogId;
	}
	public String getCatelogName() {
		return catelogName;
	}
	public void setCatelogName(String catelogName) {
		this.catelogName = catelogName;
	}
	public String getCatelogDetail() {
		return catelogDetail;
	}
	public void setCatelogDetail(String catelogDetail) {
		this.catelogDetail = catelogDetail;
	} 
}
