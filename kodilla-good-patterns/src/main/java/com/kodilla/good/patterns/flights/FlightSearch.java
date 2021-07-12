package com.kodilla.good.patterns.flights;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FlightSearch {
    private List<Flight> flights;

    public FlightSearch(List<Flight> flights) {
        this.flights = flights;
    }

    public List<Flight> findAllFlightsFromLocation(String startLocation) {
        return flights.stream()
                .filter(flight -> flight.getStartLocation().equals(startLocation))
                .collect(Collectors.toList());
    }

    public List<Flight> findAllFlightsToLocation(String endLocation) {
        return flights.stream()
                .filter(flight -> flight.getEndLocation().equals(endLocation))
                .collect(Collectors.toList());
    }

    public List<String> findAllFlightsWithTransferToLocation(String endLocation) {



        return new ArrayList<>();

    }
}
