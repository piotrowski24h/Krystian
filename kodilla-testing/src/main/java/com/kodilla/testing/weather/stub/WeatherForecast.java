package com.kodilla.testing.weather.stub;

import java.util.*;

public class WeatherForecast {
    private final Temperatures temperatures;

    public WeatherForecast(Temperatures temperatures) {
        this.temperatures = temperatures;
        // dodac 2 metody : srednia i mediana
    }

    public double calculateAverage() {
        Map<String, Double> temperaturesMap = temperatures.getTemperatures();
        if (temperaturesMap.size() == 0) {
            return 0;
        }

        double sum = 0;

        for (Map.Entry<String, Double> entry : temperaturesMap.entrySet()) {
            sum += entry.getValue();
        }

        return sum / temperaturesMap.size();
    }

    public double calculateMedian() {
        //check if temperatues size is > 0
        Map<String, Double> temperaturesMap = temperatures.getTemperatures();
        if (temperaturesMap.size() == 0) {
            return 0;
        }

        int size = temperaturesMap.size();
        List<Double> temperatures = new ArrayList<>(temperaturesMap.values());
        Collections.sort(temperatures);
        int medianIndex = -1;

        //even
        if (size % 2 == 0) {
            medianIndex = (size / 2) - 1;

        } else {
            medianIndex = size / 2;
        }


        return temperatures.get(medianIndex);
    }

    // public Temperatures avarage(Temperatures temperatures1) {
    //    return temperatures1;
    // }
    public Map<String, Double> calculateForecast() {
        Map<String, Double> resultMap = new HashMap<>();

        for (Map.Entry<String, Double> temperature :
                temperatures.getTemperatures().entrySet()) {
            // adding 1 celsius degree to current value
            // as a temporary weather forecast

            resultMap.put(temperature.getKey(), temperature.getValue() + 1.0);
        }
        return resultMap;
    }

//    public double avarageTemperature() {
//        double sum = 0;
//        double size = 0;
//
//        for (Map.Entry<String, Double> temperature :
//                temperatures.getTemperatures().entrySet()) {
//            sum += temperature.getValue();
//            size++;
//        }
//        if (size == 0) {
//            return 0;
//        } else {
//            return sum / size;
//        }
//    }
//
//
//    public Map<String, Double> mediana() {
//        Map<String, Double> medianMap = new HashMap<>();
//        Map<Double, String> sortedMedianMap = new HashMap<>();
//        List<Double> sortedValueList = new ArrayList<>();
//        double storedValue = 0;
//        String storedKey = "";
//        double mediana = 0;
//
//        for (Map.Entry<String, Double> temperature : temperatures.getTemperatures().entrySet()) {
//            sortedValueList.add(temperature.getValue());
//            storedKey = temperature.getKey();
//            storedValue = temperature.getValue();
//            sortedMedianMap.put(storedValue, storedKey);
//        }
//        //  Collection.registerNatives(sortedValueList);
//
//        for (int i = 0; i < sortedValueList.size(); i++) {
//            if (sortedValueList.size() % 2 == 0) {
//                if (i == (sortedValueList.size() / 2)) {
//                    mediana = sortedValueList.get(i);
//                    for (Map.Entry<Double, String> temperature : sortedMedianMap.entrySet()) {
//                        if (mediana == temperature.getKey()) {
//                            storedValue = temperature.getKey();
//                            storedKey = temperature.getValue();
//                            medianMap.put(storedKey, storedValue);
//                        }
//                    }
//                } else if (i == ((sortedValueList.size() / 2) - 1)) {
//                    mediana = sortedValueList.get(i);
//                    for (Map.Entry<Double, String> temperature : sortedMedianMap.entrySet()) {
//                        if (mediana == temperature.getKey()) {
//                            storedValue = temperature.getKey();
//                            storedKey = temperature.getValue();
//                            medianMap.put(storedKey, storedValue);
//                        }
//                    }
//                }
//            } else {
//                if (i == (sortedValueList.size() / 2)) {
//                    mediana = sortedValueList.get(i);
//                    for (Map.Entry<Double, String> temperature : sortedMedianMap.entrySet()) {
//                        if (mediana == temperature.getKey()) {
//                            storedValue = temperature.getKey();
//                            storedKey = temperature.getValue();
//                            medianMap.put(storedKey, storedValue);
//                        }
//                    }
//                }
//            }
//              }
//
//         for (int i = 0; i < sortedValueList.size(); i++) {
//             if (sortedValueList.size() % 2 == 0) {
//                 if (i == (sortedValueList.size()/2)){
//                     mediana = sortedValueList.get(i);
//                     for (Map.Entry<Double, String> temperature : sortedMedianMap.entrySet()) {
//                         if (mediana == temperature.getKey()) {
//                             storedValue = temperature.getKey();
//                             storedKey = temperature.getValue();
//                             medianMap.put(storedKey, storedValue);
//                         }
//                     }
//                 }
//                 else if (i == ((sortedValueList.size()/2)-1)){
//                     mediana = sortedValueList.get(i);
//                     for (Map.Entry<Double, String> temperature : sortedMedianMap.entrySet()) {
//                         if (mediana == temperature.getKey()) {
//                             storedValue = temperature.getKey();
//                             storedKey = temperature.getValue();
//                             medianMap.put(storedKey, storedValue);
//                         }
//                     }
//                 }
//             }
//             else {
//                 if (i == (sortedValueList.size()/2)) {
//                     mediana = sortedValueList.get(i);
//                     for (Map.Entry<Double, String> temperature : sortedMedianMap.entrySet()) {
//                         if (mediana == temperature.getKey()) {
//                             storedValue = temperature.getKey();
//                             storedKey = temperature.getValue();
//                             medianMap.put(storedKey, storedValue);
//                         }
//                     }
//                 }
//             }
         }

//         return medianMap;
  //   }
// }
         
