package com.qualco.Assesment.controller;

import com.qualco.Assesment.model.RegionArea;
import com.qualco.Assesment.service.RegionAreaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/region-areas")
public class RegionAreaController {
    @Autowired
    private RegionAreaService regionAreaService;

    @GetMapping
    public List<RegionArea> getAllRegionAreas() {
        return regionAreaService.getAllRegionAreas();
    }

    @GetMapping("/{id}")
    public RegionArea getRegionAreaById(@PathVariable Long id) {
        return regionAreaService.getRegionAreaById(id);
    }

    @PostMapping
    public RegionArea createRegionArea(@RequestBody RegionArea regionArea) {
        return regionAreaService.saveRegionArea(regionArea);
    }

    @DeleteMapping("/{id}")
    public void deleteRegionArea(@PathVariable Long id) {
        regionAreaService.deleteRegionArea(id);
    }
}
