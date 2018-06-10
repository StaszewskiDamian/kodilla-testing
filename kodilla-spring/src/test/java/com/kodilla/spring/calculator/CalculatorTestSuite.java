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
        Calculator calculator = context.getBean(Calculator.class, Display.class);
        //then
        Assert.assertEquals(6,calculator.getDisplay().displayValue(calculator.add(3, 3)), 0);
        Assert.assertEquals(6,calculator.getDisplay().displayValue(calculator.mul(2, 3)),0);
        Assert.assertEquals(6, calculator.getDisplay().displayValue(calculator.div(18, 3)),0);
        Assert.assertEquals(6,calculator.getDisplay().displayValue(calculator.sub(66, 60)),0);
    }



}
