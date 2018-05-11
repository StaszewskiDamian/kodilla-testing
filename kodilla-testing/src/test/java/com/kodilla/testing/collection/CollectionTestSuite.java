package com.kodilla.testing.collection;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

public class CollectionTestSuite {

    @Before
    public void before() {
        System.out.println("Test Case: begin");
    }

    @After
    public void after() {
        System.out.println("Test Case: end");
    }

    @Test
    public void testOddNumbersExterminatorEmptyList() {
        // case1
        //given empty list
        ArrayList<Integer> arrayList = new ArrayList<>();

        //when
        ArrayList<Integer> result = OddNumbersExterminator.exterminate(arrayList);
        System.out.println("Wielkosc pustej listy: " + result.size());
        //then
        Assert.assertEquals(0, result.size());

        //case2
        //given some list of odd and even numbers
        arrayList.add(3);
        arrayList.add(6);
        arrayList.add(9);
        arrayList.add(18);
        arrayList.add(23);
        arrayList.add(1998);
        //then
        ArrayList<Integer> resultsOfExtermination = OddNumbersExterminator.exterminate(arrayList);
        //when
        Assert.assertEquals(3, resultsOfExtermination.size());
        System.out.println("Wielkosc zapelnionej listy: " + resultsOfExtermination.size());
        for (int n = 0; n < resultsOfExtermination.size(); n++) {
            //sprawdzamy czy lista zawiera nieparzyste
            Assert.assertEquals(0, resultsOfExtermination.get(n) % 2);
            System.out.println("Zawartosc listy: " + resultsOfExtermination.get(n));
        }
    }
}
