package services;

import io.restassured.response.Response;
import service.base.ZBankBaseService;

public class AuthServices extends ZBankBaseService {
	protected static final String BASE_PATH = "/api/auth";
	protected static final String LOGIN_ENDPOINT = "/login";

	public AuthServices() {
		baseRequestSpecification.basePath(BASE_PATH);
	}

	public Response login(Object payloadBody) {
		return sendPostRequest(payloadBody, LOGIN_ENDPOINT);
	}

}
