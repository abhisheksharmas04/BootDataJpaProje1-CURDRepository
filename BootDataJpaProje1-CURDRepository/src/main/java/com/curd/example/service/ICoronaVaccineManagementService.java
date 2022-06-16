package com.curd.example.service;

import java.util.List;
import java.util.Optional;

import com.curd.example.entity.CoronaVaccine;

public interface ICoronaVaccineManagementService {
	
	public String registerVacine(CoronaVaccine vaccine);
	public List<CoronaVaccine>registerInBatch(List<CoronaVaccine> vaccines);
	public Long getVaccineCount();
	public Iterable<CoronaVaccine>fetchAllDetails();
	public Iterable<CoronaVaccine>fetchAllByIds(List<Long>ids);
	public Optional<CoronaVaccine>fetchVaccineById(Long regNo);

}
