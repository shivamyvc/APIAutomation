package test.account.create;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.test.BaseTest;
import io.restassured.response.Response;
import models.request.account.controller.ReqAccounts;
import services.AccountControllerService;

public class AccountsTest extends BaseTest {
	

	
	@Test(testName="Create Saving Account", description="Success response",groups= {"Smoke","Sanity","Regression"},enabled=false)
	public void createSavingAccount() {
	ReqAccounts accountDetails= new ReqAccounts.Builder().accountType("SAVINGS").branch("MAIN_BRANCH").build();
	AccountControllerService account= new AccountControllerService();
	account.setToken(getToken());
	Response resp=account.create(accountDetails);
//	resp.prettyPrint();
	}
	
	@Test(testName="Create Account With Inavlid Account Type ", description="Create Account With Inavlid Account Type",groups= {"Sanity","Regression"})
	public void createAccWithInvalidAccType() {
	ReqAccounts accountDetails= new ReqAccounts.Builder().accountType("ABCEDF").branch("MAIN_BRANCH").build();
	AccountControllerService account= new AccountControllerService();
	account.setToken(getToken());
	Response resp=account.create(accountDetails);
	
	Assert.assertNotEquals(resp.getStatusCode(), 200,"Account Created and response status received ");
//	resp.prettyPrint();
	}
	
	@Test(testName="Create Account With Inavlid Branch ", description="Create Account With Inavlid Branch Name",groups= {"Sanity","Regression"})
	public void createAccWithInvalidBranch() {
	ReqAccounts accountDetails= new ReqAccounts.Builder().accountType("ABCEDF").branch("XYZZ").build();
	AccountControllerService account= new AccountControllerService();
	account.setToken(getToken());
	Response resp=account.create(accountDetails);
	Assert.assertNotEquals(resp.getStatusCode(), 200,"Account Created and response status received ");
	}
	
	
	@Test(testName="Fetch Valid Account detail", description="Fetch Valid Account details",groups= {"Sanity","Regression"})
	public void getValidAccDetailsTest() {
	AccountControllerService account= new AccountControllerService();
	account.setToken(getToken());
	Response resp=account.getAccountDetails("0482938154");
	Assert.assertEquals(resp.getStatusCode(), 200,"error while getting account details status");
	}
	
	
	@Test(testName="Fetch All Account details", description="Fetch All Account details",groups= {"Sanity","Regression"})
	public void getAllAccDetailsTest() {
	AccountControllerService account= new AccountControllerService();
	account.setToken(getToken());
	Response resp=account.getAllAccounts();
	Assert.assertEquals(resp.getStatusCode(), 200,"error while getting account details status");
	}
	
	
	
}
