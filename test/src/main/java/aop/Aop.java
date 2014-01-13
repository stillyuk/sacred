package aop;

import org.apache.log4j.Logger;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class Aop {
	
	Logger logger = Logger.getLogger(Aop.class);

	@Pointcut("within(web..*)")
	public void pointcut() {}

	@Before("pointcut()")
	public void testing() {
		logger.info("testing...");
	}

	@AfterThrowing("pointcut()")
	public void sendMail() {
		logger.info("system error");
		
	
	}
}
