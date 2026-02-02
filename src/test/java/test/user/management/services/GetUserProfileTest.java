package test.user.management.services;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.restassured.response.Response;
import models.request.auth.ReqLogin;
import models.response.profile.RespProfile;
import services.AuthServices;
import services.UserManagement;

public class GetUserProfileTest {

	protected String userToken = "";
	protected UserManagement user;

	@BeforeClass
	void setupToken() {
		ReqLogin loginPayload = new ReqLogin.Builder().username("shivammavii").password("Learn@2000").build();
		AuthServices authService = new AuthServices();
		Response response = authService.login(loginPayload);
		Assert.assertEquals(response.getStatusCode(), 200, "Login Failed");
		userToken = response.jsonPath().getString("token");
		user = new UserManagement();

	}

	@Test(testName = "GetUserProfileTest", description = "Fetch user profile with valid auth token", priority = 1)
	void getUserDetails() {

		Response response = user.fetchUserProfile(userToken);
//		System.out.println(response.asPrettyString());
		Assert.assertEquals(response.getStatusCode(), 200, "Get Profile HTTP code invalid");
		RespProfile respProfileModel = response.as(RespProfile.class);

		Assert.assertEquals(respProfileModel.getId(), 3950, "user profile id mismatch");
		Assert.assertEquals(respProfileModel.getUsername(), "shivammavii", "user profile username mismatch");
		Assert.assertEquals(respProfileModel.getEmail(), "janesjohnny75@gmail.com", "user profile email mismatch");
		Assert.assertEquals(respProfileModel.getFirstName(), "Shivam", "user profile firstName mismatch");
		Assert.assertEquals(respProfileModel.getLastName(), "Yadav", "user profile lastName mismatch");
		Assert.assertEquals(respProfileModel.getMobileNumber(), "8291108206", "user profile mobileNumber mismatch");

	}
	
	
	@Test(testName = "Invalid auth token", description = "Fetch user profile with invalid auth token", priority = 2,enabled=false)
	void invalidAUthTokenUserDetails() {

		Response response = user.fetchUserProfile(userToken);
		Assert.assertEquals(response.getStatusCode(), 401, "Get Profile HTTP code invalid");
//		RespProfile respProfileModel = response.as(RespProfile.class);


	}

}
