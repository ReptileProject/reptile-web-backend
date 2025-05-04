package com.reptile.search;

import java.util.List;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Page <T>{
	private BaseSearchCondition condition;
	private int navSize = 5;
	private int totalItems;
	private List<T> list;
	
	private int totalPages;
	private boolean hasPre;
	private boolean hasNext;
	private int startPage;
	private int endPage;
	
	
	public Page(BaseSearchCondition condition, int totalItems, List<T> list) {
        this.condition = condition;
        this.totalItems = totalItems;
        this.list = list;

        // 전체 페이지 수 계산
        this.totalPages = (int) Math.ceil((double) totalItems / condition.getItemsPerPage());

        // 시작 페이지와 끝 페이지 계산
        this.startPage = (condition.getCurrentPage() - 1) / navSize * navSize + 1;
        this.endPage = Math.min(startPage + navSize - 1, totalPages);

        // 이전/다음 버튼 활성화 여부
        this.hasPre = startPage != 1;
        this.hasNext = endPage < totalPages;
    }
}

