package com.study.DesignPatterns.proxy;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.Proxy;
import org.junit.Test;

import com.study.DesignPatterns.proxy.dynamicproxy.cglib.Car;
import com.study.DesignPatterns.proxy.dynamicproxy.cglib.CarHandler;
import com.study.DesignPatterns.proxy.dynamicproxy.jdk.MyInvocationHandler;
import com.study.DesignPatterns.proxy.dynamicproxy.jdk.Station;

import net.sf.cglib.proxy.Enhancer;

public class DynamicProxyTest {


	@Test
	public void testJDK() throws IOException {
		Station station = new Station("南京站");
		MyInvocationHandler h = new MyInvocationHandler(station);
		TicketService proxy = (TicketService) Proxy.newProxyInstance(station.getClass().getClassLoader(),
				station.getClass().getInterfaces(), h);
		
		proxy.sell();
		proxy.withdraw();
		exportDynamicClassFile(station);
	}

	/**
	 * 导出动态生成的.class文件
	 * @param target
	 * @throws IOException
	 */
	public void exportDynamicClassFile(Object target) throws IOException{
		@SuppressWarnings("restriction")
		byte[] bytes = sun.misc.ProxyGenerator.generateProxyClass("$Proxy", target.getClass().getInterfaces());
		File file = new File("$Proxy.class");
		FileOutputStream out = new FileOutputStream(file);
		out.write(bytes);
		out.close();
	}
	
	
	@Test
	public void testCGLib(){
		
		Enhancer enhance = new Enhancer();
		enhance.setSuperclass(Car.class);
		enhance.setCallback(new CarHandler());
		
		Car proxy = (Car) enhance.create();
		proxy.drive();
	}
}
