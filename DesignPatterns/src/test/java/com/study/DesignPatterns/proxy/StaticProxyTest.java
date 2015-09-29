package com.study.DesignPatterns.proxy;

import org.junit.Before;
import org.junit.Test;

import com.study.DesignPatterns.proxy.Station;
import com.study.DesignPatterns.proxy.staticproxy.StationProxy;

public class StaticProxyTest {

	private StationProxy station = null;
	
	@Before
	public void prepare(){
		this.station = new StationProxy(new Station("南京站"));
	}
	
	@Test
	public void testSell() {
		station.sell();
	}

	@Test
	public void testWithdraw() {
		station.withdraw();
	}

}
