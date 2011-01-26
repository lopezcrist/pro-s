package com.wozeze.pros.common;

/**
 * 分页工具类
 * @author Administrator
 *
 */
public class Page {
	
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

	public Page() {

	}

	public Page(int _totalRows) {
		totalRows = _totalRows;
		totalPages = totalRows / pageSize;
		int mod = totalRows % pageSize;
		if (mod > 0) {
			totalPages++;
		}
		if(totalPages != 1){
			hasNextPage = true;
		}
		currentPage = 1;
		startRow = 0;
	}
	
	public Page(int _totalRows, int _currentPage){
		totalRows = _totalRows;
		totalPages = totalRows / pageSize;
		int mod = totalRows % pageSize;
		if (mod > 0) {
			totalPages++;
		}
		currentPage = _currentPage;
	}
	
	/**
	 * 第一页
	 */
	public void first() {
		currentPage = 1;
		startRow = 0;
		if(totalPages != 1){
			hasNextPage = true;
		}
	}

	/**
	 * 前一页
	 */
	public void previous() {
		if (currentPage == 1) {
			return;
		}
		currentPage--;
		startRow = (currentPage - 1) * pageSize;
		setPreNextBoolean();
	}

	/**
	 * 下一页
	 */
	public void next() {
		if (currentPage < totalPages) {
			currentPage++;
		}
		startRow = (currentPage - 1) * pageSize;
		setPreNextBoolean();
	}

	/**
	 * 最后一页
	 */
	public void last() {
		currentPage = totalPages;
		startRow = (currentPage - 1) * pageSize;
		setPreNextBoolean();
	}

	/**
	 * 刷新页面
	 * @param _currentPage
	 */
	public void refresh(int _currentPage) {
		currentPage = _currentPage;
		if (currentPage > totalPages) {
			last();
		}
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
}
