package com.study.DesignPatterns.decorate;

public abstract class OrderDecorate implements IOrderService {

	private IOrderService service;
	
	public OrderDecorate(IOrderService service) {
		super();
		this.service = service;
	}

	@Override
	public void placeOrder() {
		service.placeOrder();
	}

}
