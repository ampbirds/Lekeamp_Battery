package com.bookingapp.service;

import java.util.List;

import com.bookingapp.entity.BikeInfo;

public interface BikeInfoService {

	BikeInfo createUpdateBikeInfo(BikeInfo bikeInfo);

	List<BikeInfo> findAll();

	void deleteBikeInfoById(Long id);

}
