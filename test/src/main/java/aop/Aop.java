package aop;

import org.apache.log4j.Logger;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class Aop {

	private static Logger logger = Logger.getLogger(Aop.class);

	@Pointcut("within(web..*)")
	public void pointcut() {}

	@Before("pointcut()")
	public void testing() {
		logger.info("testing...");
	}

	@AfterThrowing(value="pointcut()", throwing="ex")
	public void sendMail(Exception ex) {
		logger.info("system error");
		ex.printStackTrace();
	}
}
