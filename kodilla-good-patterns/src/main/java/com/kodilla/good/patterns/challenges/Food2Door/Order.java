package com.kodilla.good.patterns.challenges.Food2Door;

import java.util.HashMap;
import java.util.Map;

public class Order {

    Map<String, Integer> order = new HashMap<>();
    private String deliveryPoint;

    public Order(String deliveryPoint, Map<String, Integer> order) {
        this.deliveryPoint = deliveryPoint;
        this.order = order;
    }

    public String getDeliveryPoint() {
        return deliveryPoint;
    }

    public Map<String, Integer> getOrder() {
        return order;
    }
}
