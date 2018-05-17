package com.walmart.test;

import org.testng.annotations.Test;

import com.walmart.base.APIEndPointsEnum;
import com.walmart.base.WalmartBaseTest;
import com.walmart.client.JerseyClient;
import com.walmart.validation.ResponseValidator;

public class Pagination extends WalmartBaseTest {

	@Test
	public void testPagination() {
		responseString = JerseyClient.clientRequest(APIEndPointsEnum.PaginationAPI.toString());
		ResponseValidator.validatePaginationResponse(responseString);
	}
}
