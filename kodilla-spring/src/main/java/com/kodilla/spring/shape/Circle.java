package com.kodilla.spring.shape;

public class Circle implements Shape {

    @Override
    public String getShapeName() {
        return "This is a circle";
    }

    @Override
    public String draw() {
        return null;
    }
}
