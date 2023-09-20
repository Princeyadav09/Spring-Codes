package com.food.ordering.system.main.DeliveryHandler;

public class VillageDelivery extends DeliveryHandler{
    public void handleDelivery(String place) {
        if (place == "village") {
            System.out.println("Delivered in the village");
        } else {
            next.handleDelivery(place);
        }
    }
}
