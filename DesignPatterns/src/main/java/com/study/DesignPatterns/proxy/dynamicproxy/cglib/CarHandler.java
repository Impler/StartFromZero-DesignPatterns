package com.study.DesignPatterns.proxy.dynamicproxy.cglib;

import java.lang.reflect.Method;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

public class CarHandler implements MethodInterceptor {

	@Override
	public Object intercept(Object obj, Method method, Object[] args, MethodProxy proxy) throws Throwable {
		Object result;
		System.out.println("发动汽车。。。。");
		result = proxy.invokeSuper(obj, args);
		System.out.println("靠边停车。。。。");
		return result;
	}

}
