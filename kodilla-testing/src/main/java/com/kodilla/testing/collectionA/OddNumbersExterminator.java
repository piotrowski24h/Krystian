package com.kodilla.testing.collection;

import java.util.ArrayList;


public class OddNumbersExterminator {



    public void exterminate(ArrayList<Integer> numbers) {

        ArrayList <Integer> result = new ArrayList<>();

        for (Integer number : numbers) {

            //checking if an element is even or odd
            if (number % 2 == 0) {
                System.out.println(number);
                result.add(number);
            }

        }

    }
}



// lista i literacja po elementach listy tworzenie list petle for,
//3.4
