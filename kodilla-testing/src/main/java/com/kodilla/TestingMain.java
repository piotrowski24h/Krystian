package com.kodilla;
import com.kodilla.testing.calculator.Calculator;


public class TestingMain {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int addResult = calculator.add(20, 120);
        int subResult = calculator.subtract(200, 150);
        if ((addResult == 199) && (subResult == 50)) {
            System.out.println("test ok");
        } else{
            System.out.println("Error!");
        }

    }
}