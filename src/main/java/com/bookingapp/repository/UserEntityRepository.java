package com.bookingapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.bookingapp.entity.UserEntity;

@Repository
public interface UserEntityRepository extends JpaRepository<UserEntity, Long>{

	UserEntity findByphoneNumber(String phoneNumber);

	@Query("select userEntity from UserEntity userEntity where userEntity.email  = :email and userEntity.password = :password")
	UserEntity validateUser(@Param("email") String email,@Param("password") String password);
}
