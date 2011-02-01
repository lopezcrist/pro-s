package com.wozeze.pros.action.target_catelog;

import javax.annotation.Resource;
import com.wozeze.pros.action.BaseAction;
import com.wozeze.pros.common.Constant;
import com.wozeze.pros.common.Message;
import com.wozeze.pros.domain.QueryParam;
import com.wozeze.pros.domain.ResultObject;
import com.wozeze.pros.domain.target_catelog.TargetCatelog;
import com.wozeze.pros.service.iface.target_catelog.ITargetCatelogService;

/**
 * 
 * @author Administrator
 * 
 */
public class TargetCatelogAction extends BaseAction {

	private static final long serialVersionUID = 1L;
	
	@Resource
	ITargetCatelogService<TargetCatelog> targetCatelogService;
	
	private TargetCatelog targetCatelog;
	
	/** add: to add page; update: to update page */
	private String pageType;

	/**
	 * to add targetCatelog page
	 * 
	 * @return
	 */
	public String toTargetCatelogAddPage() {
		setPageType(Constant.PAGE_TYPE_ADD);
		return Constant.UPDATE_TARGET_CATELOG_PAGE;
	}

	/**
	 * add a targetCatelog
	 * @return
	 */
	public String addTargetCatelog() {
		targetCatelogService.addTargetCatelog(targetCatelog);
		setSuccuessMsg(getText(Message.ADD_TARGETCATELOG_SUCCESS));
		return Constant.OPERATOR_SUCCESS;
	}
	
	/**
	 * remove a targetCatelog by id
	 * @return
	 */
	public String removeTargetCatelog() {
		targetCatelogService.removeTargetCatelog(targetCatelog);
		setSuccuessMsg(getText(Message.REMOVE_TARGETCATELOG_SUCCESS));
		return Constant.OPERATOR_SUCCESS;
	}
	
	/**
	 * to modify  targetCatelog's page
	 * @return
	 */
	public String toModifyTargetCatelogPage(){
		setPageType(Constant.PAGE_TYPE_UPDATE);
		targetCatelog = targetCatelogService.getTargetCatelog(targetCatelog);
		return Constant.UPDATE_TARGET_CATELOG_PAGE;
	}
	
	/**
	 * modify the targetCatelog
	 * @return
	 */
	public String modifyTargetCatelog(){
		targetCatelogService.modifyTargetCatelog(targetCatelog);
		setSuccuessMsg(getText(Message.MODIFY_TARGETCATELOG_SUCCESS));
		return Constant.OPERATOR_SUCCESS;
	}
	
	/**
	 * query all targetCatelogs
	 * @return
	 */
	public String getTargetCatelogs() {
		QueryParam<TargetCatelog> queryParam = new QueryParam<TargetCatelog>(page, targetCatelog);
		ResultObject<TargetCatelog> resultObject = targetCatelogService.getTargetCatelogs(queryParam);
		page = resultObject.getPage();
		setPageResult(resultObject.getResults());
		return Constant.QUERY_TARGET_CATELOGS;
	}
	
	public TargetCatelog getTargetCatelog() {
		return targetCatelog;
	}

	public void setTargetCatelog(TargetCatelog targetCatelog) {
		this.targetCatelog = targetCatelog;
	}

	public String getPageType() {
		return pageType;
	}

	public void setPageType(String pageType) {
		this.pageType = pageType;
	}

}