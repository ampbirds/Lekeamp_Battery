package com.bookingapp.dto;

import java.sql.Date;




public class TransactionDto {

	private long id;
	private long userid ;
	private long stationid;
	private long batteryid;
	private String batteryVoltage;
	private Date date;
	private String transactionId;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public long getUserid() {
		return userid;
	}
	public void setUserid(long userid) {
		this.userid = userid;
	}
	public long getStationid() {
		return stationid;
	}
	public void setStationid(long stationid) {
		this.stationid = stationid;
	}
	public long getBatteryid() {
		return batteryid;
	}
	public void setBatteryid(long batteryid) {
		this.batteryid = batteryid;
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
	
	
	
}
