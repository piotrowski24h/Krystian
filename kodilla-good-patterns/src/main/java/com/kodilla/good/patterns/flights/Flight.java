package com.kodilla.good.patterns.flights;

import java.util.Objects;

public class Flight {
    private String startLocation;
    private String endLocation;

    public Flight(String startLocation, String endLocation) {
        this.startLocation = startLocation;
        this.endLocation = endLocation;
    }

    public String getStartLocation() {
        return startLocation;
    }

    public void setStartLocation(String startLocation) {
        this.startLocation = startLocation;
    }

    public String getEndLocation() {
        return endLocation;
    }

    public void setEndLocation(String endLocation) {
        this.endLocation = endLocation;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Flight flight = (Flight) o;
        return Objects.equals(startLocation, flight.startLocation) && Objects.equals(endLocation, flight.endLocation);
    }

    @Override
    public int hashCode() {
        return Objects.hash(startLocation, endLocation);
    }
}
