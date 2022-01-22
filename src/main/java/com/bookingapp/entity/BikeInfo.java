package com.bookingapp.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "BIKE_INFO")
public class BikeInfo {

	@Id
	@Column(name = "bike_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long bikeId;

	@Column(name = "bike_code")
	String bikeCode;
	@Column(name = "frame_code")
	String frameCode;

	@Column(name = "battery_code")
	String batteryCode;
	@Column(name = "location")
	String location;
	@Column(name = "date_of_manufacturer")
	String dateOfManufacturer;
	@Column(name = "date_of_sell")
	String dateOfSell;
	@Column(name = "model")
	String model;
	@Column(name = "vendor_code")
	String vendorCode;
	@Column(name = "lot_code")
	String lotCode;
	public Long getBikeId() {
		return bikeId;
	}
	public void setBikeId(Long bikeId) {
		this.bikeId = bikeId;
	}
	public String getBikeCode() {
		return bikeCode;
	}
	public void setBikeCode(String bikeCode) {
		this.bikeCode = bikeCode;
	}
	public String getFrameCode() {
		return frameCode;
	}
	public void setFrameCode(String frameCode) {
		this.frameCode = frameCode;
	}
	public String getBatteryCode() {
		return batteryCode;
	}
	public void setBatteryCode(String batteryCode) {
		this.batteryCode = batteryCode;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getDateOfManufacturer() {
		return dateOfManufacturer;
	}
	public void setDateOfManufacturer(String dateOfManufacturer) {
		this.dateOfManufacturer = dateOfManufacturer;
	}
	public String getDateOfSell() {
		return dateOfSell;
	}
	public void setDateOfSell(String dateOfSell) {
		this.dateOfSell = dateOfSell;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getVendorCode() {
		return vendorCode;
	}
	public void setVendorCode(String vendorCode) {
		this.vendorCode = vendorCode;
	}
	public String getLotCode() {
		return lotCode;
	}
	public void setLotCode(String lotCode) {
		this.lotCode = lotCode;
	}
	

}
