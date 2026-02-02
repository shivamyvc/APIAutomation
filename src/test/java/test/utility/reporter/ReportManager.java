package test.utility.reporter;

import java.io.IOException;


import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

public class ReportManager {
	private static Logger LOGGER;
	
	public static Logger getReporter(Class<?> clazz)  {
		if(LOGGER ==null) {
			LOGGER=LogManager.getLogger(clazz);
		}
		return LOGGER;
	}
	
	
	public static void  info(String Message) {
		LOGGER.info(Message);
		
		//Extent Report Integration here
	}
	
	public static void  error(String Message) {
		LOGGER.error(Message);
		
		//Extent Report Integration here
	}

}
