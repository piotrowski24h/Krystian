package com.kodilla.exception.test;

public class ExceptionHandling {
    public static void main(String[] args) throws Exception {
        SecondChallenge secondChallenge = new SecondChallenge();
        try {
            secondChallenge.probablyIWillThrowException(1.2,1.5);
        } catch (Exception e) {
            System.out.println("first try" +e);
        }
        finally {
            System.out.println("socond try");
        }
    }
}
