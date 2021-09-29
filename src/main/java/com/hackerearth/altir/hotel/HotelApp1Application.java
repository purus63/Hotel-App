package com.hackerearth.altir.hotel;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.hackerearth.altir.hotel.entity.UserEntity;
import com.hackerearth.altir.hotel.repository.UserRepository;

import lombok.extern.slf4j.Slf4j;

@SpringBootApplication
@Slf4j
public class HotelApp1Application implements CommandLineRunner{

	@Autowired
	UserRepository userRepository;
	
	
	public static void main(String[] args) {
		SpringApplication.run(HotelApp1Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		log.info("Springboot CommandlineRunner run method ");

		UserEntity user = UserEntity.builder().name("Purushottam").role("User").token(String.valueOf(Math.random())).build();
		UserEntity admin = UserEntity.builder().name("Subham").role("Admin").token(String.valueOf(Math.random())).build();
		userRepository.save(user);
		userRepository.save(admin);	
		
	}
	
}
