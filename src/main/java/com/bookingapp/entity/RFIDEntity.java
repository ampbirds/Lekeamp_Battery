package com.bookingapp.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "RFID")
public class RFIDEntity {

	@Id
    @Column(name = "rfid_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long rfidId;
	
	@Column(name = "rfid_num")
	private String rfidNum;
	
	@Column(name = "rfid_code")
	private String rfidCode;
	
	@Column(name = "model")
	private String model;
	
	@Column(name = "vendor_code")
	private String vendorCode;
	
	@Column(name = "lot_number")
	private String lotNumber;
	
	@Column(name = "date_of_purchase")
	private String dateOfPurchase;
	
	@Column(name = "date_of_issue")
	private String dateOfIssue;
	
	@Column(name = "status")
	private String status;
	
	@Column(name = "user_code")
	private String userCode;
	
	@Column(name = "bike_code")
	private String bikeCode;

	public Long getRfidId() {
		return rfidId;
	}

	public void setRfidId(Long rfidId) {
		this.rfidId = rfidId;
	}

	public String getRfidNum() {
		return rfidNum;
	}

	public void setRfidNum(String rfidNum) {
		this.rfidNum = rfidNum;
	}

	public String getRfidCode() {
		return rfidCode;
	}

	public void setRfidCode(String rfidCode) {
		this.rfidCode = rfidCode;
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

	public String getLotNumber() {
		return lotNumber;
	}

	public void setLotNumber(String lotNumber) {
		this.lotNumber = lotNumber;
	}

	public String getDateOfPurchase() {
		return dateOfPurchase;
	}

	public void setDateOfPurchase(String dateOfPurchase) {
		this.dateOfPurchase = dateOfPurchase;
	}

	public String getDateOfIssue() {
		return dateOfIssue;
	}

	public void setDateOfIssue(String dateOfIssue) {
		this.dateOfIssue = dateOfIssue;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getUserCode() {
		return userCode;
	}

	public void setUserCode(String userCode) {
		this.userCode = userCode;
	}

	public String getBikeCode() {
		return bikeCode;
	}

	public void setBikeCode(String bikeCode) {
		this.bikeCode = bikeCode;
	}
	
}
