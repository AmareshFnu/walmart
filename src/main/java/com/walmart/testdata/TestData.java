package com.walmart.testdata;

public class TestData {

	private String ctn;
	private String ssn;
	private String zipcode;

	public TestData(String ctn, String ssn, String zipcode) {
		super();
		this.ctn = ctn;
		this.ssn = ssn;
		this.zipcode = zipcode;
	}

	public String getCtn() {
		return ctn;
	}

	public void setCtn(String ctn) {
		this.ctn = ctn;
	}

	public String getSsn() {
		return ssn;
	}

	public void setSsn(String ssn) {
		this.ssn = ssn;
	}

	public String getZipcode() {
		return zipcode;
	}

	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}

	@Override
	public String toString() {
		return "[ctn=" + ctn + ", ssn=" + ssn + ", zipcode=" + zipcode + "]";
	}

}
