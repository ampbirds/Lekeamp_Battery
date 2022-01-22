package com.bookingapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bookingapp.entity.RFIDEntity;
import com.bookingapp.exception.RecordNotFoundException;
import com.bookingapp.service.RFIDService;

@RestController
@RequestMapping("/rfidapi")
public class RFIDController {

	@Autowired
	RFIDService rfidService;
	
	@PostMapping("/createOrUpdate")
	public ResponseEntity<List<RFIDEntity>> createOrUpdate(RFIDEntity rfidEntity) throws RecordNotFoundException {
		rfidService.save(rfidEntity);
		return new ResponseEntity<List<RFIDEntity>>(rfidService.findAll(), new HttpHeaders(), HttpStatus.CREATED);

	}

	@GetMapping("/all")
	public ResponseEntity<List<RFIDEntity>> all() {
		return new ResponseEntity<List<RFIDEntity>>(rfidService.findAll(), new HttpHeaders(), HttpStatus.OK);
	}

	@DeleteMapping("/{id}")
	public HttpStatus deleteRFIDById(@PathVariable("id") Long id) {
		rfidService.deleteRFIDEntity(id);
		return HttpStatus.FORBIDDEN;
	}
}
