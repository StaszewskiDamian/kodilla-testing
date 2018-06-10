package com.kodilla.good.patterns.challenges.airlines;

public class App {

    public static void main(String[] args) {

        FlightFinder findFlight = new FlightFinder();


        findFlight.getTo("Gdansk");
        findFlight.gerFrom("Wroclaw");
        findFlight.getThru("Gdansk", "Poznan");
    }
}
