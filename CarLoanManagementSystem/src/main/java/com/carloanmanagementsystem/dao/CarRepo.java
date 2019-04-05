package com.carloanmanagementsystem.dao;

import java.util.List;

import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.repository.CrudRepository;

import com.carloanmanagementsystem.model.Car;

public interface CarRepo extends CrudRepository<Car, Long> {
	
	//List<Car> findByMake(String make);

}
