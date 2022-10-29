package com.kodilla.exception.test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class probablyIWillThrowException {

    @Test
    void firstTest() {
        //Give
        SecondChallenge secondChallenge = new SecondChallenge();
        //When
        double x =2.1;
        double y =1.1;
        //Then
        Assertions.assertThrows(Exception.class,() -> secondChallenge.probablyIWillThrowException(x,y));
    }
}
