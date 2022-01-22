package com.bookingapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bookingapp.entity.RFIDEntity;


@Repository
public interface RFIDEntityRepository extends JpaRepository<RFIDEntity, Long>{

	RFIDEntity findByrfidNum(String rfidNum);
}
