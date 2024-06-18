package com.qualco.Assesment.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Getter;
import lombok.Setter;

import jakarta.persistence.*;
import java.util.Set;

@Entity
@Getter
@Setter
public class Language {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long languageId;

    private String language;

    @OneToMany(mappedBy = "language")
    @JsonManagedReference
    private Set<CountryLanguage> countryLanguages;
}
