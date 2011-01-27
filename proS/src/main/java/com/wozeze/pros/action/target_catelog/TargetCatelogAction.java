package com.wozeze.pros.action.target_catelog;

import javax.annotation.Resource;
import com.opensymphony.xwork2.ActionContext;
import com.wozeze.pros.action.BaseAction;
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
	
	/**
	 * 跳转到目标分类添加页面
	 * 
	 * @return
	 */
	public String toTargetCatelogAddPage() {
		return "updateTargetCatelogPage";
	}

	/**
	 * add a targetCatelog
	 * @return
	 */
	public String addTargetCatelog() {
		targetCatelogService.addTargetCatelog(targetCatelog);
		ActionContext.getContext().put("success_content", "添加目标分类成功");
		return "operateSuccess";
	}
	
	/**
	 * remove a targetCatelog by id
	 * @return
	 */
	public String removeTargetCatelog() {
		targetCatelogService.removeTargetCatelog(targetCatelog);
		ActionContext.getContext().put("success_content", "删除目标分类成功");
		return "operateSuccess";
	}
	
	/**
	 * to modify  targetCatelog's page
	 * @return
	 */
	public String toModifyTargetCatelogPage(){
		targetCatelog = targetCatelogService.getTargetCatelog(targetCatelog);
		return "updateTargetCatelogPage";
	}
	
	/**
	 * query all targetCatelogs
	 * @return
	 */
	public String queryTargetCatelogs() {
		QueryParam<TargetCatelog> queryParam = new QueryParam<TargetCatelog>(page, targetCatelog);
		ResultObject<TargetCatelog> resultObject = targetCatelogService.getTargetCatelogs(queryParam);
		page = resultObject.getPage();
		ActionContext.getContext().put("targetCatelogs", resultObject.getResults());
		return "queryTargetCatelogs";
	}
	
	public TargetCatelog getTargetCatelog() {
		return targetCatelog;
	}

	public void setTargetCatelog(TargetCatelog targetCatelog) {
		this.targetCatelog = targetCatelog;
	}

}
