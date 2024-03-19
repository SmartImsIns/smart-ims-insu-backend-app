package com.sims.IMOBFF.service;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.BodyInserters;
import org.springframework.web.reactive.function.client.WebClient;

import com.sims.IMOBFF.model.DashboardPolicyDetails;
import com.sims.IMOBFF.model.PolicyInput;
import com.sims.IMOBFF.model.ResponseDTO;
import com.sims.IMOBFF.model.UserInfo;

import reactor.core.publisher.Mono;

@Service
public class DashboardServiceImpl implements DashboardService{
	
	private final WebClient webClient;
	
	private String baseUrl="https://portal-gw.insuremo.com";
	private String authToken= "MOATp_rXDhOnARkQvh-8fOSUEbaECVEl";

	public DashboardServiceImpl(WebClient.Builder webClientBuilder) {
		super();
		this.webClient = webClientBuilder.baseUrl(baseUrl).build();
	}
	
	

	@Override
	public ResponseDTO<DashboardPolicyDetails> getPolicySummary(PolicyInput policyInput) {
		
		ResponseDTO<DashboardPolicyDetails> response = new ResponseDTO<>();
		
		DashboardPolicyDetails policySummary = webClient.post()
				.uri("/smartims/1.0/api/customer/policyDetails")
				.headers(headers -> headers.setBearerAuth(authToken))
				.contentType(MediaType.APPLICATION_JSON)
				.body(BodyInserters.fromValue(policyInput))
				.retrieve()
				.bodyToMono(DashboardPolicyDetails.class)
				.onErrorResume(error -> {
					System.err.println("Error during WebClient call: " + error.getMessage());
					return Mono.empty();
				})
				.block();
		
		response.setData(policySummary);
		
		return response;
		
	}
	
	

}
