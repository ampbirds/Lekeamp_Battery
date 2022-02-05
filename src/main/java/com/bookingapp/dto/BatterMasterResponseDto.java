package com.bookingapp.dto;

public class BatterMasterResponseDto {
	private Long id;
	private String batteryCode;
	private String batteryVoltage;
	private String stationName;
	private long stationId;
	private String stationUniqueId;
	private String stationAdd;
	private Integer batteryLevel;
	private long batteryId;
	
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
	public long getStationId() {
		return stationId;
	}
	public void setStationId(long stationId) {
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
	public long getBatteryId() {
		return batteryId;
	}
	public void setBatteryId(long batteryId) {
		this.batteryId = batteryId;
	}
	public String getStationUniqueId() {
		return stationUniqueId;
	}
	public void setStationUniqueId(String stationUniqueId) {
		this.stationUniqueId = stationUniqueId;
	}
	
	
	
}
