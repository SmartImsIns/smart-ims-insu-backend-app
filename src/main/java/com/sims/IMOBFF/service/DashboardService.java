package com.sims.IMOBFF.service;

import com.sims.IMOBFF.model.DashboardPolicyDetails;
import com.sims.IMOBFF.model.PolicyInput;

import reactor.core.publisher.Mono;

public interface DashboardService {


	Mono<DashboardPolicyDetails> getPolicySummary(PolicyInput policyInput);
	
}
