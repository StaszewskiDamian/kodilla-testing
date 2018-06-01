// Klasa ta mialaby przechowywac dane sprzedazy aczkolwiek bez daty

package com.kodilla.good.patterns.challenges.allegro;

public class OrderDto {

    private CustomerInformation customer;
    private ItemMatch item;

    public OrderDto(CustomerInformation customer, ItemMatch item) {
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
