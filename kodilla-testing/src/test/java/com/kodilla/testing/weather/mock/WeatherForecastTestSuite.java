package com.kodilla.testing.weather.mock;
import com.kodilla.testing.weather.stub.Temperatures;                            // [2]
import com.kodilla.testing.weather.stub.WeatherForecast;                         // [3]
import org.junit.jupiter.api.Assertions;                                         // [4]
import org.junit.jupiter.api.Test;                                               // [5]

import java.util.HashMap;                                                        // [6]
import java.util.Map;                                                            // [7]

import static org.mockito.Mockito.mock;                                          // [8]
import static org.mockito.Mockito.when;
public class WeatherForecastTestSuite {

    @Test                                                                         // [11]
    void testCalculateForecastWithMock() {                                        // [12]
        //Given
        Temperatures temperaturesMock = mock(Temperatures.class);                  // [13]
        Map<String, Double> temperaturesMap = new HashMap<>();                     // [14]
        temperaturesMap.put("Rzeszow", 25.5);                                      // [15]
        temperaturesMap.put("Krakow", 26.2);                                       // [16]
        temperaturesMap.put("Wroclaw", 24.8);                                      // [17]
        temperaturesMap.put("Warszawa", 25.2);                                     // [18]
        temperaturesMap.put("Gdansk", 26.1);                                       // [19]
        when(temperaturesMock.getTemperatures()).thenReturn(temperaturesMap);      // [20]
        WeatherForecast weatherForecast = new WeatherForecast(temperaturesMock);   // [21]

        //When
        int quantityOfSensors = weatherForecast.calculateForecast().size();        // [22]

        //Then
        Assertions.assertEquals(5, quantityOfSensors);                             // [23]
    }


}
