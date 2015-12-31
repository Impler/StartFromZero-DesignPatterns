package com.study.DesignPatterns.factory._abstract;

public class OracleLogDaoImpl implements ILogDao {

	@Override
	public void insert() {
		System.out.println("oracle: log insert");
	}

	@Override
	public void query() {
		System.out.println("oracle: log query");
	}

	@Override
	public void delete() {
		System.out.println("oracle: log delete");
	}

}
