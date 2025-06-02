package com.reptile.species.model.dto;

public enum TaxonomyTable {
    SPECIES("Species_Group"),
    GENUS("Genus_Group"),
    TRIBE("Tribe_Group"),
    FAMILY("Family_Group"),
    ORDER("Order_Group");

	private final String tableName;
	
    TaxonomyTable(String tableName) {
		this.tableName = tableName;
	}
    
    public String getTaxonomyTable() {
    	return tableName;
    }
}
