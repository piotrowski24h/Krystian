package com.kodilla.testing.weather.mock;

import com.kodilla.testing.weather.stub.Temperatures;
import com.kodilla.testing.weather.stub.TemperaturesStub;
import com.kodilla.testing.weather.stub.WeatherForecast;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.testng.IResultMap;

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
    <temperaturesMock>
    void testCalForecastWithMock() {
        //Given
        Temperatures temperaturesMock = mock(Temperatures.class);
        Map<String, Double> temperaturesMap = new HashMap<>();


        double result =0;     // wrocic do mapy entry set
        temperaturesMap.put("Rzeszow", 25.5);
        temperaturesMap.put("Krakow", 26.2);
        temperaturesMap.put("Wroclaw", 24.8);
        temperaturesMap.put("Warszawa", 25.2);
        temperaturesMap.put("Gdansk", 26.1);
        when(temperaturesMock.getTemperatures()).thenReturn(temperaturesMap));
        WeatherForecast weatherForecast = new WeatherForecast(temperaturesMock);

        //When
for (Map.Entry<double> entry:temperaturesMap.entrySet()) {
   entry.getValue();
}

      //Then
        resultMap.put(temperaturesMap.getKey(),temperaturesMap.getValue() /5);
        // for (Map.Entry<String, Double> temperaturesMap.temperaturesMap.entrySet("Miasto") {
        //double avarage = weatherForecast.calculateForecast().size();    // calculator srednia

        //Then
        for (double e=0 ;e< temperaturesMap; e++) {
          double  result = temperaturesMap[(int) e];
        }
        System.out.println("avarage="+ result);


    }
}


