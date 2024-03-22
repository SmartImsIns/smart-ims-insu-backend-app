package com.sims.IMOBFF.model.policy;

public class PolicyHeader {
	private String carrierPolicyNumber;
	private String tenure;
	private String policyHolder;
	private String carrierPolicyStatus;
	private String productName;
	private Integer riskCount;
	private String lineCode;
	private String effectiveDate;
	private String expiryDate;
	
	public String getCarrierPolicyNumber() {
		return carrierPolicyNumber;
	}
	public void setCarrierPolicyNumber(String carrierPolicyNumber) {
		this.carrierPolicyNumber = carrierPolicyNumber;
	}
	public String getTenure() {
		return tenure;
	}
	public void setTenure(String tenure) {
		this.tenure = tenure;
	}
	public String getPolicyHolder() {
		return policyHolder;
	}
	public void setPolicyHolder(String policyHolder) {
		this.policyHolder = policyHolder;
	}
	public String getCarrierPolicyStatus() {
		return carrierPolicyStatus;
	}
	public void setCarrierPolicyStatus(String carrierPolicyStatus) {
		this.carrierPolicyStatus = carrierPolicyStatus;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public Integer getRiskCount() {
		return riskCount;
	}
	public void setRiskCount(Integer riskCount) {
		this.riskCount = riskCount;
	}
	public String getLineCode() {
		return lineCode;
	}
	public void setLineCode(String lineCode) {
		this.lineCode = lineCode;
	}
	public String getEffectiveDate() {
		return effectiveDate;
	}
	public void setEffectiveDate(String effectiveDate) {
		this.effectiveDate = effectiveDate;
	}
	public String getExpiryDate() {
		return expiryDate;
	}
	public void setExpiryDate(String expiryDate) {
		this.expiryDate = expiryDate;
	}
	
	
	

}
