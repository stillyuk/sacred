package cglib;

import net.sf.cglib.proxy.Enhancer;

import org.junit.Test;

public class CglibTest {

	@Test
	public void test() {
		Enhancer en = new Enhancer();
		en.setSuperclass(A.class);
		en.setCallback(new Cglib());
		A a = (A) en.create();
		a.something();
	}
}
