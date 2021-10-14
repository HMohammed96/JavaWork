package loggingDemo;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class LogDemo {

	public static Logger newLogger = LogManager.getLogger();
	
	public static void logTest(String name) {
		newLogger.info("Hey " + name);
	}
}
