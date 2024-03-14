package com.sims.IMOBFF.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sims.IMOBFF.model.Credentials;
import com.sims.IMOBFF.model.DashboardPolicyDetails;
import com.sims.IMOBFF.model.UserInfo;
import com.sims.IMOBFF.service.LoginService;

import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/smartims/1.0/api/login")
@CrossOrigin(origins = "*")
public class LoginController {
	
	@Autowired
	private LoginService loginService;

	
	@PostMapping("/user")
	public Mono<UserInfo> getUserInfo(@RequestBody Credentials credentials){
			
		return loginService.getUserInfo(credentials).doOnNext(customerInfo -> {         
            System.out.println("Customer Info: " + customerInfo);
        });
	}
	
	
	@PostMapping("/customer/dashboard")
	public Mono<DashboardPolicyDetails> getDashboardDetails(@RequestBody Credentials credentials){
		
		return loginService.getDashboardDetails(credentials).doOnNext(dashBoardInfo -> {
            System.out.println("Dashboard Info: " + dashBoardInfo);
        });
	}
}
