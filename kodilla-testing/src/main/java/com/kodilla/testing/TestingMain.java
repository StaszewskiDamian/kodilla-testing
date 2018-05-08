package com.kodilla.testing;


import com.kodilla.testing.user.SimpleUser;
import com.kodilla.testing.calculator.Calculator;

public class TestingMain {
    public static void main(String[] args) {
        SimpleUser simpleUser = new SimpleUser("theForumUser");

        String result = simpleUser.getUsername();

        if (result.equals("theForumUser")) {
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }

        // test klasy kalkulator

        int a = 2;
        int b = 4;

        if (Calculator.Add(a, b) == 6 && Calculator.Subtract(b, a) == 2) {
            System.out.println("test klasy calculator OK");
        } else {
            System.out.println("Error w klasie calculator!");
        }

    }
}