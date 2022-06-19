package com.example.spring_demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.spring_demo.Entity.Credentials;
import com.example.spring_demo.Entity.Employee;
import com.example.spring_demo.services.AuthService;
import com.example.spring_demo.services.EmployeeService;

@CrossOrigin(origins="http://localhost:4200")
@RestController 
public class AuthController {

	private String password, role;
	
	@Autowired  
	AuthService authService;  

	
	
	//creating post mapping that post the employee detail in the database  
	@GetMapping("/api/auth/{soeid}")  
	private Credentials authEmployee(@PathVariable("soeid") String soeid)   
	{  
		return (authService.getRecordBySoeid(soeid));    
		
		
  
	}

}
