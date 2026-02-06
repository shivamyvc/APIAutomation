package service.base;

import io.restassured.specification.RequestSpecification;
import static io.restassured.RestAssured.*;

import java.net.URI;

import org.testng.annotations.Listeners;

import io.restassured.RestAssured;
import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class ZBankBaseService {

	protected final static String BASE_URL = "https://swift.techwithjatin.com/";

	protected static RequestSpecification baseRequestSpecification;
	
	static{
		RestAssured.filters(new LoggingFilter());
	}

	public ZBankBaseService() {
		baseRequestSpecification = given().urlEncodingEnabled(false).baseUri(BASE_URL);
	}
	
	public void setToken(String tokenString) {
		baseRequestSpecification.header("Authorization","Bearer "+tokenString);
	}

	protected Response sendPostRequest(Object payLoad, String endponit) {
		return baseRequestSpecification.header("Content-Type", "application/json").body(payLoad).post(endponit);
	}
	
	protected Response sendPatchRequest(Object payLoad, String endponit) {
		return baseRequestSpecification.header("Content-Type", "application/json").body(payLoad).patch(endponit);
	}
	
	protected Response sendPutRequest(Object payLoad, String endponit) {
		return baseRequestSpecification.header("Content-Type", "application/json").body(payLoad).put(endponit);
	}
	
	protected Response sendGetRequest(String endponit) {
		return baseRequestSpecification.get(endponit);
	}

}
