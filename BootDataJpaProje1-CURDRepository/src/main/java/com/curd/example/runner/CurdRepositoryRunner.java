package com.curd.example.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Component;

import com.curd.example.entity.CoronaVaccine;
import com.curd.example.service.ICoronaVaccineManagementService;

@Component
public class CurdRepositoryRunner implements CommandLineRunner {

	@Autowired
	private ICoronaVaccineManagementService service;

	@Override
	public void run(String... args) throws Exception {
		try {
			// create entity class object
			CoronaVaccine vaccine = new CoronaVaccine(null, "Covisheld", "Serum", "India", 500.0, 2);
			// call business method:
			System.out.println(service.registerVacine(vaccine));
		} catch (DataAccessException dae) {
			dae.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
