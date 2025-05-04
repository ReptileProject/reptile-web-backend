package com.reptile.species.model.service;

import com.reptile.search.Page;
import com.reptile.search.SpeciesSearchCondition;
import com.reptile.species.model.dto.Creature;

public interface CreatureService {
	public Page<Creature> searchCreatures(SpeciesSearchCondition condition);
	public Creature searchCreatureDetail(int creatureId);
	
	public int registCreature(Creature creature);
	
	public int updateCreature(Creature creature);
	
	public int deleteCreature(int creatureId);
}
