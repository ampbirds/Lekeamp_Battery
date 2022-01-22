package com.bookingapp.service;

import java.util.List;

import com.bookingapp.entity.UserEntity;

public interface UserService {

	UserEntity save(UserEntity userEntity);

	List<UserEntity> findAll();

	void deleteUserEntity(Long id);

}
