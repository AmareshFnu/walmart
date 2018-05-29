package com.walmart.test;

import org.testng.annotations.Test;

import com.walmart.base.APIEndPointsEnum;
import com.walmart.base.WalmartBaseTest;
import com.walmart.client.JerseyClient;
import com.walmart.validation.ResponseValidator;

public class CustomerReviews extends WalmartBaseTest {

	@Test(enabled = false)
	public void testCustomerReviews() {
		responseString = JerseyClient.clientRequest(APIEndPointsEnum.CustomerReviewAPI.toString());

		ResponseValidator.validateCustomerReviewsResponse(responseString);
	}
}
