package com.sims.IMOBFF.model.policy;

public class PolicyRef {

	private String policyRef;

	public String getPolicyRef() {
		return policyRef;
	}

	public void setPolicyRef(String policyRef) {
		this.policyRef = policyRef;
	}

	@Override
	public String toString() {
		return String.format("PolicyRef [policyRef=%s]", policyRef);
	}
	
	
}
