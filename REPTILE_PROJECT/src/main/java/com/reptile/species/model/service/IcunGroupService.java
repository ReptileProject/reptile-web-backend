package com.reptile.species.model.service;

import java.util.List;

import com.reptile.species.model.dto.IcunGroup;

public interface IcunGroupService {
	public IcunGroup searchDetail(int icunId);
	public List<IcunGroup> searchAll();
}
