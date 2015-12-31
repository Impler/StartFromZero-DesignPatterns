package com.study.DesignPatterns.factory._abstract;

public class MySQLLogDaoImpl implements ILogDao {

	@Override
	public void insert() {
		System.out.println("msyql: log insert");
	}

	@Override
	public void query() {
		System.out.println("msyql: log query");
	}

	@Override
	public void delete() {
		System.out.println("msyql: log delete");
	}

}
