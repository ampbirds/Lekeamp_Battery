package com.bookingapp.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;

@Entity
@Table(name = "USER")
@Data
@AllArgsConstructor
public class UserEntity {
	
	@Id
    @Column(name = "user_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userId;
	
	@Column(name = "user_name")
	private String userName;

	@Column(name = "email")
	private String email;
	
	@Column(name = "user_surname")
	private String userSurname;
	
	@Column(name = "address")
	private String address;
	
	@Column(name = "city")
	private String city;
	
	@Column(name = "state")
	private String state;
	
	@Column(name = "pincode")
	private Integer pincode;
	
	@Column(name = "phonenumber")
	private String phoneNumber;
	
	@Column(name = "password")
	private String password;
	
	@Column(name = "vehicle_model")
	private String vehicleModel;
	
	@Column(name = "cycle_code")
	private String cycleCode;
	
	@Column(name = "battery_code")
	private String batteryCode;
	
	@Column(name = "rfid_code")
	private String rfidCode;
	
	@Column(name = "rcpt_no")
	private String rcptNo;
	
	@Column(name = "date_of_purchase")
	private String dateOfPurchase;
	
	@Column(name = "amount")
	private String amount;
	
	@Column(name = "gst_no")
	private String gstNo;
	
	@Column(name = "dis_cod")
	private String disCod;
	
	@Column(name = "mode_of_sale")
	private String modeOfSale;
	
	@Column(name = "warrenty_det")
	private String warrentyDet;
	
	@Column(name = "complain_no")
	private String complainNo;
	
	@Column(name = "last_service")
	private String lastService;
	
	@Column(name = "subscription_date")
	private String subscriptionDate;
	
	@Column(name = "last_date_of_subscription")
	private String lastDateOfSupscription;

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserSurname() {
		return userSurname;
	}

	public void setUserSurname(String userSurname) {
		this.userSurname = userSurname;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public Integer getPincode() {
		return pincode;
	}

	public void setPincode(Integer pincode) {
		this.pincode = pincode;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getVehicleModel() {
		return vehicleModel;
	}

	public void setVehicleModel(String vehicleModel) {
		this.vehicleModel = vehicleModel;
	}

	public String getCycleCode() {
		return cycleCode;
	}

	public void setCycleCode(String cycleCode) {
		this.cycleCode = cycleCode;
	}

	public String getBatteryCode() {
		return batteryCode;
	}

	public void setBatteryCode(String batteryCode) {
		this.batteryCode = batteryCode;
	}

	public String getRfidCode() {
		return rfidCode;
	}

	public void setRfidCode(String rfidCode) {
		this.rfidCode = rfidCode;
	}

	public String getRcptNo() {
		return rcptNo;
	}

	public void setRcptNo(String rcptNo) {
		this.rcptNo = rcptNo;
	}

	public String getDateOfPurchase() {
		return dateOfPurchase;
	}

	public void setDateOfPurchase(String dateOfPurchase) {
		this.dateOfPurchase = dateOfPurchase;
	}

	public String getAmount() {
		return amount;
	}

	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String getGstNo() {
		return gstNo;
	}

	public void setGstNo(String gstNo) {
		this.gstNo = gstNo;
	}

	public String getDisCod() {
		return disCod;
	}

	public void setDisCod(String disCod) {
		this.disCod = disCod;
	}

	public String getModeOfSale() {
		return modeOfSale;
	}

	public void setModeOfSale(String modeOfSale) {
		this.modeOfSale = modeOfSale;
	}

	public String getWarrentyDet() {
		return warrentyDet;
	}

	public void setWarrentyDet(String warrentyDet) {
		this.warrentyDet = warrentyDet;
	}

	public String getComplainNo() {
		return complainNo;
	}

	public void setComplainNo(String complainNo) {
		this.complainNo = complainNo;
	}

	public String getLastService() {
		return lastService;
	}

	public void setLastService(String lastService) {
		this.lastService = lastService;
	}

	public String getSubscriptionDate() {
		return subscriptionDate;
	}

	public void setSubscriptionDate(String subscriptionDate) {
		this.subscriptionDate = subscriptionDate;
	}

	public String getLastDateOfSupscription() {
		return lastDateOfSupscription;
	}

	public void setLastDateOfSupscription(String lastDateOfSupscription) {
		this.lastDateOfSupscription = lastDateOfSupscription;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	
	
	
	
}
