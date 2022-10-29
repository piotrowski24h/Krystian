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


        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
        ArrayList<Integer> list = new ArrayList<>();

        list.add(2);
        list.add(3);
        List<Integer> result = oddNumbersExterminator.exterminate(list);
         List<Integer>  expectedLIst = new ArrayList<>();
         expectedLIst.add(2);

        assertEquals(expectedLIst,result );

        }
    }







