package com.sims.IMOBFF.model;

public class PolicySummary {

	private String policyRef;
	private String carrierPolicyNo;
	private String carrierPolicyStatus;
	private String tenure;
	private Integer riskCount;
	private Float duePremium;
	private String productName;
	
	
	public String getPolicyRef() {
		return policyRef;
	}
	public void setPolicyRef(String policyRef) {
		this.policyRef = policyRef;
	}
	public String getCarrierPolicyNo() {
		return carrierPolicyNo;
	}
	public void setCarrierPolicyNo(String carrierPolicyNo) {
		this.carrierPolicyNo = carrierPolicyNo;
	}
	public String getCarrierPolicyStatus() {
		return carrierPolicyStatus;
	}
	public void setCarrierPolicyStatus(String carrierPolicyStatus) {
		this.carrierPolicyStatus = carrierPolicyStatus;
	}
	public String getTenure() {
		return tenure;
	}
	public void setTenure(String tenure) {
		this.tenure = tenure;
	}
	public Integer getRiskCount() {
		return riskCount;
	}
	public void setRiskCount(Integer riskCount) {
		this.riskCount = riskCount;
	}
	public Float getDuePremium() {
		return duePremium;
	}
	public void setDuePremium(Float duePremium) {
		this.duePremium = duePremium;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	 @Override
	    public String toString() {
	        return String.format("PolicySummary {policyRef='%s', carrierPolicyNo='%s', carrierPolicyStatus='%s', " +
	                "tenure='%s', riskCount=%d, duePremium=%.2f, productName='%s'}",
	                policyRef, carrierPolicyNo, carrierPolicyStatus, tenure, riskCount, duePremium, productName);
	    }
		
	
	
	
}
