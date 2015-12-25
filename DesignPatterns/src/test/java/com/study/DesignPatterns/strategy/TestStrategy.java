package com.study.DesignPatterns.strategy;

import org.junit.Test;

public class TestStrategy {
	
	@Test
	public void test(){
		Calculator c = new Calculator();
		IOperation opera = new AddOperation();
		c.setOpera(opera);
		System.out.println(c.getResult(1, 2));
	}
}
