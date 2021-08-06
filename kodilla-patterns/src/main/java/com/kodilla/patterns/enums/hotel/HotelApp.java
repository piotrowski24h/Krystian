package com.kodilla.patterns.enums.hotel;

public class HotelApp {
    public static void main(String[] args) {
        System.out.println("Accomodation prices:");
        System.out.println("1. Single Bed rooms");
        System.out.println("   - low season: " + Season.LOW.getSingleBedPrice("LOW"));
        System.out.println("   - high season: " + Season.HIGH.getSingleBedPrice("HIGH"));
        System.out.println("   - holiday season: " + Season.HOLIDAY.getSingleBedPrice("HOLIDAY"));
        System.out.println("2. Double Bed rooms");
        System.out.println("   - low season: " + Season.LOW.getDoubleBedPrice("LOW"));
        System.out.println("   - high season: " + Season.HIGH.getDoubleBedPrice("HIGH"));
        System.out.println("   - holiday season: " + Season.HOLIDAY.getDoubleBedPrice("HOLIDAY"));

    Season season = Season.HOLIDAY;
    System.out.println(season);
    }
}
