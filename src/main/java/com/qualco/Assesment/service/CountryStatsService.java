package com.qualco.Assesment.service;

import com.qualco.Assesment.model.CountryStats;
import com.qualco.Assesment.repository.CountryStatsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CountryStatsService {
    @Autowired
    private CountryStatsRepository countryStatsRepository;

    public List<CountryStats> getAllCountryStats() {
        return countryStatsRepository.findAll();
    }

    public CountryStats getCountryStatsById(Long id) {
        return countryStatsRepository.findById(id).orElse(null);
    }

    public CountryStats saveCountryStats(CountryStats countryStats) {
        return countryStatsRepository.save(countryStats);
    }

    public void deleteCountryStats(Long id) {
        countryStatsRepository.deleteById(id);
    }
}
