package mail;

import java.util.Properties;

import javax.mail.Address;
import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;

public class MyJavaMailTest {

	public void test() {
		MailSenderInfo mailInfo = new MailSenderInfo();
		mailInfo.setMailServerHost("smtp.163.com");
		mailInfo.setMailServerPort("25");
		mailInfo.setValidate(true);
		mailInfo.setUserName("x31001333@163.com");
		mailInfo.setPassword("tkggycb");
		mailInfo.setFromAddress("x31001333@163.com");
		mailInfo.setToAddress("191295604@qq.com");
		mailInfo.setSubject("test");
		mailInfo.setContent("content");

		SimpleMailSender.sendTextMail(mailInfo);
	}

	public void testSend() throws Exception {
		Properties props = new Properties();
		props.put("mail.smtp.host", "smtp.163.com");
		props.put("mail.smtp.port", "25");
		props.put("mail.smtp.auth", "true");
		Authenticator authenticator = new Authenticator() {
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication("x31001333@163.com", "tkggycb");
			}
		};
		Session session = Session.getDefaultInstance(props, authenticator);
		Message message = new MimeMessage(session);
		Address to = new InternetAddress("191295604@qq.com");
		message.setFrom(new InternetAddress("18768105877@163.com"));
		message.setRecipient(Message.RecipientType.TO, to);
		message.setSubject("TEST...");
		message.setText("no reply");
		Transport.send(message);
	}

	@Test
	public void testSpringMail() {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("springMail.xml");
		JavaMailSender sender = (JavaMailSender) ctx.getBean("springMail");
		SimpleMailMessage mail = new SimpleMailMessage();
		try {
			mail.setTo("191295604@qq.com");
			mail.setFrom("18768105877@163.com");
			mail.setSubject("spring mail test!");
			mail.setText("springMail的简单发送测试");
			sender.send(mail);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
