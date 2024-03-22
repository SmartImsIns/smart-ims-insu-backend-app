package com.sims.IMOBFF.customer.service;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.BodyInserters;
import org.springframework.web.reactive.function.client.WebClient;

import com.sims.IMOBFF.model.common.ResponseDTO;
import com.sims.IMOBFF.model.driver.DriverDetailsList;
import com.sims.IMOBFF.model.policy.DashboardPolicyDetails;
import com.sims.IMOBFF.model.policy.PolicyRef;
import com.sims.IMOBFF.model.vehicle.Vehicle;
import com.sims.IMOBFF.model.vehicle.VehicleDetailsList;

import reactor.core.publisher.Mono;

@Service
public class PolicyServicyImpl implements PolicyService {
	
private final WebClient webClient;
	
	private String baseUrl="https://portal-gw.insuremo.com";
	private String authToken= "MOATp_rXDhOnARkQvh-8fOSUEbaECVEl";

	public PolicyServicyImpl(WebClient.Builder webClientBuilder) {
		super();
		this.webClient = webClientBuilder.baseUrl(baseUrl).build();
	}

	@Override
	public ResponseDTO<VehicleDetailsList> getVehicleDetails(PolicyRef policyRef) {
		
		ResponseDTO<VehicleDetailsList> response = new ResponseDTO<>();
				
		VehicleDetailsList vehicleDetails = webClient.post()
						.uri("/smartims/1.0/api/policyDetails/vehicleDetails")
						.headers(headers -> headers.setBearerAuth(authToken))
						.contentType(MediaType.APPLICATION_JSON)
						.body(BodyInserters.fromValue(policyRef))
						.retrieve()
						.bodyToMono(VehicleDetailsList.class)
						.onErrorResume(error -> {
							System.err.println("Error during WebClient call: " + error.getMessage());
							return Mono.empty();
						})
						.block();
		
				response.setData(vehicleDetails);
		
		
		return response;
	}

	@Override
	public ResponseDTO<DriverDetailsList> getDriverDetails(PolicyRef policyRef) {
		
		ResponseDTO<DriverDetailsList> response = new ResponseDTO<>();
		
		DriverDetailsList driverDetails = webClient.post()
						.uri("/smartims/1.0/api/policyDetails/driverDetails")
						.headers(headers -> headers.setBearerAuth(authToken))
						.contentType(MediaType.APPLICATION_JSON)
						.body(BodyInserters.fromValue(policyRef))
						.retrieve()
						.bodyToMono(DriverDetailsList.class)
						.onErrorResume(error -> {
							System.err.println("Error during WebClient call: " + error.getMessage());
							return Mono.empty();
						})
						.block();
		
				response.setData(driverDetails);
		
		
		return response;
	}

}
