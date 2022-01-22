package com.bookingapp.service;

import java.util.List;

import com.bookingapp.entity.RFIDEntity;

public interface RFIDService {

	RFIDEntity save(RFIDEntity rfidEntity);

	List<RFIDEntity> findAll();

	void deleteRFIDEntity(Long id);

}
