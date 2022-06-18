package com.example.spring_demo.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.example.spring_demo.Entity.Employee;  

  
public interface EmployeeRepository extends JpaRepository<Employee, String>  
{  
}  