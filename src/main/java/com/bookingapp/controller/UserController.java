package com.bookingapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bookingapp.dto.LoginDto;
import com.bookingapp.dto.UserDto;
import com.bookingapp.entity.UserEntity;
import com.bookingapp.exception.RecordNotFoundException;
import com.bookingapp.service.UserService;

@RestController
@RequestMapping("userApi")
@CrossOrigin(origins = "http://localhost:3000")
public class UserController {

	@Autowired
	private UserService userService;

	@PostMapping("/createOrUpdate")
	public ResponseEntity<List<UserEntity>> createOrUpdate(@RequestBody UserDto userEntity) throws RecordNotFoundException {
		userService.save(userEntity);
		return new ResponseEntity<List<UserEntity>>(userService.findAll(), new HttpHeaders(), HttpStatus.CREATED);

	}

	@GetMapping("/all")
	public ResponseEntity<List<UserEntity>> all() {
		return new ResponseEntity<List<UserEntity>>(userService.findAll(), new HttpHeaders(), HttpStatus.OK);
	}

	@DeleteMapping("/{id}")
	public HttpStatus deleteEmployeeById(@PathVariable("id") Long id) {
		userService.deleteUserEntity(id);
		return HttpStatus.FORBIDDEN;
	}
	
	@PostMapping("/validate")
	public ResponseEntity<LoginDto> validateUser(@RequestBody LoginDto loginDto){
		return new ResponseEntity<LoginDto>(userService.validateUser(loginDto), new HttpHeaders(), HttpStatus.OK);
	}

}
