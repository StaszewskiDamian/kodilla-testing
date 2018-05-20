package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.List;
import java.util.stream.Collectors;

public class World {

    private List<Continent> continets;

    public World(List<Continent> continents) {
        this.continets = continents;
    }

    public List<Continent> getContinentsPopulation() {
        return continets.stream()
                .collect(Collectors.toList());
    }

    public BigDecimal getPeopleQuantity() {
        return continets.stream()
                .flatMap(continent -> continent.getCountriesPopulation().stream())
                .map(Country::getPeopleQuantity)
                .reduce(BigDecimal.ZERO, (total, people) -> total = total.add(people));
    }
}
