package com.kodilla.good.patterns.challenges.Food2Door;

import java.util.HashMap;
import java.util.Map;

public class HealthyShop implements Store {

    public Map<String, Integer> getProducts() {

        Map<String, Integer> extraFoodShopProducts = new HashMap<>();
        extraFoodShopProducts.put("nerki", 4);
        extraFoodShopProducts.put("maslo", 6);
        extraFoodShopProducts.put("golebie", 66);
        return extraFoodShopProducts;
    }

    @Override
    public void process(Order order) {
        for (String name : order.getOrder().keySet()) {
            if (getProducts().containsKey(name) &&
                    (getProducts().get(name) > order.getOrder().get(name))){
                System.out.println("Realizujemy " + name+ " pod adres " + order.getDeliveryPoint());
            } else {
                System.out.println("Brak towaru" + name);
            }
        }
    }
}