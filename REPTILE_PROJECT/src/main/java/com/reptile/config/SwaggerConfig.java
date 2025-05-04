package com.reptile.config;

import org.springdoc.core.models.GroupedOpenApi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;

@Configuration
@OpenAPIDefinition(info=@Info(title="REPTILE API", version="v1"))
public class SwaggerConfig {
	@Bean
	GroupedOpenApi speciesOpenApi() {
		String[] paths = {"/reptile/species/**"};
		return GroupedOpenApi.builder().group("SPECIES API").pathsToMatch(paths).build();
	}
}
