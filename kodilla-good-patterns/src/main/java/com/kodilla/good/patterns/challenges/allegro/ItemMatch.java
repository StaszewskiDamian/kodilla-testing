package com.kodilla.good.patterns.challenges.allegro;

import java.util.Random;

public class ItemMatch {

    private String item;
    private int Quantity;

    public ItemMatch(String item, int quantity) {
        this.item = item;
        Quantity = quantity;
    }

    public String getItem() {
        return item;
    }

    public int getQuantity() {
        return Quantity;
    }

    public boolean CheckItem() {

        Random r = new Random();

        return r.nextBoolean();


    }


}
