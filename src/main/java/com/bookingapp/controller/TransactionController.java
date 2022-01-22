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

import com.bookingapp.dto.TransactionDto;
import com.bookingapp.entity.BatteryTransaction;
import com.bookingapp.service.TransactionService;

@RestController
@RequestMapping("/transactionApi")
public class TransactionController {
	@Autowired
	TransactionService transactionService;
	
	@PostMapping("/createOrUpdate")
	public ResponseEntity<BatteryTransaction>  createorUpdateBattery(TransactionDto transactionDto  ){
		BatteryTransaction batteryTransaction= transactionService.save(transactionDto);
		return new ResponseEntity<BatteryTransaction>(batteryTransaction, new HttpHeaders(), HttpStatus.OK);
	}
	
	@GetMapping("/getAll")
	public ResponseEntity<List<BatteryTransaction>> getAllDetails(){
		return new ResponseEntity<List<BatteryTransaction>>(transactionService.findAll(), new HttpHeaders(), HttpStatus.OK);
	}
}