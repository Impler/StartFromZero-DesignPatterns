package com.study.DesignPatterns.proxy.dynamicproxy;

import com.study.DesignPatterns.proxy.TicketService;
import java.lang.reflect.*;

/**
 * 动态代理生成的class文件
 * @author Impler
 * @date 2015年9月29日
 */
public final class $Proxy extends Proxy implements TicketService {

	private static final long serialVersionUID = 1908489644482865743L;
	private static Method m1;
	private static Method m0;
	private static Method m4;
	private static Method m3;
	private static Method m2;

	public $Proxy(InvocationHandler invocationhandler) {
		super(invocationhandler);
	}

	public final boolean equals(Object obj) {
		try {
			return ((Boolean) super.h.invoke(this, m1, new Object[] { obj })).booleanValue();
		} catch (Error _ex) {
		} catch (Throwable throwable) {
			throw new UndeclaredThrowableException(throwable);
		}
		return false;
	}

	public final int hashCode() {
		try {
			return ((Integer) super.h.invoke(this, m0, null)).intValue();
		} catch (Error _ex) {
		} catch (Throwable throwable) {
			throw new UndeclaredThrowableException(throwable);
		}
		return 0;
	}

	public final void withdraw() {
		try {
			super.h.invoke(this, m4, null);
			return;
		} catch (Error _ex) {
		} catch (Throwable throwable) {
			throw new UndeclaredThrowableException(throwable);
		}
	}

	public final void sell() {
		try {
			super.h.invoke(this, m3, null);
			return;
		} catch (Error _ex) {
		} catch (Throwable throwable) {
			throw new UndeclaredThrowableException(throwable);
		}
	}

	public final String toString() {
		try {
			return (String) super.h.invoke(this, m2, null);
		} catch (Error _ex) {
		} catch (Throwable throwable) {
			throw new UndeclaredThrowableException(throwable);
		}
		return null;
	}

	static {
		try {
			m1 = Class.forName("java.lang.Object").getMethod("equals",
					new Class[] { Class.forName("java.lang.Object") });
			m0 = Class.forName("java.lang.Object").getMethod("hashCode", new Class[0]);
			m4 = Class.forName("com.study.DesignPatterns.proxy.TicketService").getMethod("withdraw", new Class[0]);
			m3 = Class.forName("com.study.DesignPatterns.proxy.TicketService").getMethod("sell", new Class[0]);
			m2 = Class.forName("java.lang.Object").getMethod("toString", new Class[0]);
		} catch (NoSuchMethodException nosuchmethodexception) {
			throw new NoSuchMethodError(nosuchmethodexception.getMessage());
		} catch (ClassNotFoundException classnotfoundexception) {
			throw new NoClassDefFoundError(classnotfoundexception.getMessage());
		}
	}
}