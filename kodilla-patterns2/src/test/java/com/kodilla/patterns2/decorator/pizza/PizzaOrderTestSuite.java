package com.kodilla.patterns2.decorator.pizza;

import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.*;

public class PizzaOrderTestSuite {

    @Test
    public void testBasicPizza() {
        //Given
        PizzaOrder pizzaOrder = new BasicPizza();
        //When
        BigDecimal cost = pizzaOrder.getCost();
        String description = pizzaOrder.getDescription();
        //Then
        assertEquals(new BigDecimal(15), cost);
        assertEquals("Ciasto i sos pomidorowy z serem", description);
    }

    @Test
    public void testIngredientsDecorator() {
        //Given
        PizzaOrder pizzaOrder = new BasicPizza();
        pizzaOrder = new IngredientsDecorator(pizzaOrder);
        //When
        BigDecimal cost = pizzaOrder.getCost();
        String description = pizzaOrder.getDescription();
        //Then
        assertEquals(new BigDecimal(25), cost);
        assertEquals("Ciasto i sos pomidorowy z serem + dodatki", description);
    }

    @Test
    public void testIngredientsAndExtraCheesDecorators() {
        //Given
        PizzaOrder pizzaOrder = new BasicPizza();
        pizzaOrder = new IngredientsDecorator(pizzaOrder);
        pizzaOrder = new ExtraCheesDecorator(pizzaOrder);
        //When
        BigDecimal cost = pizzaOrder.getCost();
        String description = pizzaOrder.getDescription();
        //Then
        assertEquals(new BigDecimal(30), cost);
        assertEquals("Ciasto i sos pomidorowy z serem + dodatki + extra ser", description);
    }
}