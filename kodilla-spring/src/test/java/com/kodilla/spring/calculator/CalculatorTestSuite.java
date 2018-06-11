package com.kodilla.spring.calculator;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CalculatorTestSuite {

    @Test
    public void testGetUsername() {

        //given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.calculator");
        //when
        Calculator calculator = context.getBean(Calculator.class);
        //then
        Assert.assertEquals(6,calculator.add(3,3),0);
        Assert.assertEquals(6,calculator.mul(2, 3),0);
        Assert.assertEquals(6, calculator.div(18, 3),0);
        Assert.assertEquals(6,calculator.sub(66, 60),0);
    }



}
