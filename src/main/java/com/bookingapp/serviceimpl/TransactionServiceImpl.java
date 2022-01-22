package com.bookingapp.serviceimpl;

import java.sql.Date;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bookingapp.dto.TransactionDto;
import com.bookingapp.entity.BatteryMaster;
import com.bookingapp.entity.BatteryTransaction;
import com.bookingapp.entity.StationMaster;
import com.bookingapp.entity.UserEntity;
import com.bookingapp.repository.BatteryMasterRepository;
import com.bookingapp.repository.BatteryTransactionRepository;
import com.bookingapp.repository.StationMasterRepository;
import com.bookingapp.repository.UserEntityRepository;
import com.bookingapp.service.TransactionService;

@Service
public class TransactionServiceImpl implements TransactionService{

	@Autowired
	BatteryTransactionRepository transactionRepository;
	
	@Autowired
	BatteryMasterRepository batteryMasterRepository;
	
	@Autowired
	private StationMasterRepository stationMasterRepository;
	
	@Autowired
    private UserEntityRepository userEntityRepository;
	
	@Override
	public BatteryTransaction save(TransactionDto transactionDto) {
		long millis=System.currentTimeMillis();  
		Date date = new Date(millis);
		BatteryTransaction batteryTransaction = transactionRepository.findByTransactionId(transactionDto.getTransactionId());
		if(batteryTransaction!=null) {
			batteryTransaction.setBatteryVoltage(transactionDto.getBatteryVoltage());
			Optional<BatteryMaster> batteryMaster = batteryMasterRepository.findById(transactionDto.getBatteryid());
			batteryTransaction.setBatteryMaster(batteryMaster.get());
			Optional<StationMaster> stationMaster = stationMasterRepository.findById(transactionDto.getStationid());
			batteryTransaction.setStationMaster(stationMaster.get());
			Optional<UserEntity> userEntity = userEntityRepository.findById(transactionDto.getUserid());
			batteryTransaction.setUserEntity(userEntity.get());
			batteryTransaction.setDate(date);
			transactionRepository.save(batteryTransaction);
		}else {
			BatteryTransaction batteryTransaction2 = new BatteryTransaction();
			batteryTransaction2.setBatteryVoltage(transactionDto.getBatteryVoltage());
			Optional<BatteryMaster> batteryMaster = batteryMasterRepository.findById(transactionDto.getBatteryid());
			batteryTransaction2.setBatteryMaster(batteryMaster.get());
			Optional<StationMaster> stationMaster = stationMasterRepository.findById(transactionDto.getStationid());
			batteryTransaction2.setStationMaster(stationMaster.get());
			Optional<UserEntity> userEntity = userEntityRepository.findById(transactionDto.getUserid());
			batteryTransaction2.setUserEntity(userEntity.get());
			
			BatteryTransaction batteryTransaction3 = null;
			String transactionId = "";
			while(true) {
				System.out.println("inwhile");
				transactionId = generateString();
				transactionId = transactionId.substring(0,30);
				batteryTransaction3 = transactionRepository.findByTransactionId(transactionId);
				if(batteryTransaction3==null)
					break;
			}
			batteryTransaction2.setTransactionId(transactionId);
			batteryTransaction2.setDate(date);
			transactionRepository.save(batteryTransaction2);
		}
		return transactionRepository.findByTransactionId(transactionDto.getTransactionId());
	}
	
	 public static String generateString() {
	        String uuid = UUID.randomUUID().toString();
	        System.out.println("uuidamit"+uuid);
	        return "uuid = " + uuid;
	    }

	@Override
	public List<BatteryTransaction> findAll() {
		// TODO Auto-generated method stub
		return transactionRepository.findAll();
	}

}
