package com.kodilla.patterns2.adapter.company.oldhrsystem;

public class Workers {

    private String[][] workers = {
            {"67", "John", "Smith"},
            {"62", "Ivone", "Nowak"},
            {"75", "Jessie", "Pinkman"},
            {"750", "Walter", "White"},
            {"7507", "Clara", "Lanson"}
    };
    private double[] salaries = {
            4500.00,
            3700.000,
            4350.00,
            9000.00,
            6200.00
    };

    public String gerWorker(int n) {

        if (n > salaries.length) {
            return "";
        }
        return workers[n][0] + ", " + workers[n][1] + ", " + workers[n][2] + ", " + salaries[n];
    }

    public String[][] getWorkers() {
        return workers;
    }

    public double[] getSalaries() {
        return salaries;
    }
}
