package com.kodilla.good.patterns.challenges.allegro;

public class OrderRequest {

    private CustomerInformation customer;
    private ItemMatch item;

    public OrderRequest(CustomerInformation customer, ItemMatch item) {
        this.customer = customer;
        this.item = item;
    }

    public CustomerInformation getCustomer() {
        return customer;
    }

    public ItemMatch getItem() {
        return item;
    }
}
