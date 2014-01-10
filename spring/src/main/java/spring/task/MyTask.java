package spring.task;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Component;

@Component
public class MyTask {
	Logger logger = Logger.getLogger(this.getClass());
	
	public void task() {
		System.out.println("fuoo");
		logger.error("errorrrr");
	}
}
