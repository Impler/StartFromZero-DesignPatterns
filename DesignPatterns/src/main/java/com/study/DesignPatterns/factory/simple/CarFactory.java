package com.study.DesignPatterns.factory.simple;

public class CarFactory {
	public static Car getCar(int type){
		switch (type) {
		case 1:
			return new PersionalCar();
		case 2:
			return new Bus();
		default:
			return null;
		}
	}
}
