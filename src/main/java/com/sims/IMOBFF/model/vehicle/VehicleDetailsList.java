package com.sims.IMOBFF.model.vehicle;

import java.util.List;

public class VehicleDetailsList {
	
	private List<Vehicle> vehicleDetails;

	public List<Vehicle> getVehicleDetails() {
		return vehicleDetails;
	}

	public void setVehicleDetails(List<Vehicle> vehicleDetails) {
		this.vehicleDetails = vehicleDetails;
	}

	@Override
	public String toString() {
		return String.format("VehicleDetailsList [vehicleDetails=%s]", vehicleDetails);
	}
	
	

}
