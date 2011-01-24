package com.wozeze.pros.action.target_catelog;

import javax.annotation.Resource;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.wozeze.pros.domain.target_catelog.TargetCatelog;
import com.wozeze.pros.service.iface.target_catelog.ITargetCatelogService;

/**
 * 
 * @author Administrator
 * 
 */
public class TargetCatelogAction extends ActionSupport {

	private static final long serialVersionUID = 1L;
	
	@Resource
	ITargetCatelogService targetCatelogService;

	/**
	 * 跳转到目标分类添加页面
	 * 
	 * @return
	 */
	public String toTargetCatelogAddPage() {
		return "targetCatelogAddPage";
	}

	/**
	 * add a targetCatelog
	 * @return
	 */
	public String addTargetCatelog() {
		targetCatelogService.addTargetCatelog(targetCatelog);
		ActionContext.getContext().put("success_content", "添加目标分类成功");
		return "addTargetCatelogSuccess";
	}
	
	/**
	 * query all targetCatelogs
	 * @return
	 */
	public String queryTargetCatelogs() {
		ActionContext.getContext().put("targetCatelogs", targetCatelogService.getTargetCatelogs(targetCatelog));
		return "queryTargetCatelogs";
	}

	private TargetCatelog targetCatelog;

	public TargetCatelog getTargetCatelog() {
		return targetCatelog;
	}

	public void setTargetCatelog(TargetCatelog targetCatelog) {
		this.targetCatelog = targetCatelog;
	}

}
