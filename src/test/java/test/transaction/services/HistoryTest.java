package test.transaction.services;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.test.BaseTest;
import io.restassured.response.Response;
import services.TransactionService;

public class HistoryTest extends BaseTest {
	
	@Test(description="To Verify History API account statement is fetched when valid account number is given")
	public void testAccountStatement() {
		TransactionService trxn =new TransactionService();
		trxn.setToken(userToken);
		Response resp=trxn.history("0401766304");
		Assert.assertEquals(resp.getStatusCode(), 200,"Account statement failed status code received ");
		
		
	}
	
	
	@Test(description="To Verify History API defualt record size per page is 10.")
	public void testDefaultRecordSize() {
		TransactionService trxn =new TransactionService();
		trxn.setToken(userToken);
		Response resp=trxn.history("0401766304");
		Assert.assertEquals(resp.getStatusCode(), 200,"Account statement failed status code received ");
		Assert.assertEquals(resp.jsonPath().getList("content").size(), 10, "Record size per page failed ");
		
	}
	
	
	@Test(description="To Verify History API custom record size per page is 3.")
	public void testCustomPerPageRecordSize() {
		TransactionService trxn =new TransactionService();
		trxn.setToken(userToken);
		Response resp=trxn.history("0401766304","2","4");
		Assert.assertEquals(resp.getStatusCode(), 200,"Account statement failed status code received ");
		Assert.assertEquals(resp.jsonPath().getList("content").size(), 4, "Record size per page failed ");
	}
	
	
	@Test(description="To Verify History API custom record size is 13.")
	public void testCustomRecordSize() {
		TransactionService trxn =new TransactionService();
		trxn.setToken(userToken);
		Response resp=trxn.historyOf("0401766304","20");
		Assert.assertEquals(resp.getStatusCode(), 200,"Account statement failed status code received ");
		Assert.assertEquals(resp.jsonPath().getList("content").size(), 120, "Record size per page failed ");
		
	}

}
