package com.sims.IMOBFF.service;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.BodyInserters;
import org.springframework.web.reactive.function.client.WebClient;

import com.sims.IMOBFF.model.Credentials;
import com.sims.IMOBFF.model.DashboardPolicyDetails;
import com.sims.IMOBFF.model.UserInfo;

import reactor.core.publisher.Mono;

@Service
public class LoginServiceImpl implements LoginService{

	private final WebClient webClient;

	private String baseUrl = "https://portal-gw.insuremo.com";
	private String authToken = "MOATp_rXDhOnARkQvh-8fOSUEbaECVEl";

	public LoginServiceImpl(WebClient.Builder webClientBuilder) {
		super();
		this.webClient = webClientBuilder.baseUrl(baseUrl).build();
	}

	
	@Override
	public Mono<UserInfo> getUserInfo(Credentials credentials) {

		Mono<UserInfo> userInfo = webClient.post().uri("/smartims/1.0/api/customerDetails")
				.headers(headers -> headers.setBearerAuth(authToken)).contentType(MediaType.APPLICATION_JSON)
				.body(BodyInserters.fromValue(credentials)).retrieve().bodyToMono(UserInfo.class)
				.onErrorResume(error -> {
					System.err.println("Error during WebClient call: " + error.getMessage());
					return Mono.empty();
				});

		return userInfo;
	}

	@Override
	public Mono<DashboardPolicyDetails> getDashboardDetails(Credentials credentials) {

		Mono<DashboardPolicyDetails> dashboardPolicyDetails = webClient.post().uri("/smartims/1.0/api/dashboard")
				.headers(headers -> headers.setBearerAuth(authToken)).contentType(MediaType.APPLICATION_JSON)
				.body(BodyInserters.fromValue(credentials)).retrieve().bodyToMono(DashboardPolicyDetails.class);

		return dashboardPolicyDetails;

	}
}
