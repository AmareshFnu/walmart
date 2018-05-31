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

public class ValueOfTheDay extends WalmartBaseTest {

	@Test(enabled = true)
	public void testValueOfTheDay() {

		responseString = JerseyClient.clientRequest(APIEndPointsEnum.VODAPI.toString());

		ResponseValidator.validateVODResponse(responseString);

	}

	@AfterMethod
	public void writeResult(ITestResult result) {

		TestData testdata = new TestData("963257468745", "4356", "56001");
		result.setAttribute(DataColumn.carrierName.toString(), "Idea");
		result.setAttribute(DataColumn.testdata.toString(), testdata);
		result.setAttribute(DataColumn.Executionenv.toString(), "Env-5");
		result.setAttribute(DataColumn.sessionId.toString(), "SID-2017545558747");
		result.setAttribute(DataColumn.orderNumber.toString(), "OID-7814");
		result.setAttribute(DataColumn.orderStatus.toString(), "Pending/halted");
	}

}
