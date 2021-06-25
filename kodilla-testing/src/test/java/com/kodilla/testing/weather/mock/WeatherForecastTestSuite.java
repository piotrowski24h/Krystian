package com.kodilla.testing.weather.mock;

import com.kodilla.testing.weather.stub.Temperatures;
import com.kodilla.testing.weather.stub.WeatherForecast;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class WeatherForecastTestSuite {

    @Test
    void testCalculateForecastWithMock() {
        //Given
        Temperatures temperaturesMock = mock(Temperatures.class);
        Map<String, Double> temperaturesMap = new HashMap<>();
        temperaturesMap.put("Rzeszow", 25.5);
        temperaturesMap.put("Krakow", 26.2);
        temperaturesMap.put("Wroclaw", 24.8);
        temperaturesMap.put("Warszawa", 25.2);
        temperaturesMap.put("Gdansk", 26.1);
        when(temperaturesMock.getTemperatures()).thenReturn(temperaturesMap);
        WeatherForecast weatherForecast = new WeatherForecast(temperaturesMock);

        //When
        int quantityOfSensors = weatherForecast.calculateForecast().size();

        //Then
        Assertions.assertEquals(5, quantityOfSensors);
    }


    @Test
    void testCalculateAverageForecastWithMock() {
        //Given
        Temperatures temperaturesMock = mock(Temperatures.class);
        WeatherForecast forecast = new WeatherForecast(temperaturesMock);
        Map<String, Double> temperaturesMap = new HashMap<>();
        temperaturesMap.put("Rzeszow", 1.0);
        temperaturesMap.put("Krakow", 2.0);
        temperaturesMap.put("Wroclaw", 7.0);
        temperaturesMap.put("Warszawa", 1.0);
        temperaturesMap.put("Gdansk", 1.0);

        //When
        when(temperaturesMock.getTemperatures()).thenReturn(temperaturesMap);

        //Then
        double result = forecast.calculateAverage();
        Assertions.assertEquals(2.4, result);
    }

    @Test
    void testCalculateMedianForecastWithMock() {
        //Given
        Temperatures temperaturesMock = mock(Temperatures.class);
        WeatherForecast forecast = new WeatherForecast(temperaturesMock);
        Map<String, Double> temperaturesMap = new HashMap<>();
        temperaturesMap.put("Rzeszow", 2.0);
        temperaturesMap.put("Krakow", 5.0);
        temperaturesMap.put("Gdansk", 7.0);

        //When
        when(temperaturesMock.getTemperatures()).thenReturn(temperaturesMap);

        double median = forecast.calculateMedian();

        //Then
        Assertions.assertEquals(5.0, median);
    }

    @Test
    void testCalculateMedianForecastWithMockEvenSize() {
        //Given
        Temperatures temperaturesMock = mock(Temperatures.class);
        WeatherForecast forecast = new WeatherForecast(temperaturesMock);
        Map<String, Double> temperaturesMap = new HashMap<>();
        temperaturesMap.put("Rzeszow", 2.0);
        temperaturesMap.put("Krakow", 4.0);
        temperaturesMap.put("Gdansk", 7.0);
        temperaturesMap.put("Gdanskr", 10.0);

        //When
        when(temperaturesMock.getTemperatures()).thenReturn(temperaturesMap);

        double median = forecast.calculateMedian();

        //Then
        Assertions.assertEquals(4.0, median);
    }

    //2, 5, 7, 8, 9, 10, 32
    @Test
    void testCalculateMedianForecastWithMock2() {
        //Given
        Temperatures temperaturesMock = mock(Temperatures.class);
        WeatherForecast forecast = new WeatherForecast(temperaturesMock);
        Map<String, Double> temperaturesMap = new HashMap<>();
        temperaturesMap.put("Rzeszow", 2.0);
        temperaturesMap.put("Krakow", 5.0);
        temperaturesMap.put("Gdansk", 7.0);
        temperaturesMap.put("Gdansk2", 8.0);
        temperaturesMap.put("Gdansk3", 9.0);
        temperaturesMap.put("Gdansk4", 10.0);
        temperaturesMap.put("Gdansk5", 32.0);

        //When
        when(temperaturesMock.getTemperatures()).thenReturn(temperaturesMap);

        double median = forecast.calculateMedian();

        //Then
        Assertions.assertEquals(8.0, median);
    }
}


