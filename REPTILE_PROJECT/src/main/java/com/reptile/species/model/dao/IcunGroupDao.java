package com.reptile.species.model.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.reptile.species.model.dto.IcunGroup;

@Mapper
public interface IcunGroupDao {
	public IcunGroup searchIcunGroupDetail(int groupId);
	public List<IcunGroup> searchAll();
}
