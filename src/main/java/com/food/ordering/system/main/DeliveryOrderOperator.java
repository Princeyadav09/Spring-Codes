package com.food.ordering.system.main;

public class DeliveryOrderOperator implements OrderOperation{
    private Order order;

    public DeliveryOrderOperator(Order order) {
        this.order = order;
    }

    @Override
    public Order execute() {
        return order.DeliveryOperation(order);
    }
}
