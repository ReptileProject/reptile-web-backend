package com.reptile.species.model.dto;

public enum TaxonomyTable {
    SPECIES("species_group"),
    GENUS("genus_group"),
    TRIBE("tribe_group"),
    FAMILY("family_group"),
    ORDER("order_group");

    private final String tableName;

    TaxonomyTable(String tableName) {
        this.tableName = tableName;
    }

    public String getTaxonomyTable() {
        return tableName;
    }
}
