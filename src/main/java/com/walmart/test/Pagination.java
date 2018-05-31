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

public class Pagination extends WalmartBaseTest {

	@Test
	public void testPagination() {
		responseString = JerseyClient.clientRequest(APIEndPointsEnum.PaginationAPI.toString());
		ResponseValidator.validatePaginationResponse(responseString);

	}

	@AfterMethod
	public void writeResult(ITestResult result) {

		TestData testdata = new TestData("4089130609", "7245", "95051");

		// Map<String, Object> computedItems = new HashMap<>();
		// computedItems.put("credentials", "XYZ");
		// ITestResult testResult = Reporter.getCurrentTestResult();

		//
		// testResult.setAttribute("TestData", computedItems);
		// testResult.setAttribute("ExecutionEnv", "UT");

		result.setAttribute(DataColumn.carrierName.toString(), "Sprint");
		result.setAttribute(DataColumn.testdata.toString(), testdata);
		result.setAttribute(DataColumn.Executionenv.toString(), "UT");
		result.setAttribute(DataColumn.sessionId.toString(), "20183005R0018542");
		result.setAttribute(DataColumn.orderNumber.toString(), "B185420022");
		result.setAttribute(DataColumn.orderStatus.toString(), "Completed/None");

		// System.out.println(result.getAttribute("TestData"));

	}
}