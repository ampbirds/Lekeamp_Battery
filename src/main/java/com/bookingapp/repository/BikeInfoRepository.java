package com.bookingapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bookingapp.entity.BikeInfo;

public interface BikeInfoRepository extends JpaRepository<BikeInfo,Long>{

	BikeInfo getByBikeCode(String bikeCode);

}
