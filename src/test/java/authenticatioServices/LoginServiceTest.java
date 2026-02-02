package authenticatioServices;

import org.testng.annotations.Test;

import auth.models.LoginRequestModel;
import auth.models.LoginResponseModel;
import io.restassured.response.Response;
import service.base.ZBankBaseService;

public class LoginServiceTest extends ZBankBaseService {

	public static String LOGIN_ENDPOINT = "/login";
	public static String BASE_PATH = "/auth";

	public LoginServiceTest() {
		baseRequestSpecification.basePath(BASE_PATH);
	}

	@Test(testName="Login with valid credential",description = "Testing login with correct user credentials should display succes resposne")
	void loginWithCorrectUser() {
		LoginRequestModel loginBody= new LoginRequestModel("shivammavii","Learn@2000");
		LoginResponseModel loginResposne=sendPostRequest(loginBody, LOGIN_ENDPOINT).as(LoginResponseModel.class);
		System.out.println("This is the token: "+loginResposne.getToken());
		
		
		
	}

}
