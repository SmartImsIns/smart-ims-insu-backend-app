package com.sims.IMOBFF.model.driver;

public class Driver {

	private String givenName;
	private String surname;
	private String licenseNumber;
	private String driverStatusCd;
	private String genderCd;
	private String birthDt;
	public String getGivenName() {
		return givenName;
	}
	public void setGivenName(String givenName) {
		this.givenName = givenName;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public String getLicenseNumber() {
		return licenseNumber;
	}
	public void setLicenseNumber(String licenseNumber) {
		this.licenseNumber = licenseNumber;
	}
	public String getDriverStatusCd() {
		return driverStatusCd;
	}
	public void setDriverStatusCd(String driverStatusCd) {
		this.driverStatusCd = driverStatusCd;
	}
	public String getGenderCd() {
		return genderCd;
	}
	public void setGenderCd(String genderCd) {
		this.genderCd = genderCd;
	}
	public String getBirthDt() {
		return birthDt;
	}
	public void setBirthDt(String birthDt) {
		this.birthDt = birthDt;
	}
	@Override
	public String toString() {
		return String.format(
				"Driver [givenName=%s, surname=%s, licenseNumber=%s, driverStatusCd=%s, genderCd=%s, birthDt=%s]",
				givenName, surname, licenseNumber, driverStatusCd, genderCd, birthDt);
	}
	
	
	
	
}
