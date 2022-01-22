package com.bookingapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bookingapp.dto.BatteryCodeDto;
import com.bookingapp.dto.BatteryMasterDto;
import com.bookingapp.dto.RequestIdDto;
import com.bookingapp.dto.UpdateVoltageDto;
import com.bookingapp.entity.BatteryMaster;
import com.bookingapp.entity.BatteryTransaction;
import com.bookingapp.service.BatteryMasterService;

@RestController
@RequestMapping("/batteryapi")
public class BatteryController {
	
	@Autowired
	BatteryMasterService batteryMasterService;
	
	@PostMapping("/createorUpdate")
	public ResponseEntity<BatteryMaster>  createorUpdateBattery(BatteryMasterDto batteryMasterobj){
		BatteryMaster batteryMaster= batteryMasterService.save(batteryMasterobj);
		return new ResponseEntity<BatteryMaster>(batteryMaster, new HttpHeaders(), HttpStatus.OK);
	}
	
	@GetMapping("/getAll")
	public ResponseEntity<List<BatteryMaster>> getAllDetails(){
		return new ResponseEntity<List<BatteryMaster>>(batteryMasterService.findAll(), new HttpHeaders(), HttpStatus.OK);
	}
	
	@PostMapping("/getById")
	public ResponseEntity<BatteryMaster>  getById(RequestIdDto requestIdDto){
		return new ResponseEntity<BatteryMaster>(batteryMasterService.getById(requestIdDto), new HttpHeaders(), HttpStatus.OK);
	}
	@PostMapping("/getByBatteryCode")
	public ResponseEntity<BatteryMaster>  getByBatteryCode(BatteryCodeDto requestIdDto){
		return new ResponseEntity<BatteryMaster>(batteryMasterService.getByBatteryCode(requestIdDto), new HttpHeaders(), HttpStatus.OK);
	}
	
	@GetMapping("/updateVoltage")
	public ResponseEntity<BatteryMaster> updateVoltage(UpdateVoltageDto updateVoltageDto){
		return new ResponseEntity<BatteryMaster>(batteryMasterService.updateVoltage(updateVoltageDto), new HttpHeaders(), HttpStatus.OK);
	}

}
