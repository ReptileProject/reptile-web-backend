package com.reptile.model.dto;

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
public class IcunGroup {
	@Schema(description="icunGroupId", requiredMode=RequiredMode.REQUIRED)
	private int icunId;
	@Schema(description="icunGroup Name", requiredMode=RequiredMode.REQUIRED)
	private String groupName;
	@Schema(description="icunGroup Level", requiredMode=RequiredMode.REQUIRED)
	private int icunLevel;
	@Schema(description="icunGroup Description", requiredMode=RequiredMode.NOT_REQUIRED)
	private String description;
}
