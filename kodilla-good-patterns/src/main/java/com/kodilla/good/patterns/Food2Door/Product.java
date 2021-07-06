package com.kodilla.good.patterns.Food2Door;

public class Product {
    private final String name;
    private int age;  //localdate
    private double price;



    public Product (String name, int age, double price) {
        this.name = name;
        this.price = price;
        this.age = age;

    }


    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }
    public String setName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public double getPrice() {
        return price;
    }


    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", price=" + price +
                '}';
    }
}
