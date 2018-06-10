package com.kodilla.stream.world;

import java.util.List;
import java.util.stream.Collectors;

public class Continent {

    private String name;
    private List<Country> countries;

    public Continent(String name, List<Country> countries) {
        this.name = name;
        this.countries = countries;
    }

    public List<Country> getCountriesPopulation() {
        return countries.stream()
                .collect(Collectors.toList());
    }
}
