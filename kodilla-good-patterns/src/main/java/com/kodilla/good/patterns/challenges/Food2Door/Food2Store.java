package com.kodilla.good.patterns.challenges.Food2Door;

public class Food2Store {

    public static void main(String[] args) {

            DataRetrive orderRequest = new DataRetrive();
            ExtraFoodShop extraFoodShop = new ExtraFoodShop();

            extraFoodShop.process(orderRequest.orderRetrieve());
    }
}
