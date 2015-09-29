package com.study.DesignPatterns.proxy;

/**
 * 车站实例
 * @author Impler
 * @date 2015年9月29日
 */
public class Station implements TicketService {
	private String name;
	
	public Station(String name){
		this.name = name;
	}
	
	@Override
	public void sell() {
		System.out.println("本站" + name + "将为您提供售票服务");
	}

	@Override
	public void withdraw() {
		System.out.println("本站" + name + "将为您提供退票服务");
	}

}
