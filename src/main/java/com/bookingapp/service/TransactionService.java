package com.bookingapp.service;

import java.util.List;

import com.bookingapp.dto.TransactionDto;
import com.bookingapp.dto.UpdateVoltageDto;
import com.bookingapp.entity.BatteryTransaction;

public interface TransactionService {

	BatteryTransaction save(TransactionDto transactionDto);

	List<BatteryTransaction> findAll();

	BatteryTransaction updateVoltage(UpdateVoltageDto updateVoltageDto);

}
