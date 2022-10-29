package com.kodilla.good.patterns.Food2Door;

import java.time.LocalDate;

public class OldProduct {
    private final String name;
    private LocalDate expiryDate;  //localdate
    private double price;



    public OldProduct(String name, LocalDate expiryDate, double price) {
        this.name = name;
        this.price = price;
    }

    public OldProduct(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public LocalDate getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(LocalDate expiryDate) {
        this.expiryDate = expiryDate;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", expiryDate=" + expiryDate +
                ", price=" + price +
                '}';
    }
}
