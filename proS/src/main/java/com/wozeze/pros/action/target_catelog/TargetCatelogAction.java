package com.wozeze.pros.action.target_catelog;

import java.util.ArrayList;
import java.util.List;
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
		List<TargetCatelog> catelogs = new ArrayList<TargetCatelog>();
		List<TargetCatelog> allCatelogs = targetCatelogService.getTargetCatelogs(targetCatelog);
		int index = 0;
		for(TargetCatelog catelog : allCatelogs){
			catelogs.add(catelog);
			index++;
			if(index == 10){
				break;
			}
		}
		ActionContext.getContext().put("targetCatelogs", catelogs);
		
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
