package com.walmart.test;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.walmart.base.APIEndPointsEnum;
import com.walmart.client.JerseyClient;
import com.walmart.constants.DataColumn;
import com.walmart.testdata.TestData;
import com.walmart.validation.ResponseValidator;

public class StoreLocator {

	@Test
	public void testStoreLocator() {

		String url = APIEndPointsEnum.StoreLocatorAPI.toString();

		String stringResponse = JerseyClient.clientRequest(url);
		ResponseValidator.validateStoreLocatorResponse(stringResponse);

	}

	@AfterMethod
	public void writeResult(ITestResult result) {
		TestData testdata = new TestData("96325746823", "4356", "56001");
		result.setAttribute(DataColumn.carrierName.toString(), "Indicom");
		result.setAttribute(DataColumn.testdata.toString(), testdata);
		result.setAttribute(DataColumn.Executionenv.toString(), "Env-4");
		result.setAttribute(DataColumn.sessionId.toString(), "S-7845511238743");
		result.setAttribute(DataColumn.orderNumber.toString(), "O-254283");
		result.setAttribute(DataColumn.orderStatus.toString(), "Success/Activated");
	}
}
