package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.dao.PatientRepository;

@SpringBootApplication
public abstract class DemoApplication implements CommandLineRunner {
	
	@Autowired
	PatientRepository patientRepository;

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		patientRepository.findAll().forEach(System.out::println);
		
	}
}
