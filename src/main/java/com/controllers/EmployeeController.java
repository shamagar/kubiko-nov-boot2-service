package com.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.entity.EmployeeEntity;
import com.repository.EmployeeRepository;
import com.service.EmployeeService;

@Controller

public class EmployeeController {
	
	@Autowired
	EmployeeRepository employeeRepository;
	
	@Autowired
	EmployeeService employeeService;
	
	
	
	@GetMapping("/")
	String displayLoginPageByDefault(){
		
		return "login";
		
	}	
	
	
	
	@GetMapping("/login")
	String displayLoginPage(){
		
		return "login";
		
	}	
	
	@GetMapping("/registration")
	String displayRegistrationPage(){
		
		return "registration";//registration.jsp
		
	}
	//using service layer
	@PostMapping("/registration")
	String doRegistration(@ModelAttribute EmployeeEntity employeeEntity){		
		//employeeRepository.save(employeeEntity);
		
		employeeService.saveEmp(employeeEntity);
		
		return "registration";//registration.jsp
		
	}
	
	//using service layer
	@PostMapping("/login")
	String doLogin(@RequestParam String email,@RequestParam String pswd,Model model){	
		EmployeeEntity employeeEntity=employeeService.findBymailPass(email,pswd);
		
		if(employeeEntity !=null) {
			model.addAttribute("employeeEntity", employeeEntity);
			
			return "congrates";
			
		}
		else {
			
			model.addAttribute("invalidLoginMsg", "plz try again");
			return "login";
			
		}		
		
	}
	
	@GetMapping("/fetchAllRecords")
	String fetchAllData(Model model){
		//fetch all data
		List<EmployeeEntity> lisOfEmployees=employeeRepository.findAll();
		System.out.println(lisOfEmployees);
		//data to be send to jsp
		model.addAttribute("lisOfEmployees", lisOfEmployees);
		
		//go to showAll.jsp
		
		return "showAll";
		
	}
	
	@GetMapping("/deleteEmployee")
	String deleteEmployee(@RequestParam int employeeId){
		
		employeeRepository.deleteById(employeeId);	
		
		return "redirect:/fetchAllRecords";//registration.jsp
		
	}
	
	@GetMapping("/displayEditForm")
	String displayEditForm(@RequestParam int employeeId,Model model){
		
		EmployeeEntity employeeEntity=null;
		Optional<EmployeeEntity> optional=employeeRepository.findById(employeeId);	
		if(optional.isPresent()) {
			 employeeEntity=optional.get();
		}
		
		
		model.addAttribute("employeeEntity", employeeEntity);
		return "edit";
		
	}
	
	@PostMapping("/updateEmployee")
	String doUpdation(@ModelAttribute EmployeeEntity employeeEntity){		
		employeeRepository.save(employeeEntity);		
		return "redirect:/fetchAllRecords";
		
	}	
	
}
