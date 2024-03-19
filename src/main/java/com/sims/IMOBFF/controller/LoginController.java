package com.sims.IMOBFF.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sims.IMOBFF.model.Credentials;
import com.sims.IMOBFF.model.DashboardPolicyDetails;
import com.sims.IMOBFF.model.ResponseDTO;
import com.sims.IMOBFF.model.UserInfo;
import com.sims.IMOBFF.service.LoginService;

import jakarta.servlet.http.Cookie;

@RestController
@RequestMapping("/smartims/1.0/api/login")
@CrossOrigin(origins = "*")
public class LoginController {
	
	@Autowired
	private LoginService loginService;

	
	@PostMapping("/user")
	public ResponseEntity<ResponseDTO<UserInfo>> getUserInfo(@RequestBody Credentials credentials){
		
		ResponseDTO<UserInfo> userInfo =loginService.getUserInfo(credentials);
		
		userInfo.setStatusCode(200);
//		String cookieName="isAuthenticated";
//		String cookieValue="true";
//		
//		Cookie cookie = new Cookie(cookieName, cookieValue); 
//		cookie.setPath("/customer/dashboard");
//		cookie.setHttpOnly(true);
//		HttpHeaders headers = new HttpHeaders(); headers.add(HttpHeaders.SET_COOKIE, cookie);
		
		String cookieName	="isAuthenticated";    
		String cookieValue	="true";
		String domain = "172.24.23.148";
		// Construct the Set-Cookie header string
		String cookieHeader	= cookieName +"="+ cookieValue +"; Path=/; HttpOnly; Domain = "+domain;    
		// Add the Set-Cookie header to the HTTP response
		HttpHeaders headers = new HttpHeaders(); 
		headers.add(HttpHeaders.SET_COOKIE, cookieHeader);
		   
		
		return ResponseEntity.status(HttpStatus.OK).headers(headers).body(userInfo);
	}
	
	
	@PostMapping("/customer/dashboard")
	public ResponseDTO<DashboardPolicyDetails> getDashboardDetails(@RequestBody Credentials credentials){
		
		ResponseDTO<DashboardPolicyDetails> dashboardPolicyDetails = loginService.getDashboardDetails(credentials);
		
		dashboardPolicyDetails.setStatusCode(200);	
		
		return dashboardPolicyDetails;
        
	}
}
