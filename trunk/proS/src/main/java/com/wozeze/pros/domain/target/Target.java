package com.wozeze.pros.domain.target;

import com.wozeze.pros.domain.BaseDomain;
import com.wozeze.pros.domain.target_catelog.TargetCatelog;

public class Target extends BaseDomain{

	private String beginDate;
	private String endDate;
	private String detail;
	private TargetCatelog targetCatelog;
	
	public String getBeginDate() {
		return beginDate;
	}
	public void setBeginDate(String beginDate) {
		this.beginDate = beginDate;
	}
	public String getEndDate() {
		return endDate;
	}
	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}
	public String getDetail() {
		return detail;
	}
	public void setDetail(String detail) {
		this.detail = detail;
	}
	public TargetCatelog getTargetCatelog() {
		return targetCatelog;
	}
	public void setTargetCatelog(TargetCatelog targetCatelog) {
		this.targetCatelog = targetCatelog;
	}
	
}
