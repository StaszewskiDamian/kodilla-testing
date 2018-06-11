package com.kodilla.spring.portfolio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BoardConfig {

    @Autowired
    @Qualifier("toDo")
    public TaskList toDoList;

    @Autowired
    @Qualifier("inProgress")
    public TaskList inProgressList;

    @Autowired
    @Qualifier("done")
    public TaskList doneList;

    @Bean
    public Board board() {
        return new Board(toDoList(), inProgressList(), doneList());
    }

    @Bean(name = "toDo")
    public TaskList toDoList() {
        return new TaskList();
    }

    @Bean(name = "inProgress")
    public TaskList inProgressList() {
        return new TaskList();
    }

    @Bean(name = "done")
    public TaskList doneList() {
        return new TaskList();
    }
}
