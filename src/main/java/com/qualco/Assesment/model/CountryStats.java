package com.qualco.Assesment.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.Getter;
import lombok.Setter;

import jakarta.persistence.*;

@Entity
@Getter
@Setter
public class CountryStats {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long countryStatsId;
    private int year;
    private long population;
    private double gdp;

    @ManyToOne
    @JoinColumn(name = "country_id")
    @JsonBackReference
    private Country country;

    // Getters and Setters
}
