package com.bookingapp.service;

import java.util.List;

import com.bookingapp.entity.StationMaster;

public interface StationService {

	void save(StationMaster stationMaster);

	List<StationMaster> findAll();

	void deleteStationMaster(Long id);

}
