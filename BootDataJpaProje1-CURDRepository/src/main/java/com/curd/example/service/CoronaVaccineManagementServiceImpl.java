package com.curd.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.curd.example.entity.CoronaVaccine;
import com.curd.example.repo.CoronaVaccineRepo;

@Service("vaccineManagementService")
public class CoronaVaccineManagementServiceImpl implements ICoronaVaccineManagementService {
	
	@Autowired
	private CoronaVaccineRepo coronaRepo;

	@Override
	public String registerVacine(CoronaVaccine vaccine) {
		System.out.println("In-Memory proxy class name: " + coronaRepo.getClass());
		// use coronaRepo
		CoronaVaccine savedVaccine = coronaRepo.save(vaccine);
		return savedVaccine !=null ?"Vaccine Registered/Updated Successfully with " + savedVaccine.getRegNo()
			:"Vaccine Registration/Updated Failed.";
	}

	@Override
	public List<CoronaVaccine> registerInBatch(List<CoronaVaccine> vaccines) {
		if(vaccines != null)
			return (List<CoronaVaccine>) coronaRepo.saveAll(vaccines);
		else
			throw new IllegalArgumentException("Batch insertion not done");
	}

	@Override
	public Long getVaccineCount() {
		return coronaRepo.count();
	}

}
