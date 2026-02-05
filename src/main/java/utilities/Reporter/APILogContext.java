package utilities.Reporter;

import io.restassured.response.Response;
import io.restassured.specification.FilterableRequestSpecification;

public class APILogContext {
	
	private static ThreadLocal<FilterableRequestSpecification> requestSpec = new ThreadLocal<FilterableRequestSpecification>();
	private static ThreadLocal<Response>  response= new ThreadLocal<Response>();
	
	public static void setRequest(FilterableRequestSpecification request) {
		requestSpec.set(request);
	}
		
	public static FilterableRequestSpecification getRequest() {
			return requestSpec.get();
	}

	public static void setRespons(Response resp) {
		response.set(resp);
	}
		
	public static Response getResponse() {
		return response.get();
	}
	
	public static void clear() {
		requestSpec.remove();
		response.remove();
	}
	
	
	
	

}
