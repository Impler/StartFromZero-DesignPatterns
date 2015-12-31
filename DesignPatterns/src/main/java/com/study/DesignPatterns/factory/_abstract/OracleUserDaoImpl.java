package com.study.DesignPatterns.factory._abstract;

public class OracleUserDaoImpl implements IUserDao {

	@Override
	public void insert() {
		System.out.println("oracle: user insert");
	}

	@Override
	public void query() {
		System.out.println("oracle: user query");
	}

	@Override
	public void delete() {
		System.out.println("oracle: user delete");
	}

}
