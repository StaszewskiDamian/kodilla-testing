package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FlightLogic {

    public static void findFlight(Flight flight) throws RouteNotFoundException {

        Map<String, Boolean> checkAirport = new HashMap<>();
        checkAirport.put("New York", true);
        checkAirport.put("Berlin", false);

        if (!checkAirport.containsKey(flight.getArrivalAirport())) {
            throw new RouteNotFoundException("Tego miejsca nie ma w naszym serwisie.");
        } else {
            if (checkAirport.get(flight.arrivalAirport) == true) {
                System.out.println("Odlot na czas");
            } else {
                System.out.println("Twoj lot jest opozniony");
            }
        }
    }

    public static void main(String[] args) {

        Flight flight1 = new Flight("London", "Berlin");
        Flight flight2 = new Flight("London", "New York");
        Flight flight3 = new Flight("Wroclaw", "London");

        try {
            findFlight(flight3);
        } catch (RouteNotFoundException e) {
            System.out.println("Sa problemy: " + e);
        }
    }
}