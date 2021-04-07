package com.kodilla.testing.weather.mock;

import com.kodilla.testing.weather.stub.Temperatures;
import com.kodilla.testing.weather.stub.WeatherForecast;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;


import java.util.HashMap;
import java.util.Map;

import static org.mockito.when;


@ExtendWith (MockitoExtension.class)
   public class WeatherForecastTestSuite {


//        @Mock
//    private Temperatures temperaturesMock;

//    @Test
//    void testCalculateForecastWithMock() {
//        //Given
//       // Temperatures temperaturesMock = mock(Temperatures.class);
//        Map<String, Double> temperaturesMap = new HashMap<>();
//temperaturesMap.put("Rzeszów", 25.5);
//temperaturesMap.put("Krakow", 26.2);
//temperaturesMap.put("Wrocław", 24.8);
//temperaturesMap.put("Warszawa", 25.2);
//temperaturesMap.put("Gdańsk", 26.1);
//  when(temperaturesMock.getTemperatures()).thenReturn(temperaturesMap);
//  WeatherForecast weatherForecast = new WeatherForecast(temperaturesMock);
//
//        //When
//        int quantityOfSensors = weatherForecast.calculateForecast().size();
//
//        //Then
//        Assertions.assertEquals(5, quantityOfSensors);
//    }
//
//        private  when(Map<String, Double> temperatures) {
//        }
//
//    }

@Mock
 private Temperatures temperaturesMock;

    @Test
  void testAvarageForecastWithMock() {
        //Given
        Map<String,Double> temperaturesMap = new HashMap<>();
        temperaturesMap.put("Rzeszów", 25.5);
        temperaturesMap.put("Krakow", 26.2);
        temperaturesMap.put("Wrocław", 24.8);
        temperaturesMap.put("Warszawa", 25.2);
        temperaturesMap.put("Gdańsk", 26.1);
    }
    }