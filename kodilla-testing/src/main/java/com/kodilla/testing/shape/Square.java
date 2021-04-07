package com.kodilla.testing.shape;

public class Square implements Shape {

    @Override
    public String getShapeName(){
    return "Square";
    }

    @Override
     public double getField() {
        double a= 5.5;
        double area = a*a;
        System.out.println("area of square" + area);


        return area;
     }
}
