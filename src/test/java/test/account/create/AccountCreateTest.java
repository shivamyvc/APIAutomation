package test.account.create;

import org.testng.annotations.Test;

import base.test.BaseTest;
import io.restassured.response.Response;
import models.request.account.controller.ReqAccounts;
import services.AccountControllerService;

public class AccountCreateTest extends BaseTest {
	
	@Test
	public void createSavingAccount() {
	ReqAccounts accountDetails= new ReqAccounts.Builder().accountType("SAVINGS").branch("MAIN_BRANCH").build();
	AccountControllerService account= new AccountControllerService();
	account.setToken(getToken());
	Response resp=account.create(accountDetails);
	}
}
