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
public class Creature {
	@Schema(description="id for creature", requiredMode=RequiredMode.REQUIRED)
	private int creatureId;
	@Schema(description="creature name", requiredMode=RequiredMode.REQUIRED)
	private String creatureName;
	@Schema(description="creature description", requiredMode=RequiredMode.REQUIRED)
	private String descript;
	@Schema(description="creature's icun group", requiredMode=RequiredMode.NOT_REQUIRED)
	private int icunId;
	@Schema(description="id for creature's habitat", requiredMode=RequiredMode.REQUIRED)
	private int regionId;
	@Schema(description="id for creature's kind", requiredMode=RequiredMode.REQUIRED)
	private int groupId;
}
