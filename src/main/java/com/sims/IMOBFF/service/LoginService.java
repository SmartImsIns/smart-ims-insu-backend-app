package com.sims.IMOBFF.service;

import com.sims.IMOBFF.model.Credentials;
import com.sims.IMOBFF.model.DashboardPolicyDetails;
import com.sims.IMOBFF.model.UserInfo;

import reactor.core.publisher.Mono;

public interface LoginService {

	Mono<UserInfo> getUserInfo(Credentials credentials);
	Mono<DashboardPolicyDetails> getDashboardDetails(Credentials credentials);
}
