package system.time;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import org.apache.log4j.Logger;

public class TimeListener implements ServletContextListener {
	Logger logger = Logger.getLogger(TimeListener.class);
	private long start;

	public void contextInitialized(ServletContextEvent sce) {
		start = System.currentTimeMillis();
		logger.info("启动时间监听器...");
	}

	public void contextDestroyed(ServletContextEvent sce) {
		logger.info("服务器总运行时间为：" + (System.currentTimeMillis() - start) + "ms");
	}
}
