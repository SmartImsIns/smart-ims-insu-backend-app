package com.sims.IMOBFF.model.driver;

import java.util.List;

public class DriverDetailsList {
	
	private List<Driver> driverDetails;

	public List<Driver> getDriverDetails() {
		return driverDetails;
	}

	public void setDriverDetails(List<Driver> driverDetails) {
		this.driverDetails = driverDetails;
	}

	@Override
	public String toString() {
		return String.format("DriverDetailsList [driverDetails=%s]", driverDetails);
	}
	
	

}
