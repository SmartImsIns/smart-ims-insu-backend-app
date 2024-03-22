package com.sims.IMOBFF.model.user;

public class Credentials {
	
	private String customerName;
	private String mobile;
	//private String role;
	
	
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	@Override
	public String toString() {
		return "Credentials [customerName=" + customerName + ", mobile=" + mobile + "]";
	}

	
//	public String getCustomerName() {
//		return CustomerName;
//	}
//	public void setCustomerName(String customerName) {
//		CustomerName = customerName;
//	}
//	public String getMobile() {
//		return Mobile;
//	}
//	public void setMobile(String mobile) {
//		Mobile = mobile;
//	}
//	
	
	
	
	
	
	
	
//	public String getRole() {
//		return role;
//	}
//	public void setRole(String role) {
//		this.role = role;
//	}
	
	

}
