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
    }
        @Nested
        @DisplayName("Adding and removing")
        class ShapesManagement {

            @Test
            void testAddFigure() {


                ShapeCollector shapeCollector = new ShapeCollector();
                Circle circle1 = new Circle(10);
                shapeCollector.addFigure(circle1);

                int result1 = shapeCollector.shapes.size();
                double result2 = shapeCollector.shapes.get(0).getField();

                Assertions.assertEquals(1, result1);
                Assertions.assertEquals((10 * 10 * 3.14), result2, 0.01);
                System.out.println("Exp size list : 1");
                System.out.println("Actual size of the list: " + result1);
                //    Assertions.assertEquals(1, shapeCollector.getShapes().size());
            }


            //   Assertions.assertEquals(1, ShapeCollector.shapes.get(0));
            @Test
            void testRemoveFigure() {
                //Given

                ShapeCollector shapeCollector = new ShapeCollector();
                Circle circle1 = new Circle(10);
                shapeCollector.addFigure(circle1);

                int result = shapeCollector.shapes.size();

                Assertions.assertEquals(1, result);
                System.out.println("Expected size of the list : 1");
                System.out.println("Actual size of the list: " + result);
            }
        }

        @Nested      // prosty test bez Nestów
        @DisplayName("Search and display")
        class FindFigure {
            @Test
            void testGetFigure() {
                ShapeCollector shapeCollector = new ShapeCollector();
                Circle circle1 = new Circle(10);
                shapeCollector.addFigure(circle1);

                Shape result1 = shapeCollector.shapes.get(0);
                double result2 = shapeCollector.shapes.get(0).getField();

                Assertions.assertEquals(circle1, result1);
                Assertions.assertEquals(circle1, result1);
                System.out.println("Exp name shape: " + circle1.getShapeName());
                System.out.println("Nowe name shape" + result1.getShapeName());

//        retrievedShape = (ShapeCollector.getShapes());
//ctrl+/ - komentarz
//        Assertions.assertEquals(circle1, retrievedShape);
            }

            @Test
            void testShowFigures() {
                ShapeCollector shapeCollector = new ShapeCollector();
                Circle circle1 = new Circle(10);
                shapeCollector.addFigure(circle1);

                String result = shapeCollector.showFigures();

                Assertions.assertEquals(circle1.getShapeName(), result);
                System.out.println("Exp. name shape list" + circle1.getShapeName());
                System.out.println("Know name shape" + result);

                //  String recoveredShape;
                //  recoveredShape = shapeCollector.showFigures();


            }
        }
    }