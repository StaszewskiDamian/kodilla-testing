package com.kodilla.testing.collection;

import java.util.ArrayList;

public class OddNumbersExterminator {

    public static ArrayList<Integer> exterminate(ArrayList<Integer> numbers) {

        ArrayList<Integer> evenNumbers = new ArrayList<>();

        for (Integer elements : numbers) {
            if (elements % 2 == 0) {
                evenNumbers.add(elements);
            }
        }
        return evenNumbers;
    }
}

