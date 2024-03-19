package com.sims.IMOBFF.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sims.IMOBFF.model.DriverDetailsList;
import com.sims.IMOBFF.model.PolicyRef;
import com.sims.IMOBFF.model.ResponseDTO;
import com.sims.IMOBFF.model.VehicleDetailsList;
import com.sims.IMOBFF.service.PolicyService;


@RestController
@RequestMapping("/smartims/1.0/api/policy")
@CrossOrigin(origins = "*")
public class PolicyController {
	
	@Autowired
	private PolicyService policyService;

	@PostMapping("/vehicles")
	public ResponseEntity<ResponseDTO<VehicleDetailsList>> getVehicleDetails(@RequestBody PolicyRef policyRef) {
		
		ResponseDTO<VehicleDetailsList> vehicleDetails = policyService.getVehicleDetails(policyRef);
		System.out.println(vehicleDetails.getData());
		
		vehicleDetails.setStatusCode(200);
		
		return ResponseEntity.status(HttpStatus.OK).body(vehicleDetails);
	}
	
	@PostMapping("/drivers")
	public ResponseEntity<ResponseDTO<DriverDetailsList>> getDriverDetails(@RequestBody PolicyRef policyRef) {
			
		ResponseDTO<DriverDetailsList> driverDetails = policyService.getDriverDetails(policyRef);
		System.out.println(driverDetails.getData());
		
		driverDetails.setStatusCode(200);
		
		return ResponseEntity.status(HttpStatus.OK).body(driverDetails);
	}
	
	
}
