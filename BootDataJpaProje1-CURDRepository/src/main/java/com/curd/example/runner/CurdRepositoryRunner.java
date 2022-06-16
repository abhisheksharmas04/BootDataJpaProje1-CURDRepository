package com.curd.example.runner;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

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
		System.out.println("----------------------------------------------------------------------------");
		
		try {
			Iterable<CoronaVaccine>itList = service.fetchAllDetails();
			itList.forEach(vaccine -> {
				System.out.println(vaccine);
			});
			System.out.println("----------------------------------------------------------------------------");
			service.fetchAllDetails().forEach(vaccine -> System.out.println(vaccine));
			
			// using method reference:
			System.out.println("----------------------------------------------------------------------------");
			service.fetchAllDetails().forEach(System.out::println);
			System.out.println("----------------------------------------------------------------------------");
			Optional<CoronaVaccine>opt = service.fetchVaccineById(22L);
			if(opt.isEmpty()) {
				System.out.println(opt.get());
			}else {
				System.out.println("Record not found");
				opt.orElseThrow(()-> new IllegalArgumentException("Record Not Found")); 
			}
			// THROW EXCPETION USING OPTIONAL
			CoronaVaccine opt2 = service.fetchVaccineById(22L).
					orElseThrow(()->new IllegalArgumentException("Record Not available"));
			System.out.println(opt2);
			
			// or else
			CoronaVaccine vaccine1 = service.fetchVaccineById(22L).orElse(new CoronaVaccine());
			
		} catch (DataAccessException dae) {
			dae.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	

}
