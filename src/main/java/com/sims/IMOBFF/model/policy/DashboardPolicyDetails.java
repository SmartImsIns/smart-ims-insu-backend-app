package com.sims.IMOBFF.model.policy;

import java.util.List;

public class DashboardPolicyDetails {
	
	private String policyCount;
	//private List<UserInfo> policyCustomerList;
	private List<PolicySummary> policyList;
	
	public String getPolicyCount() {
		return policyCount;
	}
	public void setPolicyCount(String policyCount) {
		this.policyCount = policyCount;
	}

	/*
	 * public List<UserInfo> getPolicyCustomerList() { return policyCustomerList; }
	 * public void setPolicyCustomerList(List<UserInfo> policyCustomerList) {
	 * this.policyCustomerList = policyCustomerList; }
	 */
	public List<PolicySummary> getPolicyList() {
		return policyList;
	}
	public void setPolicyList(List<PolicySummary> policyList) {
		this.policyList = policyList;
	}
	/*
	 * @Override public String toString() { return String.
	 * format("DashboardDetails {policyCount='%s', policyCustomerList=%s, policyList=%s}"
	 * , policyCount, policyCustomerList, policyList); }
	 */

	@Override
    public String toString() {
        return String.format("DashboardDetails {policyCount='%s', policyList=%s}",
                policyCount, policyList);
    }
	
}
