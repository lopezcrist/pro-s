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
import com.wozeze.pros.service.iface.target.ITargetService;

/**
 * target Action
 * @author Administrator
 *
 */
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
		setSuccuessMsg(getText(Message.ADD_TARGET_SUCCESS));
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
	
	/**
	 * query targets
	 * @return
	 */
	public String getTargets(){
		QueryParam<Target> queryParam = new QueryParam<Target>(page, target);
		ResultObject<Target> resultObject = targetService.getTargets(queryParam);
		page = resultObject.getPage();
		setPageResult(resultObject.getResults());
		return Constant.QUERY_TARGETS;
	}
	
	/**
	 * to target modify page
	 * @return
	 */
	public String toModifyTargetPage(){
		target = targetService.getTarget(target);
		setPageType(Constant.PAGE_TYPE_UPDATE);
		return Constant.UPDATE_TARGET_PAGE;
	}
	
	/**
	 * modify the target
	 * @return
	 */
	public String modifyTarget(){
		targetService.modifyTarget(target);
		setSuccuessMsg(getText(Message.UPDATE_TARGET_SUCCESS));
		return Constant.OPERATOR_SUCCESS;
	}
	
	/**
	 * remove the target
	 * @return
	 */
	public String removeTarget(){
		targetService.removeTarget(target);
		setSuccuessMsg(getText(Message.DELETE_TARGET_SUCCESS));
		return Constant.OPERATOR_SUCCESS;
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
