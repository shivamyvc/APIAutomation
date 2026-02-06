package base.test;

import java.lang.reflect.Method;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;

import io.restassured.response.Response;
import models.request.auth.ReqLogin;
import services.AuthServices;
import services.UserManagement;
import utilities.Reporter.ExtentTestManager;

@Listeners({utilities.Listeners.Listener.class})
public class BaseTest {
	protected String userToken;

	@BeforeSuite(alwaysRun = true)
	public void loginAndSetToken() {
		ReqLogin loginPayload = new ReqLogin.Builder().username("shivammavii").password("Learn@2000").build();
		AuthServices authService = new AuthServices();
		Response response = authService.login(loginPayload);
		Assert.assertEquals(response.getStatusCode(), 200, "Login Failed");
		userToken = response.jsonPath().getString("token");
	}
	
	public String getToken() {
		return userToken;
	}
}
