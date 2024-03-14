package com.sims.IMOBFF.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sims.IMOBFF.model.DashboardPolicyDetails;
import com.sims.IMOBFF.model.PolicyInput;
import com.sims.IMOBFF.service.DashboardService;

import reactor.core.publisher.Mono;


@RestController
@RequestMapping("/smartims/1.0/api/dashboard")
@CrossOrigin(origins = "*")
public class DashboardController {
	
	@Autowired
	private DashboardService dashboardService;
	
	
	@PostMapping("/customer/policies")
	public Mono<DashboardPolicyDetails> getPolicySummary(@RequestBody PolicyInput policyInput){
		
		return dashboardService.getPolicySummary(policyInput).doOnNext(policySummary -> {
            System.out.println("Dashboard Policy Info: " + policySummary);
        });
	}
	
}
