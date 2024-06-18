package com.qualco.Assesment.controller;

import com.qualco.Assesment.model.CountryStats;
import com.qualco.Assesment.service.CountryStatsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/country-stats")
public class CountryStatsController {
    @Autowired
    private CountryStatsService countryStatsService;

    @GetMapping
    public List<CountryStats> getAllCountryStats() {
        return countryStatsService.getAllCountryStats();
    }

    @GetMapping("/{id}")
    public CountryStats getCountryStatsById(@PathVariable Long id) {
        return countryStatsService.getCountryStatsById(id);
    }

    @PostMapping
    public CountryStats createCountryStats(@RequestBody CountryStats countryStats) {
        return countryStatsService.saveCountryStats(countryStats);
    }

    @DeleteMapping("/{id}")
    public void deleteCountryStats(@PathVariable Long id) {
        countryStatsService.deleteCountryStats(id);
    }
}
