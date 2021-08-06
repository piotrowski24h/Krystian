package com.kodilla.patterns.singleton;

public enum Logger {
    INSTANCE;    //czy LOG ?
    private String lastlog ="";

    public void log(String log) {

        System.out.println("Log: [" + log + "]");
    }

    public String getLastLog() {

        return null;
    }
}
