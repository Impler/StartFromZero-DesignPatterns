package com.study.DesignPatterns.decorate;

public class SMSService extends OrderDecorate {

	public SMSService(IOrderService service) {
		super(service);
	}

	@Override
	public void placeOrder() {
		super.placeOrder();
		System.out.println("发送短信提醒订单成功");
	}
}
