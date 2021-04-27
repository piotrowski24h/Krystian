package com.kodilla.shape;

 class Rectangle implements Shape {

     double a;
     double h;
     double field;

     public Rectangle (double a, double h) {
         this.a=a;
         this.h=h;
     }

     @Override
     public String getShapeName() {
         return "Rectangle";
     }

     @Override
     public double getField() {
         return field = (a/2)*h;
     }


 }
