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

public class TrendingItems extends WalmartBaseTest {

	@Test
	public void testTrendingItems() {
		responseString = JerseyClient.clientRequest(APIEndPointsEnum.TrendingItemsAPI.toString());
		ResponseValidator.validateTrendingItemsResponse(responseString);
	}

	@AfterMethod
	public void writeResult(ITestResult result) {

		TestData testdata = new TestData("963257468745", "4356", "56001");
		result.setAttribute(DataColumn.carrierName.toString(), "BSNL");
		result.setAttribute(DataColumn.testdata.toString(), testdata);
		result.setAttribute(DataColumn.Executionenv.toString(), "Env-6");
		result.setAttribute(DataColumn.sessionId.toString(), "S-7845511238743");
		result.setAttribute(DataColumn.orderNumber.toString(), "O-254283");
		result.setAttribute(DataColumn.orderStatus.toString(), "Success");
	}
}
