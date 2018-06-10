package com.kodilla.good.patterns.challenges.allegro;

import java.util.Random;

public class CustomerInformation {

    private final String deliveryPoint;

    public CustomerInformation(String deliveryPoint) {
        this.deliveryPoint = deliveryPoint;
    }

    public String getDeliveryPoint() {
        return deliveryPoint;
    }

    public boolean getCustomerPayments() {

        Random r = new Random();

        return r.nextBoolean();

    }
}
