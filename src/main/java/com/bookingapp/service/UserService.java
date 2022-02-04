package com.bookingapp.service;

import java.util.List;

import com.bookingapp.dto.LoginDto;
import com.bookingapp.dto.UserDto;
import com.bookingapp.entity.UserEntity;

public interface UserService {

	UserEntity save(UserDto userEntity);

	List<UserEntity> findAll();

	void deleteUserEntity(Long id);

	LoginDto validateUser(LoginDto loginDto);

}
