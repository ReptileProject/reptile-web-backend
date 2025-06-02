package com.reptile.species.model.service;

import java.util.List;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import com.reptile.species.model.dao.TaxonomyDao;
import com.reptile.species.model.dto.SpeciesGroup;
import com.reptile.species.model.dto.TaxonomyGroup;
import com.reptile.species.model.dto.TaxonomyTable;

import lombok.RequiredArgsConstructor;


@Primary
@Service
@RequiredArgsConstructor
public class TaxonomyServiceImpl implements TaxonomyService{
	private final TaxonomyDao tDao;
	@Override
	public List<SpeciesGroup> searchChildGroups(TaxonomyTable table, int parentGroupId) {
		return tDao.searchChildGroups(table, parentGroupId);
	}

	@Override
	public SpeciesGroup searchGroupDetail(TaxonomyTable table, int groupId) {
		return tDao.searchGroupDetail(table, groupId);
	}

	@Override
	public TaxonomyGroup searchCreatureTaxnomy(int creatureTaxonomyId) {
		return tDao.searchCreatureTaxnomy(creatureTaxonomyId);
	}

	@Override
	public int insertGroup(TaxonomyTable table, SpeciesGroup group) {
		return tDao.insertGroup(table, group);
	}

	@Override
	public int insertTaxnomy(TaxonomyGroup taxnomy) {
		return tDao.insertTaxnomy(taxnomy);
	}

	@Override
	public int deleteGroup(TaxonomyTable table, int groupId) {
		return tDao.deleteGroup(table, groupId);
	}

	@Override
	public int deleteTaxnomy(int taxonomyId) {
		return tDao.deleteTaxnomy(taxonomyId);
	}

	@Override
	public int updateGroup(TaxonomyTable table, SpeciesGroup group) {
		return tDao.updateGroup(table, group);
	}

	@Override
	public int updateTaxnomy(TaxonomyGroup taxnomy) {
		return tDao.updateTaxnomy(taxnomy);
	}

}
