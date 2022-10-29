package com.kodilla.good.patterns.flights;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class FlightSearchTest {
    public static List<Flight> createTestFlights() {
        Flight flight1 = new Flight("Cracow", "Warsaw");
        Flight flight2 = new Flight("Poznan", "Warsaw");
        Flight flight3 = new Flight("Gdansk", "Warsaw");
        Flight flight4 = new Flight("Warsaw", "Cracow");
        Flight flight5 = new Flight("Warsaw", "Katowice");
        Flight flight6 = new Flight("Wroclaw", "Warsaw");
        Flight flight7 = new Flight("Szczecin", "Wroclaw");
        Flight flight8 = new Flight("Szczecin", "Bialystok");

        return Arrays.asList(
                flight1,
                flight2,
                flight3,
                flight4,
                flight5,
                flight6,
                flight7,
                flight8
        );
    }

    @Test  //1
    void findAllFlightsFromLocation() {
        //Given
        List<Flight> flights = createTestFlights();
        FlightSearch flightSearch = new FlightSearch(flights);

        List<Flight> expectedFlights = new ArrayList<>();
        Flight flightFromWarsaw1 = new Flight("Warsaw", "Cracow");
        Flight flightFromWarsaw2 = new Flight("Warsaw", "Katowice");
        expectedFlights.add(flightFromWarsaw1);
        expectedFlights.add(flightFromWarsaw2);

        //When
        List<Flight> result = flightSearch.findAllFlightsFromLocation("Warsaw");

        //Then
        Assertions.assertEquals(2, result.size());
        Assertions.assertTrue(expectedFlights.containsAll(result) &&
                result.containsAll(expectedFlights));
    }

    @Test   //2
    void findAllFlightsToLocation() {
        //Given
        List<Flight> flights = createTestFlights();
        FlightSearch flightSearch = new FlightSearch(flights);

        List<Flight> expectedFlights = new ArrayList<>();
        Flight flightToCracow = new Flight("Cracow", "Cracow");
        expectedFlights.add(flightToCracow);

        //When
        List<Flight> result = flightSearch.findAllFlightsToLocation("Cracow");

        //Then
        Assertions.assertEquals(1, result.size());
        Assertions.assertTrue(expectedFlights.containsAll(result) &&
                result.containsAll(expectedFlights));
    }

    @Test  // poczt.3
    void findAllFlightsWithTransferToLocation() {
        //Given
        List<Flight> flights = createTestFlights();
        FlightSearch flightSearch = new FlightSearch(flights);


        //When
        //Then
    }
}