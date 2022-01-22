package com.bookingapp.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bookingapp.entity.RFIDEntity;
import com.bookingapp.repository.RFIDEntityRepository;
import com.bookingapp.service.RFIDService;

@Service
public class RFIDServiceImpl implements RFIDService{

	@Autowired
	RFIDEntityRepository rfidEntityRepository;
	
	@Override
	public RFIDEntity save(RFIDEntity rfidEntity) {
		RFIDEntity rfidEntity2 = rfidEntityRepository.findByrfidNum(rfidEntity.getRfidCode());
		if(rfidEntity2!=null) {
			rfidEntity2.setBikeCode(rfidEntity.getBikeCode());
			rfidEntity2.setLotNumber(rfidEntity.getLotNumber());
			rfidEntity2.setRfidCode(rfidEntity.getRfidCode());
			rfidEntity2.setRfidNum(rfidEntity.getRfidNum());
			rfidEntity2.setStatus(rfidEntity.getStatus());
			rfidEntityRepository.save(rfidEntity2);
		}else {
			rfidEntityRepository.save(rfidEntity);
		}
		return rfidEntityRepository.findByrfidNum(rfidEntity.getRfidCode());
		
	}

	@Override
	public List<RFIDEntity> findAll() {
		return rfidEntityRepository.findAll();
	}

	@Override
	public void deleteRFIDEntity(Long id) {
		rfidEntityRepository.deleteById(id);
		
	}

}
