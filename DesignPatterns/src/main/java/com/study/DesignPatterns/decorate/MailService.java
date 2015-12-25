package com.study.DesignPatterns.decorate;

public class MailService extends OrderDecorate {

	public MailService(IOrderService service) {
		super(service);
	}

	@Override
	public void placeOrder() {
		super.placeOrder();
		System.out.println("发送邮件提醒订单成功");
	}

	
}
