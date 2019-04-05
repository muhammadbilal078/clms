package com.carloanmanagementsystem.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the car_companies database table.
 * 
 */
@Entity
@Table(name="car_companies")
@NamedQuery(name="CarCompany.findAll", query="SELECT c FROM CarCompany c")
public class CarCompany implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	private String name;

	//bi-directional many-to-one association to Car
	@OneToMany(mappedBy="carCompany")
	private List<Car> cars;

	public CarCompany() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "CarCompany [id=" + id + ", name=" + name + ", cars=" + cars + "]";
	}

	public List<Car> getCars() {
		return this.cars;
	}

	public void setCars(List<Car> cars) {
		this.cars = cars;
	}

	public Car addCar(Car car) {
		getCars().add(car);
		car.setCarCompany(this);

		return car;
	}

	public Car removeCar(Car car) {
		getCars().remove(car);
		car.setCarCompany(null);

		return car;
	}

}