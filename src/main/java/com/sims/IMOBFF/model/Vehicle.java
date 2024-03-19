package com.sims.IMOBFF.model;

public class Vehicle {
	
	private String vehIdentificationNumber;
	private String manufacturer;
	private String model;
	private String modelYr;
	private String status;
	private String typeCd;
	
	public String getVehIdentificationNumber() {
		return vehIdentificationNumber;
	}
	public void setVehIdentificationNumber(String vehIdentificationNumber) {
		this.vehIdentificationNumber = vehIdentificationNumber;
	}
	public String getManufacturer() {
		return manufacturer;
	}
	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getModelYr() {
		return modelYr;
	}
	public void setModelYr(String modelYr) {
		this.modelYr = modelYr;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getTypeCd() {
		return typeCd;
	}
	public void setTypeCd(String typeCd) {
		this.typeCd = typeCd;
	}
	@Override
	public String toString() {
		return String.format(
				"VehicleDetails [vehIdentificationNumber=%s, manufacturer=%s, model=%s, modelYr=%s, status=%s, typeCd=%s]",
				vehIdentificationNumber, manufacturer, model, modelYr, status, typeCd);
	}
	
	

}
