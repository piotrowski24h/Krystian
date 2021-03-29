package com.kodilla.testing.shape;

import java.util.ArrayList;
import java.util.List;

public class ShapeCollector {
    public ShapeCollector(String removeCircle) {

    }

    public static void main(String[] args) {
        List<String> collector = new ArrayList<>();
        collector.add("square");
        collector.add("circle");
        collector.add("triangle");

        System.out.println("square");
        for (String mm : collector) {
            System.out.println("check size" + mm);
        }
        System.out.println("add new shape");
        collector.remove("circle");
   // punkt usuwającą figurę z kolekcji - jest ok ?
    }

    public static boolean remove(String circle) {
        return false;
    }
}
