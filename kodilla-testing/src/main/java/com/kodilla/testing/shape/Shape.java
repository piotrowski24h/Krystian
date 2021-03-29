package com.kodilla.testing.shape;

public interface Shape {
    static void getShapeName();


    default void getField() {

    }
}

class Circle implements Shape {
    public void getShapeName(){

    }
}

class Rectangle implements  Shape {
    public static void getShapeName() {

    }
}

class Triangle implements Shape {
    public static void getShapeName() {

    }
}

// class addFigure - tu czy w class ShapeCollector ?? - Hubert jak lepiej?
class addFigure {
    private Shape shape;

    public AddFigure (Shape shape) {
        this.shape =shape;
    }
 public void process() {
     System.out.println("Starting add new figure");
     this.shape.getField();
     System.out.println("add Figure");

    }
}

class Application {
    public static void main (String agrs[]) {
        Shape circle = new Circle();
        AddFigure addFigure = new AddFigure(circle);
    }
}

