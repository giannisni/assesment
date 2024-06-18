package com.qualco.Assesment.service;

import com.qualco.Assesment.model.Continent;
import com.qualco.Assesment.repository.ContinentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContinentService {
    @Autowired
    private ContinentRepository continentRepository;

    public List<Continent> getAllContinents() {
        return continentRepository.findAll();
    }

    public Continent getContinentById(Long id) {
        return continentRepository.findById(id).orElse(null);
    }

    public Continent saveContinent(Continent continent) {
        return continentRepository.save(continent);
    }

    public void deleteContinent(Long id) {
        continentRepository.deleteById(id);
    }
}
