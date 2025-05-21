package com.reptile.species.model.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.reptile.species.model.dto.SpeciesGroup;
import com.reptile.species.model.dto.TaxonomyGroup;
import com.reptile.species.model.dto.TaxonomyTable;


@Mapper
public interface TaxonomyDao {
	public List<SpeciesGroup> searchChildGroups(TaxonomyTable table, int parentGroupId);
	public SpeciesGroup searchGroupDetail(TaxonomyTable table, int groupId);
	public TaxonomyGroup searchCreatureTaxnomy(int creatureTaxonomyId);
	
	public int insertGroup(TaxonomyTable table, SpeciesGroup group);
	public int insertTaxnomy(TaxonomyGroup taxnomy);
	
	public int deleteGroup(TaxonomyTable table, int groupId);
	public int deleteTaxnomy(int taxonomyId);
	
	public int updateGroup(TaxonomyTable table, SpeciesGroup group);
	public int updateTaxnomy(TaxonomyGroup taxnomy);
}
