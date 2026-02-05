package utilities.Reporter;

import com.aventstack.extentreports.ExtentTest;

public class ExtentTestManager {
	
	private static ThreadLocal<ExtentTest> test= new ThreadLocal<ExtentTest>();
	
	public static ExtentTest getTest() {
		return test.get();
	}
	
	public static void createTest(String testName) {
		ExtentTest extentTest=ExtentReportManager.getReporter().createTest(testName);
		test.set(extentTest);
	}
	public static void createTest(String testName,String testDescription) {
		ExtentTest extentTest=ExtentReportManager.getReporter().createTest(testName,testDescription);
		test.set(extentTest);
	}

}
