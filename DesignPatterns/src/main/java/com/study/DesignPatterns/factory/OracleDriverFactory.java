package com.study.DesignPatterns.factory;

public class OracleDriverFactory implements IDBDriverFactory {

	@Override
	public IDBDriver getDriver() {
		return new OracleDriver();
	}

}
