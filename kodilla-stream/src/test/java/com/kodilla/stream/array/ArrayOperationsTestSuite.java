package com.kodilla.stream.array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ArrayOperationsTestSuite {

    @Test
    public void testGetAverage() {
        //give
        int[] numbers = new int[13];
        for (int i = 0; i<12 ; i++) {
            numbers[i] = (int)Math.pow(i,3);
        }
        //when
        double average = ArrayOperations.getAverage(numbers);
        //then
        Assertions.assertEquals( 335.0769230769231, average);
    }
}
