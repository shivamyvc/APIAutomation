package utilities.Reporter;

import java.io.IOException;


import org.apache.logging.log4j.Logger;

import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.CodeLanguage;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.model.Media;

import utilities.Factories.LoggerFactory;

import org.apache.logging.log4j.LogManager;

public class ReportLogger {
	private static Logger LOGGER=LoggerFactory.getLogger(ReportLogger.class);
	
	
	public static void  fail(String Message) {
		LOGGER.error(Message);
		ExtentTestManager.getTest().fail(Message);
		
		//Extent Report Integration here
	}
	
	
	public static void  fail(Throwable t) {
		LOGGER.error(t);
		ExtentTestManager.getTest().fail(t);
		
		//Extent Report Integration here
	}
	
	public static void  pass(String Message) {
		LOGGER.debug(Message);
		ExtentTestManager.getTest().pass(Message);
		
		//Extent Report Integration here
	}
	
	public static void  skip(String Message) {
		LOGGER.debug(Message);
		
		//Extent Report Integration here
	}
	
	public static void  info(String Message) {
		LOGGER.info(Message);
		ExtentTestManager.getTest().info(Message);
		
		
		//Extent Report Integration here
	}
	
	public static void  warn(String Message) {
		LOGGER.warn(Message);
		
		//Extent Report Integration here
	}
	
	public static void  error(String Message) {
		LOGGER.error(Message);
		
		//Extent Report Integration here
	}
	
	public static void logRequest(String json) {
		LOGGER.info("Request: "+json);
		ExtentTestManager.getTest().log(Status.INFO, MarkupHelper.createCodeBlock(json,CodeLanguage.JSON));	
	}
	
	
	public static void logResponse(String json) {
		LOGGER.info("Response: "+json);
		ExtentTestManager.getTest().log(Status.INFO, MarkupHelper.createCodeBlock(json,CodeLanguage.JSON));	
	}

}
