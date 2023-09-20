package com.food.ordering.system.main;

public class TakeOutOrderOperator implements OrderOperation{
    private Order order;

    public TakeOutOrderOperator(Order order) {
        this.order = order;
    }

    @Override
    public Order execute() {
        return order.TakeOutOperation(order);
    }
}
