package com.kodilla.testing.collection;

import org.junit.jupiter.api.BeforeEach;

import java.util.ArrayList;


public class CollectionTestSuite {


    @BeforeEach
    public void before() {
        System.out.println("test theList empty");

        void testOddNumbersExterminatorEmptyList() {
            //Given
            ArrayList<Integer> theList = new ArrayList<>();
            //When

            //Then
            System.out.println("Check list =" + theList.size(2));
        }

    }
}