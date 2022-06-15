package com.curd.example.service;

import java.util.List;

import com.curd.example.entity.CoronaVaccine;

public interface ICoronaVaccineManagementService {
	
	public String registerVacine(CoronaVaccine vaccine);
	public List<CoronaVaccine>registerInBatch(List<CoronaVaccine> vaccines);

}
