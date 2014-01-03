package test;

import java.lang.reflect.Method;

public class Test {
	public void test(String s, int i) {
		System.out.println("test");
	}

	public static void main(String[] args) {
		Method[] methods = Test.class.getDeclaredMethods();
		for (Method method : methods) {
			Class<?>[] types = method.getParameterTypes();
			for (Class<?> type : types) {
				System.out.println(type.getSimpleName());
			}
		}
	}
}
