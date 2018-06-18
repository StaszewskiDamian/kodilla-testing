package com.kodilla.patterns.factory.task;

import org.junit.Assert;
import org.junit.Test;

public class TaskFactoryTestSuite {

    @Test
    public void taskFactory1() {
        //given
        TaskFactory task = new TaskFactory();
        //when
        Task task1 = task.writeTask(TaskFactory.TASK1);
        //then
        Assert.assertEquals(true, task1.isTaskExecuted());
        Assert.assertEquals("wycieczka", task1.getTaskName());
    }

    @Test
    public void taskFactory2() {
        //given
        TaskFactory task = new TaskFactory();
        //when
        Task task2 = task.writeTask(TaskFactory.TASK2);
        //then
        Assert.assertEquals(false, task2.isTaskExecuted());
        Assert.assertEquals("malowanie", task2.getTaskName());
    }

    @Test
    public void taskFactory3() {
        //given
        TaskFactory task = new TaskFactory();
        //when
        Task task3 = task.writeTask(TaskFactory.TASK3);
        //then
        Assert.assertEquals(true, task3.isTaskExecuted());
        Assert.assertEquals("zakupy", task3.getTaskName());
    }
}
