package com.reptile.species.model.service;

import java.util.List;

import com.reptile.species.model.dto.IucnGroup;

public interface IucnGroupService {
	public IucnGroup searchDetail(int icunId);
	public List<IucnGroup> searchAll();
}
