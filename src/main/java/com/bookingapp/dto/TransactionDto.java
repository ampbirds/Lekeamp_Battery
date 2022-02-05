package com.bookingapp.dto;

import java.sql.Date;




public class TransactionDto {

	private long id;
	private String userId ;
	private long stationId;
	private long batteryId;
	private String batteryVoltage;
	private Date date;
	private String transactionId;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	
	public String getBatteryVoltage() {
		return batteryVoltage;
	}
	public void setBatteryVoltage(String batteryVoltage) {
		this.batteryVoltage = batteryVoltage;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getTransactionId() {
		return transactionId;
	}
	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public long getStationId() {
		return stationId;
	}
	public void setStationId(long stationId) {
		this.stationId = stationId;
	}
	public long getBatteryId() {
		return batteryId;
	}
	public void setBatteryId(long batteryId) {
		this.batteryId = batteryId;
	}
	
	
	
}
