package com.carloanmanagementsystem.controller;

import java.security.Principal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.amazonaws.util.json.JSONArray;
import com.amazonaws.util.json.JSONException;
import com.amazonaws.util.json.JSONObject;
import com.carloanmanagementsystem.dao.CarRepo;
import com.carloanmanagementsystem.model.Car;
import com.carloanmanagementsystem.model.User;
import com.carloanmanagementsystem.service.UserService;

@Controller
public class UserController {

	@Autowired
	private UserService userService;

	@Autowired
	private CarRepo carRepo;

	@RequestMapping(value = "/dashboard", method = RequestMethod.GET)
	public ModelAndView dashboard(Principal principal) throws JSONException {

		//Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		//auth.ge 
		//String userr = SecurityContextHolder.getContext().getAuthentication().getPrincipal().toString();
		String id = principal.getName(); //get logged in username
		User loggedInUser = userService.findUserById(Integer.parseInt(id));
		ModelAndView model = new ModelAndView();

		if(loggedInUser.getType().equalsIgnoreCase("Manager")) {
			
			Iterable<Car> car = carRepo.findAll();
			//car.
			JSONObject obj = new JSONObject();
			JSONArray array = new JSONArray();

			for(Car c : car) {
				JSONObject obj2 = new JSONObject();
				//obj.put("company", c.getCarCompany().getName());
				obj2.put("carId", c.getId());
				obj2.put("estimatedTax", c.getEstimated_tax());
				obj2.put("incomeEstimationCharges", c.getIncome_estimation_charges());
				obj2.put("documentationCharges", c.getDocumentation_charges());
				obj2.put("proessingCharges", c.getProcessing_charges());
				obj.append("car", obj2);
				array.put(obj2);
			} 
			
			int size = array.length();
			model.addObject("cars", array.toString());
			model.addObject(array.toString());
			//model.addObject
			model.addObject("size", size);
			model.addObject("user", loggedInUser);

			model.setViewName("manager");
		}
		else  if(loggedInUser.getType() == "Admin") {

		}
		else  if(loggedInUser.getType() == "Car Dealer") {

		}

		//System.out.println(id);

		//model.addObject("users", userService.getUsers());
		//model.addObject("user", principal.getName() );

		//principal.getClass().get
		return model;
	}

}
