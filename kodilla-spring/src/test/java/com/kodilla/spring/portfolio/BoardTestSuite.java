package com.kodilla.spring.portfolio;

import org.junit.Assert;
import org.junit.Test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BoardTestSuite {

    @Test
    public void testTaskAdd() {

        //given
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
        Board board = context.getBean(Board.class);
        //when
        board.getToDoList().getTasks().add("Zadanie 1");
        board.getDoneList().getTasks().add("Zadanie 2");
        board.getInProgressList().getTasks().add("Zadanie 3");
        //then
        Assert.assertEquals("Zadanie 1", board.getToDoList().getTasks().get(0));
        Assert.assertEquals("Zadanie 2", board.getDoneList().getTasks().get(0));
        Assert.assertEquals("Zadanie 3", board.getInProgressList().getTasks().get(0));
    }
}
