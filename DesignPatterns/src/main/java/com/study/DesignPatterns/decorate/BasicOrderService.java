package com.study.DesignPatterns.decorate;

public class BasicOrderService implements IOrderService {

	@Override
	public void placeOrder() {
		System.out.println("预定一张火车票");
	}

}
