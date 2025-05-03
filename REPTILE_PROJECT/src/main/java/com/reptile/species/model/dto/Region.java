package com.reptile.species.model.dto;

import lombok.Data;
import lombok.Builder;
import lombok.NoArgsConstructor;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.media.Schema.RequiredMode;
import lombok.AllArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Region {
	@Schema(description="Region Id", requiredMode=RequiredMode.REQUIRED)
	private int regionId;
	@Schema(description="Region Name", requiredMode=RequiredMode.REQUIRED)
	private String regionName;
	@Schema(description="Region Max Temperatur", requiredMode=RequiredMode.NOT_REQUIRED)
	private float maxTemperature;
	@Schema(description="Region Min Temperatur", requiredMode=RequiredMode.NOT_REQUIRED)
	private float minTemperature;
	@Schema(description="Region Max Humidity", requiredMode=RequiredMode.NOT_REQUIRED)
	private float maxHumidity;
	@Schema(description="Region Min Humidity", requiredMode=RequiredMode.NOT_REQUIRED)
	private float minHumidity;
}