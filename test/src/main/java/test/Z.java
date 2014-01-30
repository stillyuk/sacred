package test;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

/**
 * @author jiangyukun
 * @since 2014-1-27 15:38
 *
 */
@Component
public class Z implements BeanPostProcessor {
	private static Z z;

	/**
	 * @param args
	 */
	public static void main(String... args) {
		ConfigurableApplicationContext context = new AnnotationConfigApplicationContext(Z.class);
		System.out.println(context.getBeanFactory().getBeanPostProcessorCount());
		z = (Z) context.getBean(Z.class);
		z.doSomething();
		context.close();
	}

	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("...init...");
		return bean;
	}

	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("...init complete...");
		return null;
	}

	public void doSomething() {
		System.out.println("...");
	}

	@Bean
	public B mockZ() {
		return new B();
	}
}
