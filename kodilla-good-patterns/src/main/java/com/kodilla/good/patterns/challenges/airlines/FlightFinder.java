package com.kodilla.good.patterns.challenges.airlines;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FlightFinder {

    List<Flight> flightList() {
        List<Flight> flights = new ArrayList<>();
        flights.add(new Flight("Wroclaw", "Gdansk"));
        flights.add(new Flight("Wroclaw", "Poznan"));
        flights.add(new Flight("Poznan", "Gdansk"));

        return flights;
    }

    public void gerFrom(String from) {

        List<Flight> flights = flightList().stream()
                .filter(flight -> flight.getDepartureAirport().equals(from))
                .collect(Collectors.toList());
        if (flights.isEmpty()) {
            System.out.println("Nie znaleziono lotu");
        } else {
            for (Flight flight : flights) {
                System.out.println("Znaleziono lot do " + flight.getArrivalAirport());
            }
        }
    }

    public void getTo(String to) {

        List<Flight> flights = flightList().stream()
                .filter(flight -> flight.getArrivalAirport().equals(to))
                .collect(Collectors.toList());
        if (flights.isEmpty()) {
            System.out.println("Nie znaleziono lotu");
        } else {
            for (Flight flight : flights) {
                System.out.println("Znaleziono lot z " + flight.getDepartureAirport());
            }
        }
    }

    public void getThru(String to, String thru) {

        List<Flight> flights = flightList().stream()
                .filter(flight -> flight.getArrivalAirport().equals(to))
                .filter(flight -> flight.getDepartureAirport().equals(thru))
                .collect(Collectors.toList());
        if (flights.isEmpty()) {
            System.out.println("Nie znaleziono lotu");
        } else {
            for (Flight flight : flights) {
                System.out.println("Znaleziono lot do " + flight.getArrivalAirport() + " przez " + flight.getDepartureAirport());
            }
        }
    }
}











