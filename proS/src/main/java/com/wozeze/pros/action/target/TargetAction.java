package com.wozeze.pros.action.target;

import java.util.List;
import javax.annotation.Resource;
import com.wozeze.pros.action.BaseAction;
import com.wozeze.pros.common.Constant;
import com.wozeze.pros.common.Message;
import com.wozeze.pros.common.Pagination;
import com.wozeze.pros.domain.target.Target;
import com.wozeze.pros.domain.target_catelog.TargetCatelog;
import com.wozeze.pros.service.iface.target.ITargetService;

/**
 * target Action
 * @author Administrator
 *
 */
public class TargetAction extends BaseAction<Target> {
	
	private static final long serialVersionUID = 1L;
	
	@Resource
	ITargetService<Target> targetService;
	
	List<TargetCatelog> targetCatelogs;
	
	private Target target = new Target();
	
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
		target.setUser(getUser());
		targetService.addTarget(target);
		setSuccuessMsg(getText(Message.ADD_TARGET_SUCCESS));
		return Constant.OPERATOR_SUCCESS;
	}
	
	/**
	 * get the select tag values
	 * @return
	 */
	public List<TargetCatelog> getTargetCatelogs() {
		TargetCatelog targetCatelog = new TargetCatelog();
		targetCatelog.setUser(getUser());
		Pagination<TargetCatelog> paginationCatelog = new Pagination<TargetCatelog>();
		paginationCatelog.setAll(true);
		paginationCatelog.setParamObject(targetCatelog);
		targetCatelogs = targetService.findTargetCatelogPagination(paginationCatelog).getItems();
		return targetCatelogs;
	}
	
	/**
	 * find target
	 * @return
	 */
	public String findTargets(){
		target.setUser(getUser());
		pagination.setParamObject(target);
		pagination = targetService.findTargetPagination(pagination);
		if(pagination.getTotalRows() > 0){
			setPageResult(pagination.getItems());
			return Constant.QUERY_TARGETS;
		}else {
			setFailureMsg(getText(Message.NO_RESULT));
			return Constant.OPERATOR_FAILURE;
		}
	}
	
	/**
	 * to target modify page
	 * @return
	 */
	public String toModifyTargetPage(){
		target = targetService.findTarget(target);
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
