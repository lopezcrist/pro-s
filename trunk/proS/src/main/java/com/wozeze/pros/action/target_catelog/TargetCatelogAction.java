package com.wozeze.pros.action.target_catelog;

import java.util.List;
import javax.annotation.Resource;
import com.opensymphony.xwork2.ActionContext;
import com.wozeze.pros.action.BaseAction;
import com.wozeze.pros.common.Page;
import com.wozeze.pros.common.PageUtil;
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
		
		return "operateSuccess";
	}
	
	/**
	 * query all targetCatelogs
	 * @return
	 */
	public String queryTargetCatelogs() {
		setActionUrl("/pages/target_catelog/targetCatelogAction_queryTargetCatelogs.action");
		if(page == null){
			// from the menu link to this action method
			int totalRows = targetCatelogService.getTargetCatelogTotalCount();
			page = new Page(totalRows);
		}else{
			// from the page bottom pagination link to this action method 
			page = PageUtil.getPager(page.getCurrentPage(), page.getNavigationPage(), page.getTotalRows());
		}
		targetCatelog = new TargetCatelog();
		targetCatelog.setPage(page);
		List<TargetCatelog> catelogs = targetCatelogService.getTargetCatelogs(targetCatelog);
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
