package com.curd.example.runner;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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
		/*try {
			// create entity class object
			CoronaVaccine vaccine = new CoronaVaccine(null, "Covisheld", "Serum", "India", 500.0, 2);
			// call business method:
			System.out.println(service.registerVacine(vaccine));
		} catch (DataAccessException dae) {
			dae.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}*/
		
		// Batch Insertion
		/*List<CoronaVaccine>vaccineToStore = new ArrayList<>();
		vaccineToStore.add(new CoronaVaccine(null,"Sputnik","RussianCompan","Russia",298.9,2));
		vaccineToStore.add(new CoronaVaccine(null,"Pyzer","Pyzer","USA",560.9,2));
		vaccineToStore.add(new CoronaVaccine(null,"moderena","moderena","USA",870.9,2));*/
		
//		List<CoronaVaccine>listVaccine = service.registerInBatch(vaccineToStore);
		
		// Using Arrays.asList(-) method
		/*List<CoronaVaccine>listVaccine = service.registerInBatch(Arrays.asList(new CoronaVaccine(null,"Sputnik","RussianCompan","Russia",298.9,2),
				new CoronaVaccine(null,"Pyzer","Pyzer","USA",560.9,2),
				new CoronaVaccine(null,"moderena","moderena","USA",870.9,2)));
		
		System.out.println("The Regestration No are: ");
		listVaccine.forEach(vaccine -> System.out.println(vaccine.getRegNo()));*/
		
		System.out.println("Record Count: " + service.getVaccineCount());
	}
	

}
