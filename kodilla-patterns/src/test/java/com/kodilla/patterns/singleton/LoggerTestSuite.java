package com.kodilla.patterns.singleton;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LoggerTestSuite {

    private static LoggerTest loggerTest;

    @BeforeAll
    public static void logger() {
        loggerTest =new LoggerTest() ;
        loggerTestSuite.open("Log +");
        }

        AfterAll
    public static void closeLoggerTest() {
        loggerTest.close();
    }

    @Test
    void testGetLogger() {
        //Given & When
        String lastLog = loggerTest.getLastLog();
        System.out.println("last log = ");
        //Then
        assertEquals("Log",lastLog);
    }
}
