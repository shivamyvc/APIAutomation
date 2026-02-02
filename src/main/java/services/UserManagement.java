package services;

import io.restassured.response.Response;
import service.base.ZBankBaseService;

public class UserManagement extends ZBankBaseService {

	protected static final String BASE_PATH = "/api/users";
	protected static final String PROFILE_ENDPONIT = "/profile";

	public UserManagement() {
		super();
		baseRequestSpecification.basePath(BASE_PATH).log().all();
	}

	public Response fetchUserProfile(String authToken) {
		setToken(authToken);
		return sendGetRequest(PROFILE_ENDPONIT);

	}
	
	public Response updateProfileData(Object payLoad,String authToken) {
		setToken(authToken);
		return sendPatchRequest(payLoad,PROFILE_ENDPONIT);
	}
	
	
	public Response updateProfile(Object payLoad,String authToken) {
		setToken(authToken);
		return sendPutRequest(payLoad,PROFILE_ENDPONIT);
	}

}
