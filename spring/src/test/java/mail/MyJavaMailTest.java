package mail;

import org.junit.Test;

public class MyJavaMailTest {

	@Test
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
		SimpleMailSender.sendHtmlMail(mailInfo);
	}
}
