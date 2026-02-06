package services;

import io.restassured.response.Response;
import service.base.ZBankBaseService;

public class TransactionService extends ZBankBaseService {
	protected static final String BASE_PATH = "/api/transactions";
	protected static final String DEPOSITE_ENDPONT = "/deposit";

	public TransactionService() {
		baseRequestSpecification.basePath(BASE_PATH);
	}

	public Response dposite(Object payload) {

		return sendPostRequest(payload, DEPOSITE_ENDPONT);
	}

}
