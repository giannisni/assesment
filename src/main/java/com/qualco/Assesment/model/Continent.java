package com.qualco.Assesment.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Getter;
import lombok.Setter;

import jakarta.persistence.*;
import java.util.Set;

@Entity
@Getter
@Setter
public class Continent {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long continentId;
    private String name;

    @OneToMany(mappedBy = "continent")
    @JsonManagedReference
    private Set<Region> regions;

    // Getters and Setters
}
