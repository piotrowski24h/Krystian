package com.kodilla.testing.shape;

public class Triangle implements Shape {





    @Override
    public String getShapeName() {

        return "Triangle";
    }

    @Override
    public double getField(){
     double h = 7.5;
     double a = 7.5;
     double area = (h*a)/2;
        System.out.println("area of triangle"+ area);
        return area;

    }

   }

