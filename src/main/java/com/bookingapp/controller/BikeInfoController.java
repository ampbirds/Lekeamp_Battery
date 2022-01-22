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

import com.bookingapp.entity.BikeInfo;
import com.bookingapp.exception.RecordNotFoundException;
import com.bookingapp.service.BikeInfoService;

@RestController
@RequestMapping("/bikeInfoAPI")
public class BikeInfoController { 
	
	@Autowired
	BikeInfoService bikeInfoService;
	
	@PostMapping("/create")
	public ResponseEntity<List<BikeInfo>> createUpdateBikeInfo(BikeInfo bikeInfo) throws RecordNotFoundException{
		bikeInfoService.createUpdateBikeInfo(bikeInfo);
		return new ResponseEntity<List<BikeInfo>>(bikeInfoService.findAll(), new HttpHeaders(), HttpStatus.OK); 
	}
	
	@GetMapping("/all")
	public ResponseEntity<List<BikeInfo>> findAll()throws RecordNotFoundException{
		return new ResponseEntity<List<BikeInfo>>(bikeInfoService.findAll(), new HttpHeaders(), HttpStatus.OK);
	}
	
	@DeleteMapping("/{id}")
	public HttpStatus deleteBikeInfoById(@PathVariable("id") Long id) {
		bikeInfoService.deleteBikeInfoById(id);
		return HttpStatus.FORBIDDEN;
	}
	
}
