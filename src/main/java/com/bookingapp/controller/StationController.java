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

import com.bookingapp.entity.StationMaster;
import com.bookingapp.exception.RecordNotFoundException;
import com.bookingapp.service.StationService;

@RestController
@RequestMapping("/stationapi")
public class StationController {
	
	@Autowired
	StationService stationService;
	
	@PostMapping("/createOrUpdate")
	public ResponseEntity<List<StationMaster>> createOrUpdate(StationMaster stationMaster) throws RecordNotFoundException {
		stationService.save(stationMaster);
		return new ResponseEntity<List<StationMaster>>(stationService.findAll(), new HttpHeaders(), HttpStatus.CREATED);

	}

	@GetMapping("/all")
	public ResponseEntity<List<StationMaster>> all() {
		return new ResponseEntity<List<StationMaster>>(stationService.findAll(), new HttpHeaders(), HttpStatus.OK);
	}

	@DeleteMapping("/{id}")
	public HttpStatus deleteRFIDById(@PathVariable("id") Long id) {
		stationService.deleteStationMaster(id);
		return HttpStatus.FORBIDDEN;
	}

}
