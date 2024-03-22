package com.sims.IMOBFF.model.policy;

public class PolicySummary {

	private String policyRef;
	private String lineCode;
	private String carrierCode;
	private String carrierPolicyNo;
	private String carrierPolicyStatus;
	private String carrierQuoteNumber;
	private String tenure;
	private Integer riskCount;
	private String writtenPremium;
	private String writtenFeeAmt;
	private String productName;
	private String effectiveDate;
	private String expiryDate;
	
	public String getPolicyRef() {
		return policyRef;
	}
	public void setPolicyRef(String policyRef) {
		this.policyRef = policyRef;
	}
	public String getLineCode() {
		return lineCode;
	}
	public void setLineCode(String lineCode) {
		this.lineCode = lineCode;
	}
	public String getCarrierCode() {
		return carrierCode;
	}
	public void setCarrierCode(String carrierCode) {
		this.carrierCode = carrierCode;
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
	public String getCarrierQuoteNumber() {
		return carrierQuoteNumber;
	}
	public void setCarrierQuoteNumber(String carrierQuoteNumber) {
		this.carrierQuoteNumber = carrierQuoteNumber;
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
	public String getWrittenPremium() {
		return writtenPremium;
	}
	public void setWrittenPremium(String writtenPremium) {
		this.writtenPremium = writtenPremium;
	}
	public String getWrittenFeeAmt() {
		return writtenFeeAmt;
	}
	public void setWrittenFeeAmt(String writtenFeeAmt) {
		this.writtenFeeAmt = writtenFeeAmt;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
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
	@Override
	public String toString() {
		return String.format(
				"PolicySummary [policyRef=%s, lineCode=%s, carrierCode=%s, carrierPolicyNo=%s, carrierPolicyStatus=%s, carrierQuoteNumber=%s, tenure=%s, riskCount=%s, writtenPremium=%s, writtenFeeAmt=%s, productName=%s, effectiveDate=%s, expiryDate=%s]",
				policyRef, lineCode, carrierCode, carrierPolicyNo, carrierPolicyStatus, carrierQuoteNumber, tenure,
				riskCount, writtenPremium, writtenFeeAmt, productName, effectiveDate, expiryDate);
	}
	
	

	
}
