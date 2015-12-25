package com.study.DesignPatterns.strategy;
/**
 * 简易计算器
 * @author Impler
 * @date 2015-12-25
 */
public class Calculator {
	//运算法则
	private IOperation opera;

	
	public IOperation getOpera() {
		return opera;
	}

	public void setOpera(IOperation opera) {
		this.opera = opera;
	}
	
	/**
	 * 获取两个数运算结果
	 * @param numA
	 * @param numB
	 * @return
	 */
	public double getResult(double numA, double numB){
		return opera.operate(numA, numB);
	}
}
