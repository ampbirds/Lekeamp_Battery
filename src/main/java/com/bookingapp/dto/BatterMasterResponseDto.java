package com.bookingapp.dto;

public class BatterMasterResponseDto {
	private Long id;
	private String batteryCode;
	private String batteryVoltage;
	private String stationName;
	private String stationId;
	private String stationAdd;
	private Integer batteryLevel;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
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
	public String getStationName() {
		return stationName;
	}
	public void setStationName(String stationName) {
		this.stationName = stationName;
	}
	public String getStationId() {
		return stationId;
	}
	public void setStationId(String stationId) {
		this.stationId = stationId;
	}
	public String getStationAdd() {
		return stationAdd;
	}
	public void setStationAdd(String stationAdd) {
		this.stationAdd = stationAdd;
	}
	public Integer getBatteryLevel() {
		return batteryLevel;
	}
	public void setBatteryLevel(Integer batteryLevel) {
		this.batteryLevel = batteryLevel;
	}
	
	
}
