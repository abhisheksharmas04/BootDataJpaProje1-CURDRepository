package com.curd.example.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.curd.example.entity.CoronaVaccine;

@Repository
public interface CoronaVaccineRepo extends CrudRepository<CoronaVaccine, Long> {

}
