package com.reptile.search;

import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = false)
@Data
public class SpeciesSearchCondition extends BaseSearchCondition{
	private String keyWord;
	private Integer icunGroupId;
	private Integer regionId;
	private Integer spciesGroupId;
}
