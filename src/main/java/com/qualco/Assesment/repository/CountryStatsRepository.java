package com.qualco.Assesment.repository;

import com.qualco.Assesment.model.CountryStats;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryStatsRepository extends JpaRepository<CountryStats, Long> {
}
