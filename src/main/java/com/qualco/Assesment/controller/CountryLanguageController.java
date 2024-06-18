package com.qualco.Assesment.controller;

import com.qualco.Assesment.model.CountryLanguage;
import com.qualco.Assesment.service.CountryLanguageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/country-languages")
public class CountryLanguageController {
    @Autowired
    private CountryLanguageService countryLanguageService;

    @GetMapping
    public List<CountryLanguage> getAllCountryLanguages() {
        return countryLanguageService.getAllCountryLanguages();
    }

    @GetMapping("/{id}")
    public CountryLanguage getCountryLanguageById(@PathVariable Long id) {
        return countryLanguageService.getCountryLanguageById(id);
    }

    @PostMapping
    public CountryLanguage createCountryLanguage(@RequestBody CountryLanguage countryLanguage) {
        return countryLanguageService.saveCountryLanguage(countryLanguage);
    }

    @DeleteMapping("/{id}")
    public void deleteCountryLanguage(@PathVariable Long id) {
        countryLanguageService.deleteCountryLanguage(id);
    }
}
