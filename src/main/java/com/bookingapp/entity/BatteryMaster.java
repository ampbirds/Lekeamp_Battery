package com.bookingapp.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "BATTERY_MASTER")
public class BatteryMaster {
	@Id
	@Column(name = "battery_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "station_id", referencedColumnName = "station_id")
	private StationMaster stationMaster;
	
	@Column(name = "battery_code")
	private String batteryCode;
	
	@Column(name = "battery_voltage")
	private String batteryVoltage;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public StationMaster getStationMaster() {
		return stationMaster;
	}

	public void setStationMaster(StationMaster stationMaster) {
		this.stationMaster = stationMaster;
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
