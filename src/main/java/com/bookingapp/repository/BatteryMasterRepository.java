package com.bookingapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bookingapp.entity.BatteryMaster;

@Repository
public interface BatteryMasterRepository extends JpaRepository<BatteryMaster, Long> {
	BatteryMaster findByBatteryCode(String batteryCode);
}
