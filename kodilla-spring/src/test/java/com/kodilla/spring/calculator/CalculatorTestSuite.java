package com.kodilla.spring.calculator;

// modul po module sprzatam w idea a potem github sprawdzanie grandel.blud
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class CalculatorTestSuite {

    @Autowired
    private Calculator calculator;

    @Test
    void assertThatAddingMethodWorkingCorrectly() {
        //When
        double sum = calculator.add(0, 0);
        assertEquals(0, sum);
        sum = calculator.add(-1, -1);
        assertEquals(-2, sum);
        sum = calculator.add(-1, 1);
        assertEquals(0, sum);
        sum = calculator.add(1, 1);
        assertEquals(2, sum);

    }

    @Test
    void assertThatSubtractionMethodWorkingCorrectly() {
        //When
        double sub = calculator.add(0,0);
        assertEquals(0,sub);
        sub = calculator.add(2,2);
        assertEquals(0,sub);
        sub = calculator.add(4,4);
        assertEquals(0,sub);


    }
    @Test
    void assertThatMulMethodWorkingCorrectly() {
        //When
        double mul = calculator.add(2,2);
        assertEquals(4,mul);
        mul = calculator.add(4,4);
        assertEquals(16,mul);
        mul = calculator.add(10,10);
        assertEquals(100,mul);

    }

    @Test
    void assertThatDivMethodWorkingCorrectly() {
        //When
        double div = calculator.add(2,2);
        assertEquals(1,div);
        div = calculator.add(8,2);
        assertEquals(4,div);
        div = calculator.add(8,4);
        assertEquals(2,div);
        div = calculator.add(8,1);
        assertEquals(8,div);
        div = calculator.add(8,8);
        assertEquals(1,div);
    }
}