package com.food.ordering.system.main.DeliveryHandler;

public abstract class DeliveryHandler {
    protected DeliveryHandler next;
    public void setNext(DeliveryHandler next) {
        this.next = next;
    }
    public abstract void handleDelivery(String place);
}
