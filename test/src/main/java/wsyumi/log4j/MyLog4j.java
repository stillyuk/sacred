package wsyumi.log4j;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class MyLog4j {
	public static void main(String[] args) {
		Logger logger = LogManager.getLogger("ww");
		logger.warn("aa");
	}
}
