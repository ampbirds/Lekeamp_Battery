package com.bookingapp.entity;

import java.sql.Date;

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
@Table(name = "BATTERY_TRANSACTION")
public class BatteryTransaction {

	@Id
	@Column(name = "transaction_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "user_id", referencedColumnName = "user_id")
	private UserEntity userEntity;
	
	@OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "station_id", referencedColumnName = "station_id")
	private StationMaster stationMaster;
	
	@OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "battery_id", referencedColumnName = "battery_id")
	private BatteryMaster batteryMaster;
	
	@Column(name = "battery_voltage")
	private String batteryVoltage;
	
	@Column(name = "transaction_date")
	private Date date;
	
	@Column(name = "transaction_code")
	private String transactionId;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public UserEntity getUserEntity() {
		return userEntity;
	}

	public void setUserEntity(UserEntity userEntity) {
		this.userEntity = userEntity;
	}

	public StationMaster getStationMaster() {
		return stationMaster;
	}

	public void setStationMaster(StationMaster stationMaster) {
		this.stationMaster = stationMaster;
	}

	public BatteryMaster getBatteryMaster() {
		return batteryMaster;
	}

	public void setBatteryMaster(BatteryMaster batteryMaster) {
		this.batteryMaster = batteryMaster;
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
