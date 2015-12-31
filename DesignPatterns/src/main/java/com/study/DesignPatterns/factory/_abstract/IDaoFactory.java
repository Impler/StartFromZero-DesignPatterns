package com.study.DesignPatterns.factory._abstract;

public interface IDaoFactory {
	public IUserDao getUserDao();
	public ILogDao getLogDao();
	public IGoodsDao getGoodsDao();
}
