package com;

public class pojo {
	
	String keyvalue;
	String cost;
	String expirydate;
	String issuedate;
	String currentdate;
	String specialist;
	
	public pojo(String keyvalue,String cost,String expirydate,String issuedate,String currentdate,String specialist)

	{
		this.keyvalue=keyvalue;
		this.cost=cost;
		this.expirydate=expirydate;
		this.issuedate=issuedate;
		this.currentdate=currentdate;
		this.specialist=specialist;
	}

	public String getKeyvalue() {
		return keyvalue;
	}

	public void setKeyvalue(String keyvalue) {
		this.keyvalue = keyvalue;
	}

	public String getCost() {
		return cost;
	}

	public void setCost(String cost) {
		this.cost = cost;
	}

	public String getExpirydate() {
		return expirydate;
	}

	public void setExpirydate(String expirydate) {
		this.expirydate = expirydate;
	}

	public String getIssuedate() {
		return issuedate;
	}

	public void setIssuedate(String issuedate) {
		this.issuedate = issuedate;
	}

	public String getCurrentdate() {
		return currentdate;
	}

	public void setCurrentdate(String currentdate) {
		this.currentdate = currentdate;
	}

	public String getSpecialist() {
		return specialist;
	}

	public void setSpecialist(String specialist) {
		this.specialist = specialist;
	}
	
	
}
