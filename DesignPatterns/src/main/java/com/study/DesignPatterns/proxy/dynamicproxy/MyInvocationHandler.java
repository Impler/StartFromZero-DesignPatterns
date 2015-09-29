package com.study.DesignPatterns.proxy.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class MyInvocationHandler implements InvocationHandler {
	
	private Object target;
	public MyInvocationHandler(Object target){
		this.target = target;
	}
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		Object result;
		System.out.println("execute proxy before......");
		result = method.invoke(target, args);
		System.out.println("after execute proxy......");
		return result;
	}

}
