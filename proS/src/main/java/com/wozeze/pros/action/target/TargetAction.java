package com.wozeze.pros.action.target;

import java.util.List;

import javax.annotation.Resource;

import com.wozeze.pros.action.BaseAction;
import com.wozeze.pros.common.Constant;
import com.wozeze.pros.common.Message;
import com.wozeze.pros.domain.QueryParam;
import com.wozeze.pros.domain.ResultObject;
import com.wozeze.pros.domain.target.Target;
import com.wozeze.pros.domain.target_catelog.TargetCatelog;
import com.wozeze.pros.service.iface.target_catelog.ITargetCatelogService;

public class TargetAction extends BaseAction {
	
	private static final long serialVersionUID = 1L;
	
	@Resource
	ITargetCatelogService<TargetCatelog> targetCatelogService;
	
	List<TargetCatelog> targetCatelogs;
	
	private Target target;
	
	/** add: to add page; update: to update page */
	private String pageType;
	
	public String toTargetAddPage() {
		setPageType(Constant.PAGE_TYPE_ADD);
		return Constant.UPDATE_TARGET_PAGE;
	}
	
	/**
	 * add a target
	 * @return
	 */
	public String addTarget(){
		if("-1".equals(target.getTargetCatelog().getId())){
			addFieldError(Constant.TARGET_TARGETCATELOG_ID, getText(Message.SELECT_ONE_TARGETCATELOG));
			setPageType(Constant.PAGE_TYPE_ADD);
			return Constant.UPDATE_TARGET_PAGE;
		}else{
			return Constant.OPERATOR_SUCCESS;
		}
	}
	
	public String getPageType() {
		return pageType;
	}

	public void setPageType(String pageType) {
		this.pageType = pageType;
	}
	
	public List<TargetCatelog> getTargetCatelogs() {
		QueryParam<TargetCatelog> queryParam = new QueryParam<TargetCatelog>(true);
		ResultObject<TargetCatelog> resultObject = targetCatelogService.getTargetCatelogs(queryParam);
		targetCatelogs = resultObject.getResults();
		return targetCatelogs;
	}

	public void setTargetCatelogs(List<TargetCatelog> targetCatelogs) {
		this.targetCatelogs = targetCatelogs;
	}

	public Target getTarget() {
		if(target == null){
			System.out.println("null");
		}else {
			System.out.println(target.getTargetCatelog().getId());
		}
		return target;
	}

	public void setTarget(Target target) {
		this.target = target;
	}

}
