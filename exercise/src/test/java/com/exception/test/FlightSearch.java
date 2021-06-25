package com.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FlightSearch {
    public void findFilght (Flight flight) throws RouteNotFoundException{

        Map<String, Boolean> runToFight=new HashMap<>();
        runToFight.put("Balice", true);
        runToFight.put("Pruszcz", false);

        if(runToFight.get(flight.getArrivalAirport()) != null) {
            if (runToFight.get(flight.getArrivalAirport())) {
                System.out.println("Flight run to" + flight.getArrivalAirport() + "is not good");
            } else {
                System.out.println("Sorry,flight is not good idea" + flight.getArrivalAirport() + "is not now");

            }
        } else {
            throw new RouteNotFoundException( "not now");
        }
    }
}
