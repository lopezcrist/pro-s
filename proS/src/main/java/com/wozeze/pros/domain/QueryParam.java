package com.wozeze.pros.domain;

import com.wozeze.pros.common.Page;

public class QueryParam<T> {
	
	public QueryParam(){
		
	}
	
	public QueryParam(Page _page, T _paramObject){
		this.page = _page;
		this.paramObject = _paramObject;
	}
	
	private Page page;
	private T paramObject;
	
	public Page getPage() {
		return page;
	}
	public QueryParam<T> setPage(Page page) {
		this.page = page;
		return this;
	}
	public Object getParamObject() {
		return paramObject;
	}
	public void setParamObject(T paramObject) {
		this.paramObject = paramObject;
	}
}
