package com.reptile.species.model.service;

import java.util.List;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import com.reptile.species.model.dao.IcunGroupDao;
import com.reptile.species.model.dto.IcunGroup;

import lombok.RequiredArgsConstructor;

@Primary
@Service
@RequiredArgsConstructor
public class IcunGroupServiceImpl implements IcunGroupService {
	private final IcunGroupDao iDao;
	@Override
	public IcunGroup searchDetail(int icunId) {
		return iDao.searchIcunGroupDetail(icunId);
	}

	@Override
	public List<IcunGroup> searchAll() {
		return iDao.searchAll();
	}

}
