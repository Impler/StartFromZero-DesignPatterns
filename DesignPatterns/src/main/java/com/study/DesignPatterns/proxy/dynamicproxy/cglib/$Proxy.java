package com.study.DesignPatterns.proxy.dynamicproxy.cglib;

import java.lang.reflect.*;
import net.sf.cglib.proxy.Callback;
import net.sf.cglib.proxy.Factory;
/**
 * CDLIB生成的代理类
 * @author Impler
 * @date 2015-12-25
 */
public final class $Proxy extends Proxy implements Factory {

	private static final long serialVersionUID = 5049202139866965006L;
	private static Method m3;
	private static Method m1;
	private static Method m9;
	private static Method m7;
	private static Method m0;
	private static Method m8;
	private static Method m6;
	private static Method m5;
	private static Method m4;
	private static Method m2;

	public $Proxy(InvocationHandler invocationhandler) {
		super(invocationhandler);
	}

	@SuppressWarnings("rawtypes")
	public final Object newInstance(Class aclass[], Object aobj[], Callback acallback[]) {
		try {
			return (Object) super.h.invoke(this, m3, new Object[] { aclass, aobj, acallback });
		} catch (Error _ex) {
			return null;
		} catch (Throwable throwable) {
			throw new UndeclaredThrowableException(throwable);
		}
	}

	public final boolean equals(Object obj) {
		try {
			return ((Boolean) super.h.invoke(this, m1, new Object[] { obj })).booleanValue();
		} catch (Error _ex) {
			return false;
		} catch (Throwable throwable) {
			throw new UndeclaredThrowableException(throwable);
		}
	}

	public final Callback[] getCallbacks() {
		try {
			return (Callback[]) super.h.invoke(this, m9, null);
		} catch (Error _ex) {
			return null;
		} catch (Throwable throwable) {
			throw new UndeclaredThrowableException(throwable);
		}
	}

	public final void setCallbacks(Callback acallback[]) {
		try {
			super.h.invoke(this, m7, new Object[] { acallback });
			return;
		} catch (Error _ex) {
		} catch (Throwable throwable) {
			throw new UndeclaredThrowableException(throwable);
		}
	}

	public final int hashCode() {
		try {
			return ((Integer) super.h.invoke(this, m0, null)).intValue();
		} catch (Error _ex) {
			return -1;
		} catch (Throwable throwable) {
			throw new UndeclaredThrowableException(throwable);
		}
	}

	public final Callback getCallback(int i) {
		try {
			return (Callback) super.h.invoke(this, m8, new Object[] { Integer.valueOf(i) });
		} catch (Error _ex) {
			return null;
		} catch (Throwable throwable) {
			throw new UndeclaredThrowableException(throwable);
		}
	}

	public final void setCallback(int i, Callback callback) {
		try {
			super.h.invoke(this, m6, new Object[] { Integer.valueOf(i), callback });
			return;
		} catch (Error _ex) {
		} catch (Throwable throwable) {
			throw new UndeclaredThrowableException(throwable);
		}
	}

	public final Object newInstance(Callback callback) {
		try {
			return (Object) super.h.invoke(this, m5, new Object[] { callback });
		} catch (Error _ex) {
			return null;
		} catch (Throwable throwable) {
			throw new UndeclaredThrowableException(throwable);
		}
	}

	public final Object newInstance(Callback acallback[]) {
		try {
			return (Object) super.h.invoke(this, m4, new Object[] { acallback });
		} catch (Error _ex) {
			return null;
		} catch (Throwable throwable) {
			throw new UndeclaredThrowableException(throwable);
		}
	}

	public final String toString() {
		try {
			return (String) super.h.invoke(this, m2, null);
		} catch (Error _ex) {
			return null;
		} catch (Throwable throwable) {
			throw new UndeclaredThrowableException(throwable);
		}
	}

	static {
		try {
			m3 = Class.forName("net.sf.cglib.proxy.Factory")
					.getMethod("newInstance", 
							new Class[] { 
									Class.forName("[Ljava.lang.Class;"), 
									Class.forName("[Ljava.lang.Object;"),
									Class.forName("[Lnet.sf.cglib.proxy.Callback;") });
			m1 = Class.forName("java.lang.Object")
					.getMethod("equals", new Class[] { Class.forName("java.lang.Object") });
			m9 = Class.forName("net.sf.cglib.proxy.Factory").getMethod("getCallbacks", new Class[0]);
			m7 = Class.forName("net.sf.cglib.proxy.Factory").getMethod("setCallbacks",
					new Class[] { Class.forName("[Lnet.sf.cglib.proxy.Callback;") });
			m0 = Class.forName("java.lang.Object").getMethod("hashCode", new Class[0]);
			m8 = Class.forName("net.sf.cglib.proxy.Factory").getMethod("getCallback", new Class[] { Integer.TYPE });
			m6 = Class.forName("net.sf.cglib.proxy.Factory").getMethod("setCallback",
					new Class[] { Integer.TYPE, Class.forName("net.sf.cglib.proxy.Callback") });
			m5 = Class.forName("net.sf.cglib.proxy.Factory").getMethod("newInstance",
					new Class[] { Class.forName("net.sf.cglib.proxy.Callback") });
			m4 = Class.forName("net.sf.cglib.proxy.Factory").getMethod("newInstance",
					new Class[] { Class.forName("[Lnet.sf.cglib.proxy.Callback;") });
			m2 = Class.forName("java.lang.Object").getMethod("toString", new Class[0]);
		} catch (NoSuchMethodException nosuchmethodexception) {
			throw new NoSuchMethodError(nosuchmethodexception.getMessage());
		} catch (ClassNotFoundException classnotfoundexception) {
			throw new NoClassDefFoundError(classnotfoundexception.getMessage());
		}
	}
}
