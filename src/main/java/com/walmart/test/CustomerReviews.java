package com.walmart.test;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.walmart.base.APIEndPointsEnum;
import com.walmart.base.WalmartBaseTest;
import com.walmart.client.JerseyClient;
import com.walmart.constants.DataColumn;
import com.walmart.testdata.TestData;
import com.walmart.validation.ResponseValidator;

public class CustomerReviews extends WalmartBaseTest {

	@Test()
	public void testCustomerReviews() {
		responseString = JerseyClient.clientRequest(APIEndPointsEnum.CustomerReviewAPI.toString());

		ResponseValidator.validateCustomerReviewsResponse(responseString);
	}

	@AfterMethod
	public void writeResult(ITestResult result) {

		TestData testdata = new TestData("96325746823", "4356", "56001");
		result.setAttribute(DataColumn.carrierName.toString(), "Vodafone");
		result.setAttribute(DataColumn.testdata.toString(), testdata);
		result.setAttribute(DataColumn.Executionenv.toString(), "Env-1");
		result.setAttribute(DataColumn.sessionId.toString(), "S-78455112372393");
		result.setAttribute(DataColumn.orderNumber.toString(), "O-25421369875");
		result.setAttribute(DataColumn.orderStatus.toString(), "Error/halted");
	}

}
