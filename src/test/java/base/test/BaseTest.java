package base.test;

import java.lang.reflect.Method;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;

import utilities.Reporter.ExtentTestManager;

@Listeners({utilities.Listeners.Listener.class})
public class BaseTest {
	
	@BeforeMethod
	void checkSetup(){
		System.out.println("+++++++++++++++================================");
	}
	

	

}
