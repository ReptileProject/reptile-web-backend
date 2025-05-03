package com.reptile.model.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.reptile.model.dto.Creature;
import com.reptile.model.dto.BaseSearchCondition;

@Mapper
public interface CreatureDao {
	public Creature searchCreatureDetail(int creatureId);
	public List<Creature> search(ReptileSearchCondition condition);
}
