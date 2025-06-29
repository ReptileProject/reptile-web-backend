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
public class IucnGroup {
	@Schema(description="icunGroupId", requiredMode=RequiredMode.REQUIRED)
	private int iucnId;
	@Schema(description="icunGroup Level", requiredMode=RequiredMode.REQUIRED)
	private String groupLevel;
	@Schema(description="icunGroup Description", requiredMode=RequiredMode.NOT_REQUIRED)
	private String description;
}
