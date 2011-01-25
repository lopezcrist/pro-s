package com.wozeze.pros.common;

public class PageUtil {

	/**
	 * 返回page实体
	 * @param currentPage
	 * @param pagerMethod
	 * @param totalRows
	 * @return
	 */
	public static Page getPager(Integer currentPage, String pagerMethod, int totalRows) {
		// 定义pager对象，用于传到页面
		Page pager = new Page(totalRows);
		// 如果当前页号为空，表示为首次查询该页
		// 如果不为空，则刷新pager对象，输入当前页号等信息
		if (currentPage != null) {
			pager.refresh(currentPage);
		}
		// 获取当前执行的方法，首页，前一页，后一页，尾页。
		if (pagerMethod != null) {
			if (pagerMethod.equals(Constant.TO_FIRST)){
				pager.first();
			}else if(pagerMethod.equals(Constant.TO_PREVIOUS)){
				pager.previous();
			}else if(pagerMethod.equals(Constant.TO_NEXT)){
				pager.next();
			}else if(pagerMethod.equals(Constant.TO_LAST)){
				pager.last();
			}
		}
		return pager;
	}
}
