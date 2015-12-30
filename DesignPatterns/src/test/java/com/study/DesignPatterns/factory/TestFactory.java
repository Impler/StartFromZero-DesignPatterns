package com.study.DesignPatterns.factory;

import org.junit.Test;

import com.study.DesignPatterns.factory.simple.Car;
import com.study.DesignPatterns.factory.simple.CarFactory;

public class TestFactory {

	@Test
	public void testSimpleFactory(){
		Car car = CarFactory.getCar(1);
		car.drive();
	}
	
	@Test
	public void testFactory(){
		IDBDriverFactory factory = new OracleDriverFactory();
		IDBDriver driver = factory.getDriver();
		driver.insert();
		driver.delete();
		driver.update();
		driver.query();
	}
}
