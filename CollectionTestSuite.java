package com.kodilla.testing.collectionA;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class CollectionTestSuite {


    @BeforeEach
    public void before() {
        System.out.println("test if List empty");
    }

    @Test
    public void testOddNumbersExterminatorEmptyList() {

        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
        ArrayList<Integer> list = new ArrayList<>();
        List<Integer> result = oddNumbersExterminator.exterminate(list);

        assertEquals(0, result.size());


    }
    @DisplayName("Test check odd numbers")
    @Test
    public void testOddNumbersExterminatorNormalList() {

        ArrayList<Integer> theList = new ArrayList<>();

      //  public void testOddNumbersExterminator() {
            theList.add(1);
            theList.add(2);
            theList.add(3);
            theList.add(4);
            theList.add(5);
            theList.add(6);



          assertEquals(2, theList);
          assertEquals(4, theList);


          // assertEquals(4, 2);

        }
    }







