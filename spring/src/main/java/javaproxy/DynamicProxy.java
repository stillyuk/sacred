package javaproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class DynamicProxy implements InvocationHandler {
	private Object protocol;
	public DynamicProxy(Object protocol) {
		this.protocol = protocol;
	}

	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		System.out.println("before");
		method.invoke(protocol);
		return null;
	}

}
