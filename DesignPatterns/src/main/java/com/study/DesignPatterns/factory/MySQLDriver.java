package com.study.DesignPatterns.factory;

public class MySQLDriver implements IDBDriver {
	private String driverName = "mysql";

	@Override
	public void insert() {
		System.out.println(driverName + " insert");
	}

	@Override
	public void delete() {
		System.out.println(driverName + " delete");
	}

	@Override
	public void update() {
		System.out.println(driverName + " update");
	}

	@Override
	public void query() {
		System.out.println(driverName + " query");
	}

}
