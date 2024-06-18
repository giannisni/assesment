package com.qualco.Assesment.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Getter;
import lombok.Setter;

import jakarta.persistence.*;
import java.util.Set;

@Entity
@Getter
@Setter
public class Region {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long regionId;
    private String name;

    @ManyToOne
    @JoinColumn(name = "continent_id")
    @JsonBackReference
    private Continent continent;

    @OneToMany(mappedBy = "region")
    @JsonManagedReference
    private Set<Country> countries;

    // Getters and Setters
}
