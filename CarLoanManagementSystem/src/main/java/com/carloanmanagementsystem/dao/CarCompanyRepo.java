package com.carloanmanagementsystem.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.repository.CrudRepository;

import com.carloanmanagementsystem.model.CarCompany;
public interface CarCompanyRepo extends CrudRepository<CarCompany, Long>{
	//List<CarCompany> getCarCompany
	///@Query(value = "SELECT car_company.* FROM car_company", nativeQuery = true)
	//public List<CarCompany> findCarCompanies();

}
