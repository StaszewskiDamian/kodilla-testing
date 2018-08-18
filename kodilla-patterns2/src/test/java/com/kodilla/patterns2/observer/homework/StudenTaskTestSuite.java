package com.kodilla.patterns2.observer.homework;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StudenTaskTestSuite {

    @Test
    public void test() {
        //Given
        StudentTask bonnieTask = new StudentTask("Boonie");
        StudentTask romeoTask = new StudentTask("Romeo");
        Mentor julia = new Mentor("Julia");
        Mentor clyde = new Mentor("Clyde");
        bonnieTask.registerObserver(clyde);
        romeoTask.registerObserver(julia);
        //When
        romeoTask.addTask("zadanie 111");
        romeoTask.addTask("zadanie 222");
        bonnieTask.addTask("zadanie 666");
        //Then
        assertEquals(2, julia.getCount());
        assertEquals(1, clyde.getCount());
    }
}
