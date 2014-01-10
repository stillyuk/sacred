package spring;

import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTaskTest {
	@Test
	public void testTask() {
		BeanFactory factory = new ClassPathXmlApplicationContext("applicationContext.xml");
		factory.getBean("myTask");
		while (true){
			
		}
	}
}
