package com.kodilla.patterns.factory.task;

public final class TaskFactory {

    public static final String TASK1 = "wycieczka";
    public static final String TASK2 = "malowanie";
    public static final String TASK3 = "zakupy";

    public final Task writeTask(final String task) {
        switch (task) {
            case TASK1:
                return new DrivingTask("wycieczka", "Warszawy", "motor");
            case TASK2:
                return new PaintingTask("malowanie", "obraz", "czerwono");
            case TASK3:
                return new ShoppingTask("zakupy", "bilet", 3);
            default:
                return null;
        }
    }
}
