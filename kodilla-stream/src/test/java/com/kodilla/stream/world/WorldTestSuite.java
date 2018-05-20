package com.kodilla.stream.world;

import com.kodilla.stream.sand.Europe;
import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class WorldTestSuite {

    @Test
    public void testGetPeopleQuantity() {

        //given
        List<Country> europeList = new ArrayList<>();
        europeList.add(new Country("Poland", new BigDecimal(40000000)));
        europeList.add(new Country("Sweden", new BigDecimal(20000000)));
        List<Country> asiaList = new ArrayList<>();
        asiaList.add(new Country("India", new BigDecimal(100000000)));
        asiaList.add(new Country("Pakistan", new BigDecimal(90000000)));

        Continent europe = new Continent("Europa", europeList);
        Continent asia = new Continent("Asia", asiaList);
        List<Continent> earth = new ArrayList<>();
        earth.add(asia);
        earth.add(europe);

        World one = new World(earth);

        //when
        BigDecimal expected = new BigDecimal(250000000);
        //then
        Assert.assertEquals(expected, one.getPeopleQuantity());
    }
}
