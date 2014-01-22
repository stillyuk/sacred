package test;

import java.net.URL;
import java.net.URLClassLoader;

public class A extends URLClassLoader {

	public A(URL[] urls) {
		super(urls);
	}

}
