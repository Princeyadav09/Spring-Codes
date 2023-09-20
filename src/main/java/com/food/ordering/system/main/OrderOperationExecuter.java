package com.food.ordering.system.main;

import java.util.ArrayList;
import java.util.List;

public class OrderOperationExecuter {
    private final List<OrderOperation> orderOperations
            = new ArrayList<>();

    public Order executeOperation(OrderOperation orderOperation) {
        orderOperations.add(orderOperation);
        return orderOperation.execute();
    }
}
