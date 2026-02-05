package utilities.Factories;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class LoggerFactory {
	private static Logger LOGGER;

	public static Logger getLogger(Class<?> clazz) {
		if (LOGGER == null) {
			LOGGER = LogManager.getLogger(clazz);
		}
		return LOGGER;
	}

}
