package com.kodilla.testing.shape;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class ShapeCollectorTestSuite {
    @DisplayName( "TDD: Shape test Suite")

    @BeforeAll
    public static void beforeAllTests() {
        System.out.println("This shape test");
    }
    @Test
 void testRemoveShape() {
        ShapeCollector shapeCollector = new ShapeCollector(figure);
        //when
     boolean result = ShapeCollector.remove(); //- obiekt circle ma byc / stworzyuc obiekt

     //Then
     Assertions.assertFalse(result);
 }

}
