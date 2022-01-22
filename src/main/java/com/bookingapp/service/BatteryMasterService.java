package com.bookingapp.service;

import java.util.List;

import com.bookingapp.dto.BatteryCodeDto;
import com.bookingapp.dto.BatteryMasterDto;
import com.bookingapp.dto.RequestIdDto;
import com.bookingapp.dto.UpdateVoltageDto;
import com.bookingapp.entity.BatteryMaster;

public interface BatteryMasterService {

	BatteryMaster save(BatteryMasterDto batteryMasterobj);

	List<BatteryMaster> findAll();

	BatteryMaster getById(RequestIdDto requestIdDto);

	BatteryMaster getByBatteryCode(BatteryCodeDto requestIdDto);

	BatteryMaster updateVoltage(UpdateVoltageDto updateVoltageDto);

}
