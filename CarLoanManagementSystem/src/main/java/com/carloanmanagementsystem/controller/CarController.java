package com.carloanmanagementsystem.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.amazonaws.util.json.JSONArray;
import com.amazonaws.util.json.JSONException;
import com.amazonaws.util.json.JSONObject;
import com.carloanmanagementsystem.dao.CarCompanyRepo;
import com.carloanmanagementsystem.dao.CarRepo;
import com.carloanmanagementsystem.model.Car;
import com.carloanmanagementsystem.model.CarCompany;

@RestController
public class CarController {

	@Autowired
	CarRepo carRepo;
	
	@Autowired
	CarCompanyRepo carCompanyRepo;
	
	@RequestMapping("/getcars")
	public String findAll() throws JSONException {

		//ArrayList<Car> cars = null;
		JSONArray array = new JSONArray();
		
		Iterable<Car> cars = carRepo.findAll();
		Iterable<CarCompany> carCompanies = carCompanyRepo.findAll();
		//System.out.print(cars.toString());
		 
		for(CarCompany cm : carCompanies) {
			
			//List<Car> cl = c.getCarCompany().getCars();
			JSONObject obj = new JSONObject();
			obj.put("companyName", cm.getName());
			//obj.put("cars", cm.getCars());
			//obj.put("company", cm.getName());
			for(Car c : cm.getCars()) {
				JSONObject obj2 = new JSONObject();
				//obj.put("company", c.getCarCompany().getName());
				obj2.put("carName", c.getName());
				obj2.put("year", c.getYear());
				obj2.put("color", c.getColor());
				obj2.put("price", c.getPrice());
				obj2.put("estimatedTax", c.getEstimated_tax());
				obj2.put("incomeEstimationCharges", c.getIncome_estimation_charges());
				obj2.put("documentationCharges", c.getDocumentation_charges());
				obj2.put("proessingCharges", c.getProcessing_charges());
			
				obj.append("car", obj2);
			}
			array.put(obj);
		}
		return array.toString();
	}
}