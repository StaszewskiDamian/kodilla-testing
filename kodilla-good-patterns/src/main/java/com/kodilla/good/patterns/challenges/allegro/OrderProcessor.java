package com.kodilla.good.patterns.challenges.allegro;

public class OrderProcessor {

    private CustomerInformation customerInformation;
    private ItemMatch itemMatch;
    private SendItem sendItem;

    public OrderProcessor(CustomerInformation customerInformation, ItemMatch itemMatch, SendItem sendItem) {
        this.customerInformation = customerInformation;
        this.itemMatch = itemMatch;
        this.sendItem = sendItem;
    }

    public void process(OrderRequest orderRequest) {

        if (orderRequest.getItem().CheckItem() && orderRequest.getCustomer().getCustomerPayments()) {

            sendItem.sendItem(orderRequest.getCustomer().getDeliveryPoint());
            new OrderDto(orderRequest.getCustomer(), orderRequest.getItem());
            System.out.println("Przedmiot sprzedal sie.");
        } else {
            System.out.println("Nie udalo sie.");
        }
    }
}
