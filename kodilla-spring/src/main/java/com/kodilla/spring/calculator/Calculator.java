package com.kodilla.spring.calculator;

import org.springframework.stereotype.Component;

@Component
public class Calculator {

    private Display display;

    public Calculator(Display display) {
        this.display = display;
    }

    public Display getDisplay() {
        return display;
    }

    public double add(double a, double b) {

        return a + b;
    }

    public double sub(double a, double b) {

        return a - b;
    }

    public double mul(double a, double b) {
        return a * b;
    }

    public double div(double a, double b) {
        return a / b;
    }
}
