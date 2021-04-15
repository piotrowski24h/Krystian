package com.kodilla.testing.shape;


public class Circle implements Shape {


    public int area;

    @Override
        public String getShapeName() {
        return "Circle";

        }




    @Override
        public double getField() {
            double pi =3.14;
            int r = 10;
            double area = pi * r * r;
            System.out.println("area of circle" +area);
            return area;
        }
    }
