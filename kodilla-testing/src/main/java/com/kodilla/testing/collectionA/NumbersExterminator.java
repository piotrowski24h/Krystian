package com.kodilla.testing.collectionA;

import java.util.ArrayList;
import java.util.Random;

public class NumbersExterminator {

    public static void main (String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Random theExterminate = new Random();
        for (int n=0; n<200; n++) {
            list.add(theExterminate.nextInt(100));
        }
        OddNumbersExterminator exterminator =new OddNumbersExterminator();
        exterminator.exterminate(list);
    }
}
