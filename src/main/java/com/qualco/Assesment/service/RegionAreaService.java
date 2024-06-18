package com.qualco.Assesment.service;

import com.qualco.Assesment.model.RegionArea;
import com.qualco.Assesment.repository.RegionAreaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RegionAreaService {
    @Autowired
    private RegionAreaRepository regionAreaRepository;

    public List<RegionArea> getAllRegionAreas() {
        return regionAreaRepository.findAll();
    }

    public RegionArea getRegionAreaById(Long id) {
        return regionAreaRepository.findById(id).orElse(null);
    }

    public RegionArea saveRegionArea(RegionArea regionArea) {
        return regionAreaRepository.save(regionArea);
    }

    public void deleteRegionArea(Long id) {
        regionAreaRepository.deleteById(id);
    }
}
