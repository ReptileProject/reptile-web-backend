package com.reptile.species.controller;

import java.util.List;
import java.util.Map;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.reptile.common.controller.ControllerHelper;
import com.reptile.species.model.dto.IucnGroup;
import com.reptile.species.model.service.IucnGroupService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("species/icun")
@RequiredArgsConstructor
public class IucnGroupController implements ControllerHelper{
	private final IucnGroupService iService;
	
	@GetMapping
	@Operation(summary="search iucn group list")
	@ApiResponses({@ApiResponse(responseCode="200", description="success to return list"),
				  @ApiResponse(responseCode="500", description="fail to return list")})
	public ResponseEntity<?> searchIucnGroups(){
		try {
			List<IucnGroup> list = iService.searchAll();
			return handleSuccess(Map.of("iucnGroupList", list));
		}catch(Exception e) {
			return handleFail(e);
		}
	}
	
	@GetMapping("/{iucnId}")
	@Operation(summary="search iucn group detail")
	@ApiResponses({@ApiResponse(responseCode="200", description="success to return detail"),
				  @ApiResponse(responseCode="500", description="fail to return detail")})
	public ResponseEntity<?> searchIucnGroupDetail(@PathVariable int iucnId){
		try {
			IucnGroup iucn = iService.searchDetail(iucnId);
			return handleSuccess(Map.of("iucnGroup", iucn));
		}catch(Exception e) {
			return handleFail(e);
		}
	}
}
