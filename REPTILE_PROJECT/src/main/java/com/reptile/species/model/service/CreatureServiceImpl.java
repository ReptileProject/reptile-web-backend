package com.reptile.species.model.service;

import java.util.List;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import com.reptile.search.Page;
import com.reptile.search.SpeciesSearchCondition;
import com.reptile.species.model.dao.CreatureDao;
import com.reptile.species.model.dao.TaxonomyDao;
import com.reptile.species.model.dto.Creature;
import com.reptile.species.model.dto.TaxonomyGroup;

import lombok.RequiredArgsConstructor;

@Primary
@Service
@RequiredArgsConstructor
public class CreatureServiceImpl implements CreatureService{
	private final CreatureDao cDao;
	@Override
	public Page<Creature> searchCreatures(SpeciesSearchCondition condition) {
		int total = cDao.searchTotalCount(condition);
		List<Creature> list = cDao.search(condition);
		
		return new Page<>(condition, total, list);
	}

	@Override
	public Creature searchCreatureDetail(int creatureId) {
		return cDao.searchCreatureDetail(creatureId);
	}

	@Override
	public int registCreature(Creature creature) {
		return cDao.insert(creature);
	}

	@Override
	public int updateCreature(Creature creature) {
		return cDao.update(creature);
	}

	@Override
	public int deleteCreature(int creatureId) {
		return cDao.delete(creatureId);
	}

}
