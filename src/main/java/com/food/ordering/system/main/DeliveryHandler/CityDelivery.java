package com.food.ordering.system.main.DeliveryHandler;

public class CityDelivery extends DeliveryHandler{
    public void handleDelivery(String place) {
        if (place == "city") {
            System.out.println("Delivered in the city");
        } else {
            next.handleDelivery(place);
        }
    }
}
