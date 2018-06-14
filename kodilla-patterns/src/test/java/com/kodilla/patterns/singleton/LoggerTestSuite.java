package com.kodilla.patterns.singleton;

import org.junit.Assert;
import org.junit.Test;

public class LoggerTestSuite {

    @Test
    public void testGetFileName() {
        //Given
        //When
        Logger.getInstance().log("some log");
        //Then
        Assert.assertEquals("some log", Logger.getInstance().getLastLog());
    }
}
