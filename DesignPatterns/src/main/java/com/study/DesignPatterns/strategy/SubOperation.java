package com.study.DesignPatterns.strategy;

/**
 * 减法具体实现
 * @author Impler
 * @date 2015-12-25
 */
public class SubOperation implements IOperation {

	@Override
	public double operate(double numA, double numB) {
		return numA - numB;
	}

}
