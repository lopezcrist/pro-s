package com.wozeze.pros.domain;

import java.util.List;
import com.wozeze.pros.common.Page;

public class ResultObject<T> {
	
	private Page page;
	private List<T> results;
	
	public Page getPage() {
		return page;
	}
	public void setPage(Page page) {
		this.page = page;
	}
	public List<T> getResults() {
		return results;
	}
	public void setResults(List<T> results) {
		this.results = results;
	}
}
