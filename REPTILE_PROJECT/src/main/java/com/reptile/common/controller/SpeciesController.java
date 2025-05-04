package com.reptile.common.controller;

import java.util.Map;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.reptile.search.Page;
import com.reptile.search.SpeciesSearchCondition;
import com.reptile.species.model.dto.Creature;
import com.reptile.species.model.service.CreatureService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("reptile/species")
@RequiredArgsConstructor
public class SpeciesController implements ControllerHelper{
	private final CreatureService cService;
		
	@GetMapping("/{creatureId}")
	@Operation(summary="search creature list with search condition")
	@ApiResponses({@ApiResponse(responseCode="200", description="success to return list", content=@io.swagger.v3.oas.annotations.media.Content(
            mediaType="application/json",
            schema=@io.swagger.v3.oas.annotations.media.Schema(implementation=Creature.class)
        )), 
				   @ApiResponse(responseCode="500", description="fail to return list")}
			)
	public ResponseEntity<?> searchCreatureDetail(@PathVariable int creatureId) {
		try {
			Creature creature = cService.searchCreatureDetail(creatureId);
			return handleSuccess(Map.of("creatureDetail", creature));
		}catch(Exception e) {
			return handleFail(e);
		}
	}
	
	@GetMapping
	@Operation(summary="search creature detail")
	@ApiResponses({@ApiResponse(responseCode="200", description="success to return detail", content=@io.swagger.v3.oas.annotations.media.Content(
            mediaType="application/json",
            schema=@io.swagger.v3.oas.annotations.media.Schema(implementation=Creature.class)
        )), 
				   @ApiResponse(responseCode="500", description="fail to return detail")}
			)
	public ResponseEntity<?> searchCreatures(@ModelAttribute SpeciesSearchCondition condition){
		try {
			Page<Creature> page = cService.searchCreatures(condition);
			
			return handleSuccess(Map.of("creaturePage", page, "currentPage", page.getCondition().getCurrentPage(),"totalPage", page.getTotalPages()));
		}catch(Exception e) {
			return handleFail(e);
		}
	}
}
