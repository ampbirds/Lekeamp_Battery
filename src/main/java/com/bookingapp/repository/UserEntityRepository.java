package com.bookingapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bookingapp.entity.UserEntity;

@Repository
public interface UserEntityRepository extends JpaRepository<UserEntity, Long>{

	UserEntity findByphoneNumber(String phoneNumber);
}
