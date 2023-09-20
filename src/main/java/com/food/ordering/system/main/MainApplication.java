package com.food.ordering.system.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MainApplication {

	public static void main(String[] args) {
		SpringApplication.run(MainApplication.class, args);

		OrderOperationExecuter orderOperationExecuter = new OrderOperationExecuter();

		Order order1 = orderOperationExecuter.executeOperation(
				new DineInOrderOperator(new Order()
						.setRice("rice")
						.setRoti("roti")
						.setPaneer("panner")
						.setIcecream("icecream")
						.setColdrink("coco-cola")
						.setSalad("salad")));

		System.out.println(order1);

		order1.setColdrink("Dew");

		System.out.println(order1);

		Order order2 = orderOperationExecuter.executeOperation(
				new TakeOutOrderOperator(new Order()
						.setRice("rice")
						.setRoti("roti")
						.setSalad("salad")));

		System.out.println(order2);

		Order order3 = orderOperationExecuter.executeOperation(
				new DeliveryOrderOperator(new Order()
						.setPaneer("panner")
						.setIcecream("icecream")
						.setColdrink("coco-cola")
						.setSalad("salad")));

		System.out.println(order3);


	}

}
