package com.study.DesignPatterns.factory;

public interface IDBDriver {
	public void insert();
	public void delete();
	public void update();
	public void query();
}
