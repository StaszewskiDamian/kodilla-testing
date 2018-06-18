package com.kodilla.patterns.builder.bigmac;

import org.junit.Assert;
import org.junit.Test;

public class BigmacTestSuite {

    @Test
    public void testPizzaNew() {

        //given
        Bigmac bigmac = new Bigmac.BigmacBuilder()

                .burgers(3)
                .ingredient("bekon", "cebula")
                .souce("1000 wysp")
                .build();

        //when
        int bigmacBuild = bigmac.getIngredients().size();

        //then
        Assert.assertEquals("1000 wysp", bigmac.getSouce());
        Assert.assertEquals(2, bigmacBuild);
        Assert.assertEquals("bez sezamu", bigmac.getBun());
    }
}
