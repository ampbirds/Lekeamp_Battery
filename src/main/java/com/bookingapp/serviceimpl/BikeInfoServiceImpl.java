package com.bookingapp.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bookingapp.entity.BikeInfo;
import com.bookingapp.repository.BikeInfoRepository;
import com.bookingapp.service.BikeInfoService;

@Service
public class BikeInfoServiceImpl implements BikeInfoService {
	
	@Autowired
	BikeInfoRepository bikeInfoRepository;

	@Override
	public BikeInfo createUpdateBikeInfo(BikeInfo bikeInfo) {
		
		BikeInfo bikeInfo2 = bikeInfoRepository.getByBikeCode(bikeInfo.getBikeCode());
		if(bikeInfo2 != null) {
			bikeInfo2.setBatteryCode(bikeInfo.getBatteryCode());
			bikeInfo2.setBikeCode(bikeInfo.getBikeCode());
			bikeInfo2.setLotCode(bikeInfo.getLotCode());
			bikeInfoRepository.save(bikeInfo2);
			
		}else {
			bikeInfoRepository.save(bikeInfo);
		}
		return bikeInfoRepository.getByBikeCode(bikeInfo.getBikeCode());
	}

	@Override
	public List<BikeInfo> findAll() {
		return bikeInfoRepository.findAll();
	}

	@Override
	public void deleteBikeInfoById(Long id) {
		bikeInfoRepository.deleteById(id);
		
	}

}
