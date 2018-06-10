package com.kodilla.good.patterns.challenges.Food2Door;

import java.util.HashMap;
import java.util.Map;

public class GlutenFreeShop implements Store {

    public Map<String, Integer> getProducts() {

        Map<String, Integer> extraFoodShopProducts = new HashMap<>();
        extraFoodShopProducts.put("gumisie", 4);
        extraFoodShopProducts.put("pies pie", 6);
        extraFoodShopProducts.put("golebie", 66);
        return extraFoodShopProducts;
    }

    @Override
    public void process(Order order) {
        for (String name : order.getOrder().keySet()) {
            if (getProducts().containsKey(name) &&
                    (getProducts().get(name) > order.getOrder().get(name))){
                System.out.println("Sprzedaz " + name+ " pod adres " + order.getDeliveryPoint());
            } else {
                System.out.println("Brak asortymentu" + name);
            }
        }
    }
}