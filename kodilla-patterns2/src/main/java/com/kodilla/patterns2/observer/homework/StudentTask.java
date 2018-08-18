package com.kodilla.patterns2.observer.homework;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class StudentTask implements Observable {

    private final List<Observer> observers;
    private final String name;
    private final Queue<String> uncheckedTask;

    public StudentTask(String name) {
        observers = new ArrayList<>();
        uncheckedTask = new LinkedList<>();
        this.name = name;
    }

    public void addTask(String task) {
        uncheckedTask.add(task);
        notifyObservers();
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(this);
        }
    }

    public String getName() {
        return name;
    }

    public Queue<String> getUncheckedTask() {
        return uncheckedTask;
    }
}
