package com.kodilla.patterns2.observer.homework;

public class Mentor implements Observer {

    private final String name;
    private int count;

    public Mentor(String name) {
        this.name = name;
    }

    @Override
    public void update(StudentTask studentTask) {
        System.out.println(name + ": New task to check by " + studentTask.getName() + "\n" +
                " (total: " + studentTask.getUncheckedTask().size() + " tasks");
        count++;
    }

    public String getName() {
        return name;
    }

    public int getCount() {
        return count;
    }
}
