package com.sims.IMOBFF.model;

public class UserInfo {

	private String customerId;
	private String customerName;
	
	public String getCustomerId() {
		return customerId;
	}
	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	@Override
    public String toString() {
        return String.format("CustomerInfo {customerId='%s', customerName='%s'}", customerId, customerName);
    }

	
}