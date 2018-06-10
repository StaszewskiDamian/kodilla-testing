package com.kodilla.good.patterns.challenges.Food2Door;

import java.util.HashMap;
import java.util.Map;

public class DataRetrive {

    public Order orderRetrieve() {

        Map<String, Integer> rawOrder = new HashMap<>();
        rawOrder.put("salata", 2);
        rawOrder.put("golebie", 6);

        return new Order("The Sun", rawOrder);
    }
}
