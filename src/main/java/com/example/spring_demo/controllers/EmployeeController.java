package com.example.spring_demo.controllers;

import java.util.List;  
import org.springframework.beans.factory.annotation.Autowired;  
import org.springframework.web.bind.annotation.DeleteMapping;  
import org.springframework.web.bind.annotation.GetMapping;  
import org.springframework.web.bind.annotation.PathVariable;  
import org.springframework.web.bind.annotation.PostMapping;  
import org.springframework.web.bind.annotation.RequestBody;  
import org.springframework.web.bind.annotation.RestController;

import com.example.spring_demo.Entity.Employee;
import com.example.spring_demo.services.EmployeeService;  
 
//creating RestController  
@RestController  
public class EmployeeController   
{  
//autowired the StudentService class  
@Autowired  
EmployeeService employeeService;  
//creating a get mapping that retrieves all the students detail from the database   
@GetMapping("/api/employees")  
private List<Employee> getAllEmployees()   
{  
return employeeService.getAllEmployees();  
}  
//creating a get mapping that retrieves the detail of a specific student  
@GetMapping("/api/employees/{soeid}")  
private Employee getEmployee(@PathVariable("soeid") String soeid)   
{  
return employeeService.getEmployeeBySoeid(soeid);  
}  
//creating a delete mapping that deletes a specific student  
@DeleteMapping("/api/employees/{soeid}")  
private List deleteEmployee(@PathVariable("soeid") String soeid)   
{  
employeeService.delete(soeid);  
return employeeService.getAllEmployees();

}  
//creating post mapping that post the student detail in the database  
@PostMapping("/api/employees")  
private List saveEmployee(@RequestBody Employee employee)   
{  
	employeeService.saveOrUpdate(employee);  
	return employeeService.getAllEmployees();  
}  
}  