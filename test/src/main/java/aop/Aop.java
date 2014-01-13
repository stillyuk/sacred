package aop;

import org.apache.log4j.Logger;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailMessage;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class Aop {
	
	@Autowired
	private JavaMailSender javaMailSender;
	
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
		SimpleMailMessage message = new SimpleMailMessage();
		message.setFrom("x31001333@163.com");
		message.setTo("191295604@qq.com");
		message.setSubject("我的异常");
		message.setText(ex.getMessage());
		javaMailSender.send(message);
	}
}
