package com.kodilla.shape;

import java.util.ArrayList;
import java.util.List;

public class ShapeCollector {

    List<Shape> shapes = new ArrayList<>();

    public void addFigure(Shape shape){

        shapes.add(shape);
    }

    public boolean removeFigure(Shape shape) {

        boolean result = false;
        if (shapes.contains(shape)) {
            shapes.remove(shape);
            result = true;
        }
        return result;
    }

    public Shape getFigure(int n) {
        if (n >= 0 && n < shapes.size()) {
            return shapes.get(n);
        }
        return null;
    }

    public String showFigure() {

        String result = "";
        for (int i =0; i< shapes.size(); i++) {

            if (shapes.size() !=1) {

                result += "," + shapes.get(i).getShapeName();

            }
            else {

                result = shapes.get(i).getShapeName();
            }
        }
       return result;
    }

}


