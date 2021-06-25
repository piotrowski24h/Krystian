package com.exception.test;

public class Flight {
    String departureAirport;
    String arrivalAirport;

    public (String departureAirport, String arrivalAirport) {
        this.departureAirport=departureAirport;
        this.arrivalAirport=arrivalAirport;
    }

    public String getDepartureAirport() {
        return departureAirport;
    }
    public String getArrivalAirport() {
        return arrivalAirport;
    }
}

