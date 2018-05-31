package com.walmart.test;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.walmart.base.APIEndPointsEnum;
import com.walmart.client.JerseyClient;
import com.walmart.constants.DataColumn;
import com.walmart.testdata.TestData;
import com.walmart.validation.ResponseValidator;

public class SearchItems {

	@Test
	public void testSearchItems() {

		String responseString = JerseyClient.clientRequest(APIEndPointsEnum.ItemsSearchAPI.toString());

		ResponseValidator.validateSearchItemResponse(responseString);
	}

	@AfterMethod
	public void writeResult(ITestResult result) {

		// Map<String, Object> computedItems = new HashMap<>();
		// computedItems.put("credentials", "XYZ");
		// ITestResult testResult = Reporter.getCurrentTestResult();

		//
		// testResult.setAttribute("TestData", computedItems);
		// testResult.setAttribute("ExecutionEnv", "UT");

		TestData testdata = new TestData("96325746823", "4356", "56001");
		result.setAttribute(DataColumn.carrierName.toString(), "Jio");
		result.setAttribute(DataColumn.testdata.toString(), testdata);
		result.setAttribute(DataColumn.Executionenv.toString(), "Env-2");
		result.setAttribute(DataColumn.sessionId.toString(), "S-784551123724236");
		result.setAttribute(DataColumn.orderNumber.toString(), "O-25421369875");
		result.setAttribute(DataColumn.orderStatus.toString(), "Success/Activated");
	}
}