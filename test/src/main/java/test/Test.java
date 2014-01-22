package test;

import java.lang.reflect.Method;
import java.net.URL;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.mail.javamail.JavaMailSender;

public class Test {
	public static void main(String[] args) throws Exception {
		URL[] url = new URL[] { new URL("file", "localhost", "D:/spring.jar") };
		A a = new A(url);
		Class<?> c = a.loadClass("cglib.A");

		Method method = c.getMethod("something");
		method.invoke(c.newInstance());
		DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
		factory.setBeanClassLoader(a);
		XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("springMail.xml");
		JavaMailSender javaMailSender = (JavaMailSender) factory.getBean("javaMailSender");
		System.out.println(DefaultListableBeanFactory.class.getClassLoader());
	}
}
