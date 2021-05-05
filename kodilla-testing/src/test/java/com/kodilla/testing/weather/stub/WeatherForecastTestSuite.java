package com.kodilla.testing.weather.stub;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class WeatherForecastTestSuite {
    private Temperatures temperatures;

   // public WeatherForecast(Temperatures temperatures);
  //  this.temperatures =temperatures;


    @Test
    void testCalculateForecastWithMock() {


        Temperatures temperatures = null; // todo produkty//
        WeatherForecast weatherForecast = new WeatherForecast(temperatures);

        //When
        int quantityOfSensors = weatherForecast.calculateForecast().size();

        //Then
        Assertions.assertEquals(5,quantityOfSensors);
    }

}
