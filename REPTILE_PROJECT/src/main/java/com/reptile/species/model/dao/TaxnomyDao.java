package com.reptile.species.model.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.reptile.species.model.dto.SpeciesGroup;
import com.reptile.species.model.dto.TaxnomyGroup;

@Mapper
public interface TaxnomyDao {
	public List<SpeciesGroup> searchChildGroups(String table, int parentGroupId);
	public SpeciesGroup searchGroupDetail(String table, int groupId);
	public TaxnomyGroup searchCreatureTaxnomy(int creatureId);
	
	public int insertGroup(String table, SpeciesGroup group);
	public int insertTaxnomy(TaxnomyGroup taxnomy);
	
	public int deleteGroup(String table, int groupId);
	public int deleteTaxnomy(int taxnomyId);
	
	public int updateGroup(String table, SpeciesGroup group);
	public int updateTaxnomy(TaxnomyGroup taxnomy);
}
