package test.auth.services;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.response.Response;
import models.request.auth.ReqLogin;
import models.response.auth.RespLogin;
import services.AuthServices;

public class LoginTest {

	@Test(testName = "LoginTest", description = "Login With Valid Credentials", priority = 1)
	void validLoginTest() {
		// Creating Login Payload
		ReqLogin loginPayload = new ReqLogin.Builder().username("shivammavii").password("Learn@2000").build();
		AuthServices authService = new AuthServices();
		Response response = authService.login(loginPayload);
		RespLogin responseModel = response.as(RespLogin.class);

		System.out.println("Token Sync Status:==========: "+responseModel.getToken());

		Assert.assertEquals(response.getStatusCode(), 200, "HTTP Status code assertion failed ");

		String tokenPath = response.jsonPath().getString("token");

		String tokenModel = responseModel.getToken();
		Assert.assertEquals(tokenPath, tokenModel, "Token sync failed");

	}

	@Test(testName = "LoginTest", description = "Login With Invalid Credentials", priority = 2)
	void invalidLoginTest() {
		// Creating Login Payload
		ReqLogin loginPayload = new ReqLogin.Builder().username("shivammav").password("Learn@2000").build();
		AuthServices authService = new AuthServices();
		RespLogin responseModel = authService.login(loginPayload).as(RespLogin.class);


		Assert.assertEquals(responseModel.getStatus(), 401, "HTTP Status code assertion failed ");
		Assert.assertEquals(responseModel.getError(), "Invalid Credentials", "Invalid data received in error field");
		Assert.assertEquals(responseModel.getMessage(), "The username or password you entered is incorrect",
				"Invalid data received in message field");
		Assert.assertEquals(responseModel.getSolution(), "Please check your credentials and try again",
				"Invalid data received in solution field");
		Assert.assertEquals(responseModel.getErrorCode(), "AUTH_002", "Invalid data received in errorCode field");

	}
	
	
	
	@Test(testName = "LoginTest", description = "Login With empty/blank credentials", priority = 3)
	void blankLoginTest() {
		// Creating Login Payload
		ReqLogin loginPayload = new ReqLogin.Builder().username("").password("").build();
		AuthServices authService = new AuthServices();
		RespLogin responseModel = authService.login(loginPayload).as(RespLogin.class);


		Assert.assertEquals(responseModel.getStatus(), 401, "HTTP Status code assertion failed ");
		Assert.assertEquals(responseModel.getError(), "Invalid Credentials", "Invalid data received in error field");
		Assert.assertEquals(responseModel.getMessage(), "The username or password you entered is incorrect",
				"Invalid data received in message field");
		Assert.assertEquals(responseModel.getSolution(), "Please check your credentials and try again",
				"Invalid data received in solution field");
		Assert.assertEquals(responseModel.getErrorCode(), "AUTH_002", "Invalid data received in errorCode field");

	}
}
