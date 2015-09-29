package com.study.DesignPatterns.proxy.staticproxy;

import org.junit.Before;
import org.junit.Test;

public class StationProxyTest {

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
