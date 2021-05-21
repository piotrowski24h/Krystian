package com.exercise.method.btm;

public class ATMImpl implements ATM {

    @Override
    public void cash(String name) {
        System.out.println("Cash " + "name");
    }
    public void cashOut(String name) {
        System.out.println("Cash" +"name");
    }
    public void bank() {
        System.out.println();
    }
}
