package com.food.ordering.system.main;

import com.food.ordering.system.main.DeliveryHandler.CityDelivery;
import com.food.ordering.system.main.DeliveryHandler.DeliveryHandler;
import com.food.ordering.system.main.DeliveryHandler.VillageDelivery;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MainApplication {

	public static void main(String[] args) {
		SpringApplication.run(MainApplication.class, args);

		OrderOperationExecuter orderOperationExecuter = new OrderOperationExecuter();

		Order order1 = orderOperationExecuter.executeOperation(
				new DineInOrderOperator( Order.getOrder()
						.setRice("rice")
						.setRoti("roti")
						.setPaneer("panner")
						.setIcecream("icecream")
						.setColdrink("coco-cola")
						.setSalad("salad")));

		System.out.println(order1);

		order1.setColdrink("Dew");

		System.out.println(order1);

		DeliveryHandler city = new CityDelivery();
		DeliveryHandler village = new VillageDelivery();
		city.setNext(village);

		city.handleDelivery("village");
		city.handleDelivery("city");

	}

}
