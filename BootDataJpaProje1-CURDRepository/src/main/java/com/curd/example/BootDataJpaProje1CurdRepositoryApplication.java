package com.curd.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.dao.DataAccessException;

import com.curd.example.entity.CoronaVaccine;
import com.curd.example.service.CoronaVaccineManagementServiceImpl;
import com.curd.example.service.ICoronaVaccineManagementService;

@SpringBootApplication
public class BootDataJpaProje1CurdRepositoryApplication {

	public static void main(String[] args) {
		SpringApplication.run(BootDataJpaProje1CurdRepositoryApplication.class, args);
	}

}