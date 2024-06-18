package com.qualco.Assesment.controller;

import com.qualco.Assesment.model.Continent;
import com.qualco.Assesment.service.ContinentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/continents")
public class ContinentController {
    @Autowired
    private ContinentService continentService;

    @GetMapping
    public List<Continent> getAllContinents() {
        return continentService.getAllContinents();
    }

    @GetMapping("/{id}")
    public Continent getContinentById(@PathVariable Long id) {
        return continentService.getContinentById(id);
    }

    @PostMapping
    public Continent createContinent(@RequestBody Continent continent) {
        return continentService.saveContinent(continent);
    }

    @DeleteMapping("/{id}")
    public void deleteContinent(@PathVariable Long id) {
        continentService.deleteContinent(id);
    }
}
