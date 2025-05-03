package com.reptile.search;

import lombok.Data;

@Data
public class BaseSearchCondition {
	private int currentPage = 1;
	private int itemsPerPage = 10;
	
	public int getOffset() {
		return (currentPage - 1)* itemsPerPage;
	}
}
