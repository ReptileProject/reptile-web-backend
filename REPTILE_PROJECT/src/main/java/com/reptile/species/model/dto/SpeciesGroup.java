package com.reptile.species.model.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.media.Schema.RequiredMode;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class SpeciesGroup {
	@Schema(description="Group Id", requiredMode=RequiredMode.REQUIRED)
	private int groupId;
	@Schema(description="Group Name", requiredMode=RequiredMode.REQUIRED)
	private String groupName;
	@Schema(description="Parent Group Id", requiredMode=RequiredMode.NOT_REQUIRED)
	private int upperGroupId;
}