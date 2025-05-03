package com.reptile.species.model.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.reptile.search.SpeciesSearchCondition;
import com.reptile.species.model.dto.Creature;

@Mapper
public interface CreatureDao {
	public Creature searchCreatureDetail(int creatureId);
	public List<Creature> search(SpeciesSearchCondition condition);
	
	public int insert(Creature creature);
	
	public int update(Creature creature);
	
	public int delete(int creatureId);
}
