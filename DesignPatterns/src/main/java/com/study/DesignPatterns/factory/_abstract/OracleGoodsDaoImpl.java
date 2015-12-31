package com.study.DesignPatterns.factory._abstract;

public class OracleGoodsDaoImpl implements IGoodsDao {

	@Override
	public void insert() {
		System.out.println("oracle: goods insert");
	}

	@Override
	public void query() {
		System.out.println("oracle: goods query");
	}

	@Override
	public void delete() {
		System.out.println("oracle: goods delete");
	}

}
