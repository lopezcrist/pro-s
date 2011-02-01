package com.wozeze.pros.dao.target_catelog;

import java.util.List;
import com.wozeze.pros.common.Pagination;
import com.wozeze.pros.domain.target_catelog.TargetCatelog;

public interface TargetCatelogMapper {

	/**
	 * add a targetCatelog
	 * @param targetCatelog
	 */
	public void insertTargetCatelog(TargetCatelog targetCatelog);
	
	/**
	 * add relationship between user and targetCatelog
	 * @param targetCatelog
	 */
	public void insertTargetCatelogRelationUser(TargetCatelog targetCatelog);
	
	/**
	 * query some targetCatelog
	 * @param pagination
	 * @return
	 */
	public List<TargetCatelog> queryTargetCatelogPagination(Pagination<TargetCatelog> pagination);
	
	/**
	 * delete a targetCatelog by Id
	 * @param id
	 */
	public void deleteTargetCatelog(TargetCatelog catelog);
	
	/**
	 * query targetCatelog by id
	 * @param catelog
	 */
	public TargetCatelog queryTargetCatelogById(TargetCatelog catelog);
	
	/**
	 * update the targetCatelog
	 * @param catelog
	 */
	public void updateTargetCatelog(TargetCatelog catelog);
}
