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
public class TaxnomyGroup {
	@Schema(description="tanomy group Id", requiredMode=RequiredMode.REQUIRED)
	private int taxnomyId;
	@Schema(description="order Group Id", requiredMode=RequiredMode.NOT_REQUIRED)
	private int orderGroupId;
	@Schema(description="family Group Id", requiredMode=RequiredMode.NOT_REQUIRED)
	private int familyGroupId;
	@Schema(description="tribe Group Id", requiredMode=RequiredMode.NOT_REQUIRED)
	private int tribeGroupId;
	@Schema(description="genus Group Id", requiredMode=RequiredMode.NOT_REQUIRED)
	private int genusGroupId;
	@Schema(description="species Group Id", requiredMode=RequiredMode.NOT_REQUIRED)
	private int speciesGroupId;
}
