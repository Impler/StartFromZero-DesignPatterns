package com.study.DesignPatterns.factory._abstract;

public class OracleDaoFactory implements IDaoFactory {

	@Override
	public IUserDao getUserDao() {
		return new OracleUserDaoImpl();
	}

	@Override
	public ILogDao getLogDao() {
		return new OracleLogDaoImpl();
	}

	@Override
	public IGoodsDao getGoodsDao() {
		return new OracleGoodsDaoImpl();
	}

}
