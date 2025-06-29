package com.reptile.species.model.service;

import java.util.List;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import com.reptile.species.model.dao.IucnGroupDao;
import com.reptile.species.model.dto.IucnGroup;

import lombok.RequiredArgsConstructor;

@Primary
@Service
@RequiredArgsConstructor
public class IucnGroupServiceImpl implements IucnGroupService {
	private final IucnGroupDao iDao;
	@Override
	public IucnGroup searchDetail(int icunId) {
		return iDao.searchIucnGroupDetail(icunId);
	}

	@Override
	public List<IucnGroup> searchAll() {
		return iDao.searchAll();
	}

}
