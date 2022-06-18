package com.example.spring_demo.services;

import java.util.ArrayList;  
import java.util.List;  
import org.springframework.beans.factory.annotation.Autowired;  
import org.springframework.stereotype.Service;

import com.example.spring_demo.Entity.Employee;
import com.example.spring_demo.repository.EmployeeRepository;  
 
@Service  
public class EmployeeService   
{  
@Autowired  
EmployeeRepository employeeRepository;  
//getting all student records  
public List<Employee> getAllEmployees()   
{  
List<Employee> employees = new ArrayList<Employee>();  
employeeRepository.findAll().forEach(employee -> employees.add(employee));  
return employees;  
}  
//getting a specific record  
public Employee getEmployeeBySoeid(String soeid)   
{  
return employeeRepository.findById(soeid).get();  
}  
public void saveOrUpdate(Employee employee)   
{  
employeeRepository.save(employee);  
}  
//deleting a specific record  
public void delete(String soeid)   
{  
employeeRepository.deleteById(soeid);  
}  
}  
