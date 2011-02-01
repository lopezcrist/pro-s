package com.wozeze.pros.service.impl.target;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.wozeze.pros.common.Constant;
import com.wozeze.pros.common.Pagination;
import com.wozeze.pros.dao.target.TargetMapper;
import com.wozeze.pros.domain.target.Target;
import com.wozeze.pros.domain.target_catelog.TargetCatelog;
import com.wozeze.pros.service.BaseService;
import com.wozeze.pros.service.iface.target.ITargetService;
import com.wozeze.pros.service.iface.target_catelog.ITargetCatelogService;

@Service
public class TargetServiceImpl extends BaseService<Target> implements ITargetService<Target>{

	@Autowired
	TargetMapper targetMapper;
	
	@Resource
	ITargetCatelogService<TargetCatelog> targetCatelogService;
	
	@Override
	@Transactional
	public void addTarget(Target target) {
		targetMapper.insertTarget(target);
		targetMapper.insertTargetRelationTargetCatelog(target);
		targetMapper.insertTargetRelationUser(target);
	}
	
	@Override
	public Pagination<TargetCatelog> findTargetCatelogPagination(Pagination<TargetCatelog> pagination){
		return targetCatelogService.findTargetCatelogPagination(pagination);
	}
	
	/**
	 * get all targetCatelogs
	 * @return
	 */
	@Override
	public Pagination<Target> findTargetPagination(Pagination<Target> pagination){
		pagination = setPagination(pagination, Constant.T_TARGET);
		if(pagination.getTotalRows() == 0){
			return pagination;
		}else{
			List<Target> targets = targetMapper.queryTargetPagination(pagination);
			pagination.setItems(targets);
			return pagination;
		}
	}

	/**
	 * find target by id
	 * @param target
	 */
	@Override
	public Target findTarget(Target target) {
		return targetMapper.queryTargetById(target);
	}

	
	/**
	 * remove the target
	 * @param target
	 */
	@Override
	@Transactional
	public void modifyTarget(Target target) {
		targetMapper.deleteTargetRelationTargetCatelog(target);
		targetMapper.updateTarget(target);
		targetMapper.insertTargetRelationTargetCatelog(target);
	}

	/**
	 * remove the target
	 * @param
	 */
	@Override
	public void removeTarget(Target target) {
		targetMapper.deleteTarget(target);
	}

}
