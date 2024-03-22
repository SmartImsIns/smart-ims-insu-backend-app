package com.sims.IMOBFF.customer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sims.IMOBFF.customer.service.DashboardService;
import com.sims.IMOBFF.model.common.ResponseDTO;
import com.sims.IMOBFF.model.policy.DashboardPolicyDetails;
import com.sims.IMOBFF.model.policy.PolicyInput;

import jakarta.servlet.http.Cookie;

@RestController
@RequestMapping("/smartims/1.0/api/dashboard")
@CrossOrigin(origins = "*")
public class DashboardController {

	@Autowired
	private DashboardService dashboardService;

	@PostMapping("/customer/policies")
	public ResponseEntity<ResponseDTO<DashboardPolicyDetails>> getPolicySummary(@RequestBody PolicyInput policyInput) {

		ResponseDTO<DashboardPolicyDetails> policyDetails = dashboardService.getPolicySummary(policyInput);
		System.out.println(policyDetails);

		policyDetails.setStatusCode(200);

		return ResponseEntity.status(HttpStatus.OK).body(policyDetails);

	}

}
