package test.user.management.services;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import base.test.BaseTest;
import io.restassured.response.Response;
import models.profile.ReqUserProfile;
import models.request.auth.ReqLogin;
import models.response.profile.RespProfile;
import services.AuthServices;
import services.UserManagement;


public class UpdateUserProfileTest  extends BaseTest{

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

	@Test(testName = "User Profile Update Test", description = "Updating user with valid data inputs fields", priority = 1, enabled = true)
	void userProfileUpdateTest() {

		ReqUserProfile userModel = new ReqUserProfile.Builder().lastName("Yadav1").address("address1").build();

		Response resp = user.updateProfileData(userModel, userToken);
//		resp.prettyPrint();
		RespProfile updatedProfile = resp.as(RespProfile.class);

		Assert.assertEquals(resp.getStatusCode(), 200, "Update Failed");

		Assert.assertEquals(updatedProfile.getLastName(), "Yadav1", "LastName Update Failed");

	}

	@Test(testName = "User Profile Update With inavlid values ", description = "Updating user with invalid data inputs fields", priority = 2, enabled = true)
	void userProfileInvalidUpdateTest() {

		ReqUserProfile userModel = new ReqUserProfile.Builder().lastName("*&*&*").address("address1")
				.mobileNumber("++__))((").build();

		Response resp = user.updateProfileData(userModel, userToken);
//		resp.prettyPrint();
		RespProfile updatedProfile = resp.as(RespProfile.class);

		Assert.assertEquals(resp.getStatusCode(), 500, "Update success");

		Assert.assertEquals(updatedProfile.getLastName(), "Yadav1",
				"LastName Update Success Special character is not allowed");

		Assert.assertFalse(updatedProfile.getMobileNumber().contains("+"),
				"Mobile Number Update Success Special character is not allowed");
	}

	@Test(testName = "User Profile Replace With avlid values ", description = "Put Request with valid data", priority = 3)
	void userProfileReplaceTest() {

		ReqUserProfile userModel = new ReqUserProfile.Builder().firstName("Shivam").lastName("Mavii")
				.email("janesjohnny75@gmail.com").mobileNumber("0099887766").build();

		Response resp = user.updateProfile(userModel, userToken);
//		resp.prettyPrint();
		RespProfile updatedProfile = resp.as(RespProfile.class);

		Assert.assertEquals(resp.getStatusCode(), 200, "Profile Replace Failed");
		Assert.assertEquals(updatedProfile.getLastName(), "Mavii");

	}

	@Test(testName = "User Profile Replace With avlid values ", description = "Put Request with valid data", priority = 4)
	void userProfileInvalidReplaceTest() {

		ReqUserProfile userModel = new ReqUserProfile.Builder().firstName("Shivam").lastName("Mavii")
				.email("janesjohnny75@gmail.com").build();

		Response resp = user.updateProfile(userModel, userToken);
//		resp.prettyPrint();
		RespProfile updatedProfile = resp.as(RespProfile.class);

		Assert.assertEquals(resp.getStatusCode(), 500, "Profile Replace Put Rquest Failed");

		Assert.assertEquals(updatedProfile.getSolution(), "Please try again later or contact support");

	}

}
