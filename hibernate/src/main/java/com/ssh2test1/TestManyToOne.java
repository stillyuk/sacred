package com.ssh2test1;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.hibtest1.entity.Question;
import com.ssh2test1.dao.BaseHibernateDAOImpl;

public class TestManyToOne {
	public static void main(String[] args) {
		
		TestManyToOne a = new TestManyToOne();
		a.test();
		System.out.println("..");
	}

	public void test() {
		Question condition = new Question();
		condition.setQid(2);

		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml"); 
		BaseHibernateDAOImpl baseHibernateDAOImpl = (BaseHibernateDAOImpl) context.getBean("baseHibernateDAOImpl");
		List list = baseHibernateDAOImpl.search(condition);
		if (list.size() > 0) {
			System.out.println(condition.getQanswer()
					+ condition.getTest().getTcontent().toString());
		} else {
			System.out.println("sorry");
		}
	}
}
