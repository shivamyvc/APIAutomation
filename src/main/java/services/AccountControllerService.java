package services;

import io.restassured.response.Response;
import service.base.ZBankBaseService;

public class AccountControllerService extends ZBankBaseService{
	
	protected static final String BASE_PATH="/api";
	
	protected static final String ACCOUNTS_ENDPOINT="/accounts";
	
	public AccountControllerService() {
		baseRequestSpecification.basePath(BASE_PATH);
	}
	
	public Response create(Object payload) {
		return sendPostRequest(payload, ACCOUNTS_ENDPOINT);
	}

}
