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
		// Get access to IOC container
		ApplicationContext ctx = SpringApplication.run(BootDataJpaProje1CurdRepositoryApplication.class, args);
		// Get Service class object
		ICoronaVaccineManagementService service = ctx.getBean("vaccineManagementService", CoronaVaccineManagementServiceImpl.class);
		
		try {
			// create entity class object
			CoronaVaccine vaccine = new CoronaVaccine(null,"Covaxin","Bharat BioTech","India",780.0, 2);
			// call business method:
			System.out.println(service.registerVacine(vaccine));
		} catch (DataAccessException dae) {
			dae.printStackTrace();
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		// close Container
		((ConfigurableApplicationContext) ctx).close();
	}

}

/*
 NOTE: Spring JDBC internally uses plain JDBC and translate SqlException to DataAccessException class hierarchy exceptions.
 Spring ORM internally uses plain ORM like hibernate and translates ORM S/w specific Exception to DataAccessException class hierarchy exceptions
 Spring data JPA internally uses plain ORM s/w like hibernate and translates ORM S/w specific Exception to DataAccessException class hierarchy exceptions
 Spring mongo DB Internally uses mongo DB api and translate Monogo DB api specific exceptions to DataExcessException class hierarchy exceptions
 All these are internally using exception re-throwing.
*/