package com.bookingapp.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "STATION_MASTER")
public class StationMaster {
	@Id
	@Column(name = "station_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private long station_id;
	
	@Column(name = "station_name")
	private String name;
	
	@Column(name = "station_identity")
	private String identity;
	
	@Column(name = "station_address")
	private String address;
	
	@Column(name = "battery_count")
	private String batteryCount;

	public long getStation_id() {
		return station_id;
	}

	public void setStation_id(long station_id) {
		this.station_id = station_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getIdentity() {
		return identity;
	}

	public void setIdentity(String identity) {
		this.identity = identity;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getBatteryCount() {
		return batteryCount;
	}

	public void setBatteryCount(String batteryCount) {
		this.batteryCount = batteryCount;
	}
	
	
	

}
