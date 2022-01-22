package com.bookingapp.dto;




public class BatteryMasterDto {

	
	private long id;
	
	
	private long stationMasterId;
	

	private String batteryCode;
	
	
	private String batteryVoltage;


	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public long getStationMasterId() {
		return stationMasterId;
	}


	public void setStationMasterId(long stationMasterId) {
		this.stationMasterId = stationMasterId;
	}


	public String getBatteryCode() {
		return batteryCode;
	}


	public void setBatteryCode(String batteryCode) {
		this.batteryCode = batteryCode;
	}


	public String getBatteryVoltage() {
		return batteryVoltage;
	}


	public void setBatteryVoltage(String batteryVoltage) {
		this.batteryVoltage = batteryVoltage;
	}
	
	
}
