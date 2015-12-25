package com.study.DesignPatterns.factory;

public class MySQLDriverFactory implements IDBDriverFactory {

	@Override
	public IDBDriver getDriver() {
		return new MySQLDriver();
	}

}
