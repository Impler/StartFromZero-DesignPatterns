package com.study.DesignPatterns.factory.simple;

public class PersionalCar extends Car{

	@Override
	public String toString() {
		return "PersionalCar ";
	}

	@Override
	public void drive() {
		System.out.println(this.toString() + "drive.....");
	}
	
}
