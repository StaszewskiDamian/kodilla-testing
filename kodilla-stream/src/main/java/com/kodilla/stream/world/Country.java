package com.kodilla.stream.world;

import java.math.BigDecimal;

public class Country {

    private String nameOfCountry;
    private BigDecimal population;

    public Country(String nameOfCountry, BigDecimal population) {
        this.nameOfCountry = nameOfCountry;
        this.population = population;
    }

    public BigDecimal getPeopleQuantity() {
        return population;
    }
}
