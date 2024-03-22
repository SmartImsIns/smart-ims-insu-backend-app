package com.sims.IMOBFF.customer.service;

import com.sims.IMOBFF.model.common.ResponseDTO;
import com.sims.IMOBFF.model.policy.DashboardPolicyDetails;
import com.sims.IMOBFF.model.user.Credentials;
import com.sims.IMOBFF.model.user.UserInfo;

import reactor.core.publisher.Mono;

public interface LoginService {

	ResponseDTO<UserInfo> getUserInfo(Credentials credentials);
	ResponseDTO<DashboardPolicyDetails> getDashboardDetails(Credentials credentials);
}
