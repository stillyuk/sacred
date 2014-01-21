package beanfactory;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.NoSuchBeanDefinitionException;

public class MyBeanFactory implements BeanFactory {

	public Object getBean(String name) throws BeansException {
		return null;
	}

	public <T> T getBean(String name, Class<T> requiredType) throws BeansException {
		return null;
	}

	public <T> T getBean(Class<T> requiredType) throws BeansException {
		return null;
	}

	public Object getBean(String name, Object... args) throws BeansException {
		return null;
	}

	public boolean containsBean(String name) {
		return false;
	}

	public boolean isSingleton(String name) throws NoSuchBeanDefinitionException {
		return false;
	}

	public boolean isPrototype(String name) throws NoSuchBeanDefinitionException {
		return false;
	}

	public boolean isTypeMatch(String name, Class<?> targetType) throws NoSuchBeanDefinitionException {
		return false;
	}

	public Class<?> getType(String name) throws NoSuchBeanDefinitionException {
		return null;
	}

	public String[] getAliases(String name) {
		return null;
	}

}
