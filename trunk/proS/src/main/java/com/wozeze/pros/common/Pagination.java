package com.wozeze.pros.common;

import java.util.List;

/**
 * pagination tools
 * @author Administrator
 *
 */
public class Pagination<T> {
	
	/** 对象集合 */
	private List<T> items;
	/** 查询对象 */
	private T paramObject;
	/** true: find all */
	private boolean all;
	/** 总行数 */
	private int totalRows; 
	/** 每页显示的行数 */
	private int pageSize = 10; 
	/** 当前页号 */
	private int currentPage;  
	/** 总页数 */
	private int totalPages;  
	/** 当前页在数据库中的起始行 */
	private int startRow;  
	/** 是否有上一页 */
	private boolean hasPreviousPage;
	/** 是否有下一页 */
	private boolean hasNextPage;
	/** 翻页类型 */
	private String navigationPage;

	public Pagination() {
		setPreNextBoolean();
	}

	public Pagination(int _totalRows, T _paramObject, boolean _all) {
		this.paramObject = _paramObject;
		totalRows = _totalRows;
		totalPages = totalRows / pageSize;
		int mod = totalRows % pageSize;
		if (mod > 0) {
			totalPages++;
		}
		currentPage = 1;
		startRow = 0;
		all = _all;
		setPreNextBoolean();
	}
	
	public Pagination(int _totalRows, int _currentPage, T _paramObject, boolean _all){
		this.paramObject = _paramObject;
		totalRows = _totalRows;
		totalPages = totalRows / pageSize;
		int mod = totalRows % pageSize;
		if (mod > 0) {
			totalPages++;
		}
		startRow = (_currentPage - 1) * pageSize;
		currentPage = _currentPage;
		all = _all;
		setPreNextBoolean();
	}
	
	private void setPreNextBoolean(){
		if(currentPage != 1){
			hasPreviousPage = true;
		}
		if(currentPage != totalPages){
			hasNextPage = true;
		}
	}

	public int getStartRow() {
		return startRow;
	}

	public int getTotalPages() {
		return totalPages;
	}

	public int getCurrentPage() {
		return currentPage;
	}

	public int getPageSize() {
		return pageSize;
	}

	public void setTotalRows(int totalRows) {
		this.totalRows = totalRows;
	}

	public void setStartRow(int startRow) {
		this.startRow = startRow;
	}

	public void setTotalPages(int totalPages) {
		this.totalPages = totalPages;
	}

	public void setCurrentPage(int currentPage) {
		this.currentPage = currentPage;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	public int getTotalRows() {
		return totalRows;
	}
	
	public int getEndRow() {
		return startRow + pageSize;
	}

	public boolean isHasPreviousPage() {
		return hasPreviousPage;
	}

	public void setHasPreviousPage(boolean hasPreviousPage) {
		this.hasPreviousPage = hasPreviousPage;
	}

	public boolean isHasNextPage() {
		return hasNextPage;
	}

	public void setHasNextPage(boolean hasNextPage) {
		this.hasNextPage = hasNextPage;
	}
	
	public String getNavigationPage() {
		return navigationPage;
	}

	public void setNavigationPage(String navigationPage) {
		this.navigationPage = navigationPage;
	}
	
	public List<T> getItems() {
		return items;
	}

	public void setItems(List<T> items) {
		this.items = items;
	}
	
	public T getParamObject() {
		return paramObject;
	}

	public void setParamObject(T paramObject) {
		this.paramObject = paramObject;
	}
	public boolean isAll() {
		return all;
	}

	public void setAll(boolean all) {
		this.all = all;
	}
}
