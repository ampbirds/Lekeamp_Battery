package com.bookingapp.serviceimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bookingapp.entity.StationMaster;
import com.bookingapp.repository.StationMasterRepository;
import com.bookingapp.service.StationService;

@Service
public class StationServiceImpl implements StationService{

	@Autowired
	private StationMasterRepository stationMasterRepository;
	
	@Override
	public void save(StationMaster stationMaster) {
		StationMaster master = stationMasterRepository.findByIdentity(stationMaster.getIdentity());
		if(master!=null) {
			master.setAddress(stationMaster.getAddress());
			master.setBatteryCount(stationMaster.getBatteryCount());
			master.setName(stationMaster.getName());
			stationMasterRepository.save(master);
		}else {
			stationMasterRepository.save(stationMaster);
		}
		 
	}

	@Override
	public List<StationMaster> findAll() {
		return stationMasterRepository.findAll();
	}

	@Override
	public void deleteStationMaster(Long id) {
		Optional<StationMaster> stationMaster = stationMasterRepository.findById(id);
		if(!stationMaster.isEmpty()) {
			stationMasterRepository.deleteById(id);
		}
	}

}
