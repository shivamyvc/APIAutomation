package service.base;

import io.restassured.filter.Filter;
import io.restassured.filter.FilterContext;
import io.restassured.response.Response;
import io.restassured.specification.FilterableRequestSpecification;
import io.restassured.specification.FilterableResponseSpecification;
import utilities.Reporter.APILogContext;
import utilities.Reporter.ReportLogger;

public class LoggingFilter implements Filter {

	@Override
	public Response filter(FilterableRequestSpecification requestSpec, FilterableResponseSpecification responseSpec,
			FilterContext ctx) {
		// TODO Auto-generated method stub
		APILogContext.setRequest(requestSpec);
		Response response= ctx.next(requestSpec, responseSpec);
		APILogContext.setRespons(response);
		return response;
	}

	

}
