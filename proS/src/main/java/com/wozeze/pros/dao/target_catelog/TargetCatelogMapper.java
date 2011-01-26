package com.wozeze.pros.dao.target_catelog;

import java.util.List;

import com.wozeze.pros.domain.target_catelog.TargetCatelog;

public interface TargetCatelogMapper {

	/**
	 * add a targetCatelog
	 * @param targetCatelog
	 */
	public void insertTargetCatelog(TargetCatelog targetCatelog);
	
	/**
	 * query some targetCatelog
	 * @param targetCatelog
	 * @return
	 */
	public List<TargetCatelog> queryTargetCatelogs(TargetCatelog targetCatelog);
	
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
}
