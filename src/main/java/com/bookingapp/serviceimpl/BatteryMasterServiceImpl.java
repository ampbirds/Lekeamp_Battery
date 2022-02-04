package com.bookingapp.serviceimpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bookingapp.dto.BatterMasterResponseDto;
import com.bookingapp.dto.BatteryCodeDto;
import com.bookingapp.dto.BatteryMasterDto;
import com.bookingapp.dto.RequestIdDto;
import com.bookingapp.dto.UpdateVoltageDto;
import com.bookingapp.entity.BatteryMaster;
import com.bookingapp.entity.StationMaster;
import com.bookingapp.repository.BatteryMasterRepository;
import com.bookingapp.repository.StationMasterRepository;
import com.bookingapp.service.BatteryMasterService;

@Service
public class BatteryMasterServiceImpl implements BatteryMasterService{

	@Autowired
	BatteryMasterRepository batteryMasterRepository;
	
	@Autowired
	private StationMasterRepository stationMasterRepository;
	
	@Override
	public BatteryMaster save(BatteryMasterDto batteryMasterobj) {
		// TODO Auto-generated method stub
		BatteryMaster batteryMaster = batteryMasterRepository.findByBatteryCode(batteryMasterobj.getBatteryCode());
    	if(batteryMaster!=null) {
    		batteryMaster.setBatteryVoltage(batteryMasterobj.getBatteryVoltage());
    		batteryMaster.setBatteryCode(batteryMasterobj.getBatteryCode());
    		Optional<StationMaster> master = stationMasterRepository.findById(batteryMasterobj.getStationMasterId());
    		batteryMaster.setStationMaster(master.get());
    		batteryMasterRepository.save(batteryMaster);
    	}else {
    		BatteryMaster batteryMaster2 = new BatteryMaster();
    		batteryMaster2.setBatteryVoltage(batteryMasterobj.getBatteryVoltage());
    		batteryMaster2.setBatteryCode(batteryMasterobj.getBatteryCode());
    		Optional<StationMaster> master = stationMasterRepository.findById(batteryMasterobj.getStationMasterId());
    		batteryMaster2.setStationMaster(master.get());
    		batteryMasterRepository.save(batteryMaster2);
    	}
        return batteryMasterRepository.findByBatteryCode(batteryMasterobj.getBatteryCode());
	}

	@Override
	public List<BatterMasterResponseDto> findAll() {
		List<BatteryMaster> batteryMasters = batteryMasterRepository.findAll();
		List<BatterMasterResponseDto> batterMasterResponseDtos = new ArrayList<BatterMasterResponseDto>();
		batteryMasters.stream().forEach(batteryObj->{
			BatterMasterResponseDto batterMasterResponseDto = new BatterMasterResponseDto();
			StationMaster master = batteryObj.getStationMaster();
			batterMasterResponseDto.setBatteryCode(batteryObj.getBatteryCode());
			batterMasterResponseDto.setBatteryVoltage(batteryObj.getBatteryVoltage());
			batterMasterResponseDto.setStationAdd(master.getAddress());
			batterMasterResponseDto.setStationId(master.getIdentity());
			batterMasterResponseDto.setStationName(master.getName());
			batterMasterResponseDto.setId(batteryObj.getId());
			if(Integer.parseInt(batteryObj.getBatteryVoltage())>=30 && Integer.parseInt(batteryObj.getBatteryVoltage())<32) {
				batterMasterResponseDto.setBatteryLevel(1);
			}
			if(Integer.parseInt(batteryObj.getBatteryVoltage())>=32 && Integer.parseInt(batteryObj.getBatteryVoltage())<40) {
				batterMasterResponseDto.setBatteryLevel(2);
			}
			if(Integer.parseInt(batteryObj.getBatteryVoltage())>=40 ) {
				batterMasterResponseDto.setBatteryLevel(3);
			}
			batterMasterResponseDtos.add(batterMasterResponseDto);
		});
		return batterMasterResponseDtos;
	}

	@Override
	public BatteryMaster getById(RequestIdDto requestIdDto) {
		Optional<BatteryMaster> batteryMaster = batteryMasterRepository.findById(requestIdDto.getId());
		return batteryMaster.get();
	}

	@Override
	public BatteryMaster getByBatteryCode(BatteryCodeDto requestIdDto) {
		// TODO Auto-generated method stub
		return batteryMasterRepository.findByBatteryCode(requestIdDto.getBatteryCode());
	}

	@Override
	public BatteryMaster updateVoltage(UpdateVoltageDto updateVoltageDto) {
		Optional<BatteryMaster> batteryMaster = batteryMasterRepository.findById(updateVoltageDto.getId());
		BatteryMaster batteryMaster2 = batteryMaster.get();
		batteryMaster2.setBatteryVoltage(updateVoltageDto.getVoltage());
		batteryMasterRepository.save(batteryMaster2);
		Optional<BatteryMaster> batteryMaster3 = batteryMasterRepository.findById(updateVoltageDto.getId());
		return  batteryMaster3.get();
	}

}
