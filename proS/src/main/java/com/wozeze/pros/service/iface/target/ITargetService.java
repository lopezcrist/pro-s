package com.wozeze.pros.service.iface.target;

import com.wozeze.pros.common.Pagination;
import com.wozeze.pros.domain.target.Target;
import com.wozeze.pros.domain.target_catelog.TargetCatelog;

public interface ITargetService<T> {

	/**
	 * add a target
	 * @param target
	 */
	public void addTarget(Target target);
	
	/**
	 * find targetCatelogs
	 * @param pagination
	 * @return
	 */
	public Pagination<TargetCatelog> findTargetCatelogPagination(Pagination<TargetCatelog> pagination);
	
	/**
	 * get all targetCatelogs
	 * @return
	 */
	public Pagination<Target> findTargetPagination(Pagination<Target> pagination);
	
	/**
	 * fina a target by id
	 * @param target
	 * @return
	 */
	public Target findTarget(Target target);

	/**
	 * remove the target
	 * @param target
	 */
	public void modifyTarget(Target target);
	
	/**
	 * remove the target
	 * @param target
	 */
	public void removeTarget(Target target);
}
