package com.sims.IMOBFF.customer.service;

import com.sims.IMOBFF.model.common.ResponseDTO;
import com.sims.IMOBFF.model.driver.DriverDetailsList;
import com.sims.IMOBFF.model.policy.PolicyRef;
import com.sims.IMOBFF.model.vehicle.Vehicle;
import com.sims.IMOBFF.model.vehicle.VehicleDetailsList;

public interface PolicyService {

	ResponseDTO<VehicleDetailsList> getVehicleDetails(PolicyRef policyRef);

	ResponseDTO<DriverDetailsList> getDriverDetails(PolicyRef policyRef);

}
