package test.transaction.services;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import base.test.BaseTest;
import io.restassured.response.Response;
import models.request.transaction.ReqDeposite;
import services.TransactionService;

public class DepositeTest extends BaseTest{

	@Test(description = "Verfiy deposit of amount successful")
	public void depositeTransfer() {
		
		ReqDeposite transactionDetails= new ReqDeposite.Builder().accountNumber("0401766304").amount(109).description("SelfTransfer").build();
		TransactionService trxn= new TransactionService();
		trxn.setToken(userToken);
		Response resp=trxn.dposite(transactionDetails);
		assertEquals(resp.getStatusCode(), 200,"Deposite failed response status code ");
		
	}
}
