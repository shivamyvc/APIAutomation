package utilities.Reporter;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;

import com.aventstack.extentreports.ExtentReports;

import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReportManager {
	private static ExtentReports extent;
	private static String EXTENT_REPORT_FOLDER = "ExtentReport";

	public static ExtentReports getReporter() {
		if (extent == null) {
			createExtentReport();
		}
		return extent;
	}

	private static void createExtentReport() {
		extent = new ExtentReports();
		ExtentSparkReporter spark = new ExtentSparkReporter(getReportPath());
		extent.attachReporter(spark);
	}

	private static void setReportCofiguration(Map<String, Object> reportMetadata) {
		// Setting Env Details
		// Setting QA Details
		// Themes With dynamic data from excel or configProperty
	}

	private static String getReportPath() {

		String folder = new SimpleDateFormat("dd-MMM-yyyy").format(new Date());
		String subfolder =       ""     ;//new SimpleDateFormat("hh-mm-ss").format(new Date());
		return EXTENT_REPORT_FOLDER + "/" + folder + "/" + subfolder + "_Report.html";

	}
	
	
	public static void flush() {
		if(extent!=null) {
			extent.flush();
		}
	}

}
