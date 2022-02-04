package com.bookingapp.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bookingapp.dto.LoginDto;
import com.bookingapp.dto.UserDto;
import com.bookingapp.entity.UserEntity;
import com.bookingapp.repository.UserEntityRepository;
import com.bookingapp.service.UserService;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
    private UserEntityRepository userEntityRepository;
	
	@Override
	public UserEntity save(UserDto userEntity) {
		UserEntity user = userEntityRepository.findByphoneNumber(userEntity.getPhonenumber());
		if(user!=null) {
			user.setEmail(userEntity.getEmail());
			user.setPassword(userEntity.getPassword());
			user.setUserName(userEntity.getUser_name());
			user.setUserSurname(userEntity.getUser_surname());
			user.setPhoneNumber(userEntity.getPhonenumber());
			userEntityRepository.save(user);
		}else {
			UserEntity entity = new UserEntity();
			entity.setEmail(userEntity.getEmail());
			entity.setPassword(userEntity.getPassword());
			entity.setUserName(userEntity.getUser_name());
			entity.setUserSurname(userEntity.getUser_surname());
			entity.setPhoneNumber(userEntity.getPhonenumber());
			userEntityRepository.save(entity);
		}
		return userEntityRepository.findByphoneNumber(userEntity.getPhonenumber());
	}

	@Override
	public List<UserEntity> findAll() {
		return userEntityRepository.findAll();
	}

	@Override
	public void deleteUserEntity(Long id) {
		userEntityRepository.deleteById(id);
		
	}

	@Override
	public LoginDto validateUser(LoginDto loginDto) {
		UserEntity user = userEntityRepository.validateUser(loginDto.getEmail(),loginDto.getPassword());
		if(user == null) {
			loginDto.setStatus(false);
		}else {
			loginDto.setStatus(true);
		}
		return loginDto;
	}

}
