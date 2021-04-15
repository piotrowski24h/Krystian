package com.kodilla.testing.shape;

import org.junit.jupiter.api.*;

public class ShapeCollectorTestSuite {

    private static int testCounter = 0;

    @BeforeAll
    public static void beforeAllTests() {
        System.out.println("This is the start of tests.");
    }

    @AfterAll
    public static void afterAllTests() {
        System.out.println("All tests are finished.");
    }

    @BeforeEach
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);

        //  @Nested
        //   @DisplayName("Adding and remooving")
        //  class ShapesManagement {
    }
   @Test
public void testAddFigure() {
       ShapeCollector shapeCollector = new ShapeCollector();

       Circle circle1 = new Circle();
       circle1.area =10;
       shapeCollector.addFigure(circle1);

       Assertions.assertEquals(1, ShapeCollector.shapes.get(0));
   }
   @Test
   void testRemoveFigure() {
   //Given
       ShapeCollector shapeCollector = new ShapeCollector();

       Circle circle1 =new Circle();
       circle1.area =10;
       shapeCollector.addFigure(circle1);

       boolean result = shapeCollector.removeFigure(circle1);
       Assertions.assertTrue(result);
       Assertions.assertEquals(0, ShapeCollector.shapes.get(0));
   }
   }
        @Nested      // prosty test bez Nestów
        @DisplayName("Search and display")
      class FindShapes {
            @Test
            void testGetFigure() {
                ShapeCollector shapeCollector = new ShapeCollector();
                Circle circle1 = new Circle();
                circle1.area=10;
                shapeCollector.addFigure(circle1);

                String retrievedShape;
                retrievedShape = (String) ShapeCollector.shapes.get(0);

                Assertions.assertEquals(circle1,retrievedShape);
                }
         @Test
            void testShowFigures() {
                ShapeCollector shapeCollector = new ShapeCollector();
                Circle circle1 = new Circle();
                circle1.area =10;
                shapeCollector.addFigure(circle1);

                String recoveredShape;
                recoveredShape = shapeCollector.showFigures();

                Assertions.assertEquals(circle1.getShapeName(),recoveredShape);
         }

        }





