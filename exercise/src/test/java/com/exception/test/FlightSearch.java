package com.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FlightSearch {
    public void findFilght (Flight flight) throws RuntimeException {

        Map<String, Boolean> runToFilght =new HashMap<>();
        runToFilght.put("Balice", true);
        runToFilght.put("Pruszcz", false);

        if(runToFilght.get(flight.arrivalAirport) !=null) {
            if (runToFilght.get(flight.arrivalAirport) == true) {
                System.out.println("Flight run to" + flight.arrivalAirport + "is not good");
            } else {
                System.out.println("Sorry,flight is not good idea" + flight.arrivalAirport + "is not now");

            }
        } else {
            throw new RouteNotFoundException( "not now");
        }
    }
}
