package com.wozeze.pros.service.impl.target_catelog;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.wozeze.pros.common.Constant;
import com.wozeze.pros.common.Pagination;
import com.wozeze.pros.dao.target_catelog.TargetCatelogMapper;
import com.wozeze.pros.domain.target_catelog.TargetCatelog;
import com.wozeze.pros.service.BaseService;
import com.wozeze.pros.service.iface.target_catelog.ITargetCatelogService;

@Service
public class TargetCatelogServiceImpl extends BaseService<TargetCatelog> implements ITargetCatelogService<TargetCatelog> {
	
	@Autowired
	TargetCatelogMapper targetCatelogMapper;
	
	/**
	 * add a targetCatelog
	 * @param catelog
	 */
	@Override
	@Transactional
	public void addTargetCatelog(TargetCatelog catelog) {
		targetCatelogMapper.insertTargetCatelog(catelog);
		targetCatelogMapper.insertTargetCatelogRelationUser(catelog);
	}

	@Override
	public Pagination<TargetCatelog> findTargetCatelogPagination(Pagination<TargetCatelog> pagination){
		pagination = setPagination(pagination, Constant.T_TARGET_CATELOG);
		if(pagination.getTotalRows() == 0){
			return pagination;
		}else{
			List<TargetCatelog> catelogs = targetCatelogMapper.queryTargetCatelogPagination(pagination);
			pagination.setItems(catelogs);
			return pagination;
		}
	}
	
	@Override
	public void removeTargetCatelog(TargetCatelog catelog){
		targetCatelogMapper.deleteTargetCatelog(catelog);
	}

	@Override
	public TargetCatelog findTargetCatelog(TargetCatelog catelog) {
		return targetCatelogMapper.queryTargetCatelogById(catelog);
	}

	@Override
	public void modifyTargetCatelog(TargetCatelog catelog) {
		targetCatelogMapper.updateTargetCatelog(catelog);
	}
}
