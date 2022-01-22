package com.bookingapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bookingapp.entity.BatteryTransaction;

@Repository
public interface BatteryTransactionRepository extends JpaRepository<BatteryTransaction, Long> {

	BatteryTransaction findByTransactionId(String transactionId);
}
