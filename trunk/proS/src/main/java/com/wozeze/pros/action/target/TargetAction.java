package com.wozeze.pros.action.target;

import java.util.List;
import javax.annotation.Resource;
import com.wozeze.pros.action.BaseAction;
import com.wozeze.pros.common.Constant;
import com.wozeze.pros.domain.QueryParam;
import com.wozeze.pros.domain.target.Target;
import com.wozeze.pros.domain.target_catelog.TargetCatelog;
import com.wozeze.pros.service.iface.target.ITargetService;

public class TargetAction extends BaseAction {
	
	private static final long serialVersionUID = 1L;
	
	@Resource
	ITargetService<Target> targetService;
	
	List<TargetCatelog> targetCatelogs;
	
	private Target target;
	
	/** add: to add page; update: to update page */
	private String pageType;

	/**
	 * to update or add page
	 * @return
	 */
	public String toTargetAddPage() {
		setPageType(Constant.PAGE_TYPE_ADD);
		return Constant.UPDATE_TARGET_PAGE;
	}
	
	/**
	 * add a target
	 * @return
	 */
	public String addTarget(){
		targetService.addTarget(target);
		return Constant.OPERATOR_SUCCESS;
	}
	
	/**
	 * get the select tag values
	 * @return
	 */
	public List<TargetCatelog> getTargetCatelogs() {
		QueryParam<TargetCatelog> queryParam = new QueryParam<TargetCatelog>(true);
		targetCatelogs = targetService.getTargetCatelogs(queryParam);
		return targetCatelogs;
	}
	
	public String getPageType() {
		return pageType;
	}

	public void setPageType(String pageType) {
		this.pageType = pageType;
	}
	
	public void setTargetCatelogs(List<TargetCatelog> targetCatelogs) {
		this.targetCatelogs = targetCatelogs;
	}

	public Target getTarget() {
		return target;
	}

	public void setTarget(Target target) {
		this.target = target;
	}

}
