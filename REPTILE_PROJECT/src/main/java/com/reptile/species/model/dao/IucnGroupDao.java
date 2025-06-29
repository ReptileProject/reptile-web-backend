package com.reptile.species.model.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.reptile.species.model.dto.IucnGroup;

@Mapper
public interface IucnGroupDao {
	public IucnGroup searchIucnGroupDetail(int groupId);
	public List<IucnGroup> searchAll();
}
