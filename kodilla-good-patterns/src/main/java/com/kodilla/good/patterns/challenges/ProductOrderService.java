package com.kodilla.good.patterns.challenges;

import com.kodilla.good.patterns.challenges.allegro.*;

public class ProductOrderService {

    public static void main(String[] args) {

        OrderRequestRetriever orderRequstRetriever = new OrderRequestRetriever();
        OrderProcessor orderProcessor = new OrderProcessor(
                new CustomerInformation("The Sun"), new ItemMatch("Gumisie", 5), new SendItem());

        orderProcessor.process(orderRequstRetriever.orderRetrieve());

    }
}






