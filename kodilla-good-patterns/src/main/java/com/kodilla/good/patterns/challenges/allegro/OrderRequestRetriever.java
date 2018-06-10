package com.kodilla.good.patterns.challenges.allegro;

public class OrderRequestRetriever {

    public OrderRequest orderRetrieve() {

        ItemMatch itemMatch = new ItemMatch("Gumisie", 4);
        CustomerInformation customerInformation = new CustomerInformation("The Sun");
        return new OrderRequest(customerInformation, itemMatch);
    }

}
