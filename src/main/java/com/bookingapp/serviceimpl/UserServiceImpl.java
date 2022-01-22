package com.bookingapp.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bookingapp.entity.UserEntity;
import com.bookingapp.repository.UserEntityRepository;
import com.bookingapp.service.UserService;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
    private UserEntityRepository userEntityRepository;
	
	@Override
	public UserEntity save(UserEntity userEntity) {
		UserEntity user = userEntityRepository.findByphoneNumber(userEntity.getPhoneNumber());
		if(user!=null) {
			user.setAddress(userEntity.getAddress());
			user.setBatteryCode(userEntity.getBatteryCode());
			user.setRfidCode(userEntity.getRfidCode());
			userEntityRepository.save(user);
		}else {
			userEntityRepository.save(userEntity);
		}
		return userEntityRepository.findByphoneNumber(userEntity.getPhoneNumber());
	}

	@Override
	public List<UserEntity> findAll() {
		return userEntityRepository.findAll();
	}

	@Override
	public void deleteUserEntity(Long id) {
		userEntityRepository.deleteById(id);
		
	}

}
