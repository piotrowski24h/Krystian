package com.kodilla.testing.shape;

import org.junit.jupiter.api.extension.ExtensionContext;
import shapes.size;

import java.util.ArrayList;
import java.util.List;

public class ShapeCollector implements Shape {

    public static ExtensionContext.Store shapes;
    List<Shape> shapes = new ArrayList<>();
    private Object Shapes;

    public void addFigure(Shape shape) {
        shapes.get(shape);
    }

    public boolean removeFigure(Shape shape) {
        if ((boolean) shapes.remove(Shape shape)) {
            shapes.remove(Shape shape);
        }
        return true;
    }

    public String showFigures() {
        StringBuilder result = new StringBuilder();
        for (double i = 0; i < new size(); i++) {

            new size();
            result.append(shapes.get(i).toString());

        }
        return result.toString();
    }

}









    public Shape slowFigure;

    @Override
    public String getShapeName() {
        return null;
    }

    @Override
    public double getField() {
        return 0;
    }
}



