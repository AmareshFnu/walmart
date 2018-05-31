package com.walmart.test;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.walmart.base.APIEndPointsEnum;
import com.walmart.client.JerseyClient;
import com.walmart.constants.DataColumn;
import com.walmart.testdata.TestData;
import com.walmart.validation.ResponseValidator;

public class SearchProduct {

	@Test
	public void testSearchProduct() {

		String responseString = JerseyClient.clientRequest(APIEndPointsEnum.ProductSearchAPI.toString());
		ResponseValidator.validateProductSearchResponse(responseString);

	}

	@AfterMethod
	public void writeResult(ITestResult result) {

		TestData testdata = new TestData("96325746823", "4356", "56001");
		result.setAttribute(DataColumn.carrierName.toString(), "Indicom");
		result.setAttribute(DataColumn.testdata.toString(), testdata);
		result.setAttribute(DataColumn.Executionenv.toString(), "Env-3");
		result.setAttribute(DataColumn.sessionId.toString(), "SID-2017545558747");
		result.setAttribute(DataColumn.orderNumber.toString(), "OID-7814");
		result.setAttribute(DataColumn.orderStatus.toString(), "Success/ActivationPending");
	}

}
