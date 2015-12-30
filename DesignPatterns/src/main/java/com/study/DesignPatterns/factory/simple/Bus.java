package com.study.DesignPatterns.factory.simple;

public class Bus extends Car {

	@Override
	public String toString() {
		return "Bus ";
	}

	@Override
	public void drive() {
		System.out.println(this.toString() + "drive....");
	}
}
