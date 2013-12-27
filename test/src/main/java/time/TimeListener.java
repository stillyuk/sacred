package time;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class TimeListener implements ServletContextListener {
	private long start;

	public void contextInitialized(ServletContextEvent sce) {
		start = System.currentTimeMillis();
		System.out.println("启动时间监听器...");
	}

	public void contextDestroyed(ServletContextEvent sce) {
		System.out.println("服务器总运行时间为：" + (System.currentTimeMillis() - start) + "ms");
	}
}
