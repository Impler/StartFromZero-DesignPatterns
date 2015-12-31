package com.study.DesignPatterns.factory._abstract;

public class MySQLDaoFactory implements IDaoFactory {

	@Override
	public IUserDao getUserDao() {
		return new MySQLUserDaoImpl();
	}

	@Override
	public ILogDao getLogDao() {
		return new MySQLLogDaoImpl();
	}

	@Override
	public IGoodsDao getGoodsDao() {
		return new MySQLGoodsDaoImpl();
	}

}
