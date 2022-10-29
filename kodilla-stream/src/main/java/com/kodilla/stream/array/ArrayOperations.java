package com.kodilla.stream.array;
import java.util.stream.IntStream;

public interface ArrayOperations {
static double getAverage(int[] numbers) {
    System.out.println("The table content are start");
    IntStream.range(0,19)

            .forEach(System.out::println);  // wartoscci  z nubers z przukladu luknij i zeby nie pokoleji

    double average = IntStream.of(numbers)
            .average().getAsDouble();
    System.out.println("Average of table is :" + average);
    return  average;
    }
}

