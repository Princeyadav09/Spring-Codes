package com.food.ordering.system.main;

public class DineInOrderOperator implements OrderOperation{
    private Order order;

    public DineInOrderOperator(Order order) {
        this.order = order;
    }

    @Override
    public Order execute() {
        return order.DineInOperation(order);
    }
}
