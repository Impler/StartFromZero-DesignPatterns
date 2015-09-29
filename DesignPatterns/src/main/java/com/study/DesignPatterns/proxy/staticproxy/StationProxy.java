package com.study.DesignPatterns.proxy.staticproxy;

public class StationProxy implements TicketService {
	private Station station;
	public StationProxy(Station station){
		this.station = station;
	}
	
	@Override
	public void sell() {
		System.out.println("欢迎光临本站");
		this.station.sell();
		System.out.println("感谢您的惠顾");
	}

	@Override
	public void withdraw() {
		System.out.println("欢迎光临本站");
		this.station.withdraw();
		System.out.println("感谢您的惠顾");
	}

}
