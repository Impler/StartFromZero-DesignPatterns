package com.study.DesignPatterns.factory._abstract;

public class MySQLUserDaoImpl implements IUserDao {

	@Override
	public void insert() {
		System.out.println("mysql: user insert");
	}

	@Override
	public void query() {
		System.out.println("mysql: user query");
	}

	@Override
	public void delete() {
		System.out.println("mysql: user delete");
	}

}
