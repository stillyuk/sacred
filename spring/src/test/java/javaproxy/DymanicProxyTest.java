package javaproxy;

import java.lang.reflect.Proxy;

import org.junit.Test;

public class DymanicProxyTest {

	@Test
	public void test() {
		Object target = new ProtocolImpl();
		DynamicProxy dynamicProxy = new DynamicProxy(target);
		Vacuous protocol = (Vacuous) Proxy.newProxyInstance(
				dynamicProxy.getClass().getClassLoader(),
				target.getClass().getInterfaces(), dynamicProxy);
		protocol.vacuous();
	}

}
