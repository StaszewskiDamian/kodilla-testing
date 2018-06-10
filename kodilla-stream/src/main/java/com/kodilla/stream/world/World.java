package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.List;


public class World {

    private List<Continent> continents;

    public World(List<Continent> continents) {
        this.continents = continents;
    }

    public BigDecimal getPeopleQuantity() {
        return continents.stream()
                .flatMap(continent -> continent.getCountriesPopulation().stream())
                .map(Country::getPeopleQuantity)
                .reduce(BigDecimal.ZERO, (total, people) -> total = total.add(people));
    }
}
