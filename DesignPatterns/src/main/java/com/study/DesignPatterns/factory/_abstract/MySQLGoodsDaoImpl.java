package com.study.DesignPatterns.factory._abstract;

public class MySQLGoodsDaoImpl implements IGoodsDao {

	@Override
	public void insert() {
		System.out.println("mysql: goods insert");
	}

	@Override
	public void query() {
		System.out.println("mysql: goods query");
	}

	@Override
	public void delete() {
		System.out.println("mysql: goods delete");
	}

}
