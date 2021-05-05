package com.kodilla.testing.shape;

import java.util.ArrayList;
import java.util.List;

public class ShapeCollector {

    //   public static ExtensionContext.Store shapes;
   private List<Shape> shapes = new ArrayList<>();

    public  List<Shape> getShapes() {    // tu patrz
        return shapes;
    }
    public Shape getShape(int n) {
        return shapes.get(n);

    }


    public void addFigure(Shape shape) {
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

    public String showFigures() {

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < shapes.size(); i++) {

            if (shapes.size() != 1) {

                result.append(", ").append(shapes.get(i).getShapeName());
            } else {

                result = new StringBuilder(shapes.get(i).getShapeName());
            }
        }
        return result.toString();
    }

}









    //public Shape slowFigures;

    //@Override
   // public String getShapeName() {
  //      return null;
 //   }

  //  @Override
  //  public double getField() {
    //    return 0;





