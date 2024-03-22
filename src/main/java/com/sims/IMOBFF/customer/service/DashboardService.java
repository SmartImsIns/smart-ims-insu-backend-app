package com.sims.IMOBFF.customer.service;

import com.sims.IMOBFF.model.common.ResponseDTO;
import com.sims.IMOBFF.model.policy.DashboardPolicyDetails;
import com.sims.IMOBFF.model.policy.PolicyInput;

import reactor.core.publisher.Mono;

public interface DashboardService {


	ResponseDTO<DashboardPolicyDetails> getPolicySummary(PolicyInput policyInput);
	
}
