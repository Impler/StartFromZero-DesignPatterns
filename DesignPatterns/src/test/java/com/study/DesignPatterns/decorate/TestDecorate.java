package com.study.DesignPatterns.decorate;

import org.junit.Test;

public class TestDecorate {

	@Test
	public void test(){
		IOrderService service = new BasicOrderService();
		OrderDecorate mailService = new MailService(service);
		OrderDecorate smsService = new SMSService(mailService);
		smsService.placeOrder();
	}
}
