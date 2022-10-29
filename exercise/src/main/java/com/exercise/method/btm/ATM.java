package com.exercise.method.btm;

public interface ATM {

    void cash(String name);

    default void cashCall() {
        System.out.println("Connet to bank");
    }

    void cashOut(String name);
    static String callBankOut() {
        return "Finish conntact to Bank";
    }
}
