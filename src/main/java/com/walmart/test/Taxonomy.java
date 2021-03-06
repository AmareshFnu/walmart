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

public class Taxonomy extends WalmartBaseTest {

	@Test
	public void testTaxonomy() {

		responseString = JerseyClient.clientRequest(APIEndPointsEnum.TaxonomyAPI.toString());

		ResponseValidator.validateTaxonomyResponse(responseString);

	}

	@AfterMethod
	public void writeResult(ITestResult result) {

		TestData testdata = new TestData("6084532762", "4356", "98501");

		// Map<String, Object> computedItems = new HashMap<>();
		// computedItems.put("credentials", "XYZ");
		// ITestResult testResult = Reporter.getCurrentTestResult();

		//
		// testResult.setAttribute("TestData", computedItems);
		// testResult.setAttribute("ExecutionEnv", "UT");

		result.setAttribute(DataColumn.carrierName.toString(), "Airtel");
		result.setAttribute(DataColumn.testdata.toString(), testdata);
		result.setAttribute(DataColumn.Executionenv.toString(), "Env-1");
		result.setAttribute(DataColumn.sessionId.toString(), "SID-2017545558745");
		result.setAttribute(DataColumn.orderNumber.toString(), "OID-7812");
		result.setAttribute(DataColumn.orderStatus.toString(), "Completed/None");
	}

}
