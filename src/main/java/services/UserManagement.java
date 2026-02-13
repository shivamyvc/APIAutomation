package services;

import io.restassured.response.Response;
import service.base.ZBankBaseService;
import utilities.Reporter.ExtentTestManager;

public class UserManagement extends ZBankBaseService {

	protected static final String BASE_PATH = "/api/users";
	protected static final String PROFILE_ENDPONIT = "/profile";

	public UserManagement() {
		super();
		baseRequestSpecification.basePath(BASE_PATH);
	}

	public Response fetchUserProfile(String authToken) {
		setToken(authToken);
		ExtentTestManager.getTest().assignCategory("Profile");
		return sendGetRequest(PROFILE_ENDPONIT);

	}
	
	public Response updateProfileData(Object payLoad,String authToken) {
		setToken(authToken);
		ExtentTestManager.getTest().assignCategory("Profile");
		return sendPatchRequest(payLoad,PROFILE_ENDPONIT);
	}
	
	
	public Response updateProfile(Object payLoad,String authToken) {
		setToken(authToken);
		ExtentTestManager.getTest().assignCategory("Profile");
		return sendPutRequest(payLoad,PROFILE_ENDPONIT);
	}

}
