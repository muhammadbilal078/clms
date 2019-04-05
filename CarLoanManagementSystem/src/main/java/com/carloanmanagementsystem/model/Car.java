package com.carloanmanagementsystem.model;

import java.io.Serializable;
import javax.persistence.*;

import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


/**
 * The persistent class for the cars database table.
 * 
 */
@Entity
@Table(name="cars")
@NamedQuery(name="Car.findAll", query="SELECT c FROM Car c")
public class Car implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	private String color;

	private String name;

	private int price;

	private int year;
	
	private int estimated_tax;
	private int income_estimation_charges;
	private int documentation_charges;
	private int processing_charges;

	public int getEstimated_tax() {
		return estimated_tax;
	}

	public void setEstimated_tax(int estimated_tax) {
		this.estimated_tax = estimated_tax;
	}

	public int getIncome_estimation_charges() {
		return income_estimation_charges;
	}

	public void setIncome_estimation_charges(int income_estimation_charges) {
		this.income_estimation_charges = income_estimation_charges;
	}

	public int getDocumentation_charges() {
		return documentation_charges;
	}

	public void setDocumentation_charges(int documentation_charges) {
		this.documentation_charges = documentation_charges;
	}

	public int getProcessing_charges() {
		return processing_charges;
	}

	public void setProcessing_charges(int processing_charges) {
		this.processing_charges = processing_charges;
	}

	//bi-directional many-to-one association to CarCompany
	@ManyToOne
	@JoinColumn(name="company_id")
	private CarCompany carCompany;

	public Car() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getColor() {
		return this.color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return this.price;
	}

	@Override
	public String toString() {
		return "Car [id=" + id + ", color=" + color + ", name=" + name + ", price=" + price + ", year=" + year
				+ ", estimated_tax=" + estimated_tax + ", income_estimation_charges=" + income_estimation_charges
				+ ", documentation_charges=" + documentation_charges + ", processing_charges=" + processing_charges
				+ ", carCompany=" + carCompany + "]";
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getYear() {
		return this.year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public CarCompany getCarCompany() {
		return this.carCompany;
	}

	public void setCarCompany(CarCompany carCompany) {
		this.carCompany = carCompany;
	}

}