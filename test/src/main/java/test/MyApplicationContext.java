package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import wsyumi.task.ITask;

public class MyApplicationContext {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("springAop.xml");
		ITask task = (ITask) context.getBean("task");
		task.task();
	}
}
