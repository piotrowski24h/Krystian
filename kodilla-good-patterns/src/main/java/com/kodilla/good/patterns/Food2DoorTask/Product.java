package com.kodilla.good.patterns.Food2DoorTask;

import java.time.LocalDate;
import java.util.Objects;

public class Product {
    private final String name;
    private LocalDate expiryDate;  //localdate
    private double price;



    public Product (String name, LocalDate expiryDate, double price) {
        this.name = name;
        this.price = price;
    }

    public Product (String name, double price) {
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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Product)) return false;
        Product product = (Product) o;
        return Objects.equals(name, product.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
