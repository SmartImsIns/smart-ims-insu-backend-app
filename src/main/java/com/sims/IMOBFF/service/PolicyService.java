package com.sims.IMOBFF.service;

import com.sims.IMOBFF.model.DriverDetailsList;
import com.sims.IMOBFF.model.PolicyRef;
import com.sims.IMOBFF.model.ResponseDTO;
import com.sims.IMOBFF.model.Vehicle;
import com.sims.IMOBFF.model.VehicleDetailsList;

public interface PolicyService {

	ResponseDTO<VehicleDetailsList> getVehicleDetails(PolicyRef policyRef);

	ResponseDTO<DriverDetailsList> getDriverDetails(PolicyRef policyRef);

}
