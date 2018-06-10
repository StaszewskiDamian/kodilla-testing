package com.kodilla.stream.array;

import org.junit.Assert;
import org.junit.Test;

public class ArrayOperationsTestSuite {
    @Test
    public void testGetAverage() {
        //given
        int[] numbers = {1,1,1,1,6,7,8,5,5};
        //when
        double expected = 3.8;
        //then
        Assert.assertEquals(expected, ArrayOperations.getAverage(numbers), 0.1);
    }
}
