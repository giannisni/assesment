package com.qualco.Assesment.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.Getter;
import lombok.Setter;

import jakarta.persistence.*;
import java.util.Set;

@Entity
@Getter
@Setter
public class Country {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long countryId;

    private String name;
    private double area;
    private String nationalDay;
    private String countryCode2;
    private String countryCode3;

    @ManyToOne
    @JoinColumn(name = "region_id")
    @JsonManagedReference
    private Region region;

    @OneToMany(mappedBy = "country")
    @JsonManagedReference
    private Set<CountryStats> countryStats;

    @OneToMany(mappedBy = "country")
    @JsonManagedReference
    private Set<CountryLanguage> countryLanguages;
}
