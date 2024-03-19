package com.sims.IMOBFF.service;

import com.sims.IMOBFF.model.DashboardPolicyDetails;
import com.sims.IMOBFF.model.PolicyInput;
import com.sims.IMOBFF.model.ResponseDTO;

import reactor.core.publisher.Mono;

public interface DashboardService {


	ResponseDTO<DashboardPolicyDetails> getPolicySummary(PolicyInput policyInput);
	
}
