package com.exception.test;

public class RouteNotFoundException {

    private final String not_now;

    public RouteNotFoundException(String not_now) {
        this.not_now = not_now;
    }

    public static class RouteNotFoundException extends Exception {

        public RouteNotFoundException(final String message) {
            super(message);
        }
    }
}
