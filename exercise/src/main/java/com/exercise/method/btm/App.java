package com.exercise.method.btm;

public class App {
  public static void main (String[] args) {
      ATMImpl atmimpl = new ATMImpl();

      atmimpl.bank();
      atmimpl.bank();
      atmimpl.bank();

      atmimpl.cashCall();

      System.out.println(ATM.callBankOut());
  }
}
