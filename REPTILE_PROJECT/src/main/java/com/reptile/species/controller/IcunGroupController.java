package com.reptile.species.controller;

import java.util.List;
import java.util.Map;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.reptile.common.controller.ControllerHelper;
import com.reptile.species.model.dto.IcunGroup;
import com.reptile.species.model.service.IcunGroupService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("species/icun")
@RequiredArgsConstructor
public class IcunGroupController implements ControllerHelper{
	private final IcunGroupService iService;
	
	@GetMapping
	@Operation(summary="search icun group list")
	@ApiResponses({@ApiResponse(responseCode="200", description="success to return list"),
				  @ApiResponse(responseCode="500", description="fail to return list")})
	public ResponseEntity<?> searchIcunGroups(){
		try {
			List<IcunGroup> list = iService.searchAll();
			return handleSuccess(Map.of("icunGroupList", list));
		}catch(Exception e) {
			return handleFail(e);
		}
	}
	
	@GetMapping("/{icunId}")
	@Operation(summary="search icun group detail")
	@ApiResponses({@ApiResponse(responseCode="200", description="success to return detail"),
				  @ApiResponse(responseCode="500", description="fail to return detail")})
	public ResponseEntity<?> searchIcunGroupDetail(@PathVariable int icunId){
		try {
			IcunGroup icun = iService.searchDetail(icunId);
			return handleSuccess(Map.of("icunGroup", icun));
		}catch(Exception e) {
			return handleFail(e);
		}
	}
}
