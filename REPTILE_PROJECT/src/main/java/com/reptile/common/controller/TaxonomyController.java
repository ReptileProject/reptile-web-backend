package com.reptile.common.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.reptile.species.model.dto.SpeciesGroup;
import com.reptile.species.model.dto.TaxonomyGroup;
import com.reptile.species.model.dto.TaxonomyTable;
import com.reptile.species.model.service.TaxonomyService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/species/taxonomy")
@RequiredArgsConstructor
@Tag(name = "Taxonomy", description = "분류군 및 분류체계 관련 API")
public class TaxonomyController implements ControllerHelper {

    private final TaxonomyService taxonomyService;

    @Operation(summary = "하위 그룹 조회", description = "특정 상위 그룹 ID를 기반으로 하위 분류군을 조회합니다.")
    @GetMapping("/{table}/children")
    public ResponseEntity<?> searchChildGroups(
            @PathVariable("table") TaxonomyTable table,
            @RequestParam(name="parentId", required=false) Integer parentGroupId) {
        try {
            List<SpeciesGroup> result = taxonomyService.searchChildGroups(table, parentGroupId);
            return handleSuccess(result);
        } catch (Exception e) {
        	e.printStackTrace();
            return handleFail(e);
        }
    }

    @Operation(summary = "그룹 상세 조회", description = "분류 테이블 내 특정 그룹의 상세 정보를 조회합니다.")
    @GetMapping("/{table}/detail/{groupId}")
    public ResponseEntity<?> searchGroupDetail(
            @PathVariable("table") TaxonomyTable table,
            @PathVariable("groupId") Integer groupId) {
        try {
            SpeciesGroup result = taxonomyService.searchGroupDetail(table, groupId);
            return handleSuccess(result);
        } catch (Exception e) {
        	e.printStackTrace();
            return handleFail(e);
        }
    }

    @Operation(summary = "생물 분류 정보 조회", description = "생물의 taxonomy_id를 통해 전체 분류 정보를 조회합니다.")
    @GetMapping("/creature/{taxonomyId}")
    public ResponseEntity<?> searchCreatureTaxonomy(@PathVariable("taxonomyId") int taxonomyId) {
        try {
            TaxonomyGroup result = taxonomyService.searchCreatureTaxnomy(taxonomyId);
            return handleSuccess(result);
        } catch (Exception e) {
        	e.printStackTrace();
            return handleFail(e);
        }
    }

    @Operation(summary = "그룹 추가", description = "새로운 분류군 그룹을 추가합니다.")
    @PostMapping("/{table}/group")
    public ResponseEntity<?> insertGroup(
            @PathVariable("table") TaxonomyTable table,
            @RequestBody SpeciesGroup group) {
        try {
            int result = taxonomyService.insertGroup(table, group);
            return handleSuccess(result);
        } catch (Exception e) {
        	e.printStackTrace();
            return handleFail(e);
        }
    }

    @Operation(summary = "Taxonomy 추가", description = "TaxonomyGroup을 통해 전체 분류 체계를 추가합니다.")
    @PostMapping("/taxonomy")
    public ResponseEntity<?> insertTaxonomy(@RequestBody TaxonomyGroup taxonomyGroup) {
        try {
            int result = taxonomyService.insertTaxnomy(taxonomyGroup);
            return handleSuccess(result);
        } catch (Exception e) {
        	e.printStackTrace();
            return handleFail(e);
        }
    }

    @Operation(summary = "그룹 삭제", description = "지정한 분류 테이블에서 그룹을 삭제합니다.")
    @DeleteMapping("/{table}/group/{groupId}")
    public ResponseEntity<?> deleteGroup(
            @PathVariable("table") TaxonomyTable table,
            @PathVariable("groupId") int groupId) {
        try {
            int result = taxonomyService.deleteGroup(table, groupId);
            return handleSuccess(result);
        } catch (Exception e) {
        	e.printStackTrace();
            return handleFail(e);
        }
    }
}