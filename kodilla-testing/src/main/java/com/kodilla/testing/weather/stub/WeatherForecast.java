package com.kodilla.testing.weather.stub;

import java.util.HashMap;
import java.util.Map;

public class WeatherForecast {

    private Temperatures temperatures;

    public WeatherForecast (Temperatures temperatures) {

        this.temperatures =temperatures;
// dodac 2 metody : srednia i mediana
    }

    public double avarage( Temperatures temperatures1) {
        return temperatures1;
    }
    public Map<String, Double> calculateForecast() {
        Map<String, Double> resultMap = new HashMap<>();

        for (Map.Entry<String, Double> temperature :
                temperatures.getTemperatures().entrySet()) {
            // adding 1 celsius degree to current value
            // as a temporary weather forecast

            resultMap.put(temperature.getKey(), temperature.getValue() +1.0);
            resultMap.put(temperature.getKey(),temperature.getValue() /5);
        }
        return resultMap;
    }

}
