package com.kodilla.testing.collectionA;

import java.util.ArrayList;
import java.util.List;


public class OddNumbersExterminator {



    public List<Integer> exterminate(ArrayList<Integer> numbers) {

        ArrayList <Integer> result = new ArrayList<>();

        for (Integer number : numbers) {

            //checking if an element is even or odd
            if (number % 2 == 0) {
                System.out.println(number);
                result.add(number);
            }

        }
        return result;
    }
}



// lista i literacja po elementach listy tworzenie list petle for,
//3.4
