package com.bookingapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bookingapp.entity.StationMaster;

@Repository
public interface StationMasterRepository  extends JpaRepository<StationMaster, Long>{

	StationMaster findByIdentity(String identity);
}
