package com.qualco.Assesment.service;

import com.qualco.Assesment.model.CountryLanguage;
import com.qualco.Assesment.repository.CountryLanguageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CountryLanguageService {
    @Autowired
    private CountryLanguageRepository countryLanguageRepository;

    public List<CountryLanguage> getAllCountryLanguages() {
        return countryLanguageRepository.findAll();
    }

    public CountryLanguage getCountryLanguageById(Long id) {
        return countryLanguageRepository.findById(id).orElse(null);
    }

    public CountryLanguage saveCountryLanguage(CountryLanguage countryLanguage) {
        return countryLanguageRepository.save(countryLanguage);
    }

    public void deleteCountryLanguage(Long id) {
        countryLanguageRepository.deleteById(id);
    }
}
