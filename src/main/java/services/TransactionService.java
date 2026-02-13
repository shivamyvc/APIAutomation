package services;

import io.restassured.response.Response;
import service.base.ZBankBaseService;
import utilities.Reporter.ExtentTestManager;

public class TransactionService extends ZBankBaseService {
	protected static final String BASE_PATH = "/api/transactions";
	protected static final String DEPOSITE_ENDPONT = "/deposit";
	protected static final String HISTORY_ENDPOINT = "/history";

	public TransactionService() {
		baseRequestSpecification.basePath(BASE_PATH);
	}

	public Response dposite(Object payload) {
		ExtentTestManager.getTest().assignCategory("Deposite");
		return sendPostRequest(payload, DEPOSITE_ENDPONT);
	}

	public Response history(String accountNumber) {
		ExtentTestManager.getTest().assignCategory("History");
		baseRequestSpecification.queryParam("accountNumber",accountNumber);
		return sendGetRequest(HISTORY_ENDPOINT);
	}

	public Response history(String accountNumber, String page) {
		ExtentTestManager.getTest().assignCategory("History");
		baseRequestSpecification.queryParam("accountNumber",accountNumber);
		baseRequestSpecification.queryParam("page", page);

		return sendGetRequest(HISTORY_ENDPOINT);
	}

	public Response history(String accountNumber, String page, String size) {
		ExtentTestManager.getTest().assignCategory("History");
		baseRequestSpecification.queryParam("accountNumber",accountNumber);
		baseRequestSpecification.queryParam("page", page);
		baseRequestSpecification.queryParam("size", size);
		return sendGetRequest(HISTORY_ENDPOINT);
	}
	
	
	public Response historyOf(String accountNumber, String size) {
		baseRequestSpecification.queryParam("accountNumber",accountNumber);
		baseRequestSpecification.queryParam("size", size);
		return sendGetRequest(HISTORY_ENDPOINT);
	}

}
