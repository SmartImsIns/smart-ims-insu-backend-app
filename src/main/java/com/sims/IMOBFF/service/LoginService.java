package com.sims.IMOBFF.service;

import com.sims.IMOBFF.model.Credentials;
import com.sims.IMOBFF.model.DashboardPolicyDetails;
import com.sims.IMOBFF.model.ResponseDTO;
import com.sims.IMOBFF.model.UserInfo;

import reactor.core.publisher.Mono;

public interface LoginService {

	ResponseDTO<UserInfo> getUserInfo(Credentials credentials);
	ResponseDTO<DashboardPolicyDetails> getDashboardDetails(Credentials credentials);
}
