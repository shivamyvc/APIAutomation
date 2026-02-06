package utilities.Listeners;

import org.apache.logging.log4j.Logger;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import utilities.Factories.LoggerFactory;
import utilities.Reporter.APILogContext;
import utilities.Reporter.ExtentReportManager;
import utilities.Reporter.ExtentTestManager;
import utilities.Reporter.ReportLogger;

public class Listener implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
		ExtentTestManager.createTest(result.getMethod().getMethodName(), result.getMethod().getDescription());
		ReportLogger.info("Test Started : " + result.getName());

	}

	@Override
	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		
		ReportLogger.pass("<b>" + APILogContext.getRequest().getMethod() + " Request On : "
				+ APILogContext.getRequest().getURI() + "</b>");
		if (APILogContext.getRequest().getBody() != null)
			ReportLogger.logRequest(APILogContext.getRequest().getBody());
		ReportLogger.pass("Response: ");
		ReportLogger.logResponse(APILogContext.getResponse().getBody().asPrettyString());
		ReportLogger.pass("Test Passed: " + result.getName());

	}

	@Override
	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		ReportLogger.pass("<b>" + APILogContext.getRequest().getMethod() + " Request On : "
				+ APILogContext.getRequest().getURI() + "</b>");
		if (APILogContext.getRequest().getBody() != null)
			ReportLogger.logRequest(APILogContext.getRequest().getBody());
		ReportLogger.pass("Response: ");
		ReportLogger.logResponse(APILogContext.getResponse().getBody().asPrettyString());

		Throwable t = result.getThrowable();
		if (t != null) {
			if (t.getMessage() != null) {
				ReportLogger.fail(t.getMessage());
			} else {
				ReportLogger.fail(t);
			}
		}
		ReportLogger.fail("Test Failed: " + result.getName());

	}

	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub

		ExtentReportManager.getReporter();

	}

	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		APILogContext.clear();
		ExtentReportManager.flush();

	}

}
