package com.qualco.Assesment.repository;

import com.qualco.Assesment.model.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {
}
