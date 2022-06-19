package com.example.spring_demo.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.spring_demo.Entity.Credentials;
import com.example.spring_demo.Entity.Employee;
import com.example.spring_demo.repository.CredentialsRepository;


@Service  
public class AuthService   
{  
@Autowired  
CredentialsRepository credRepository;  
//getting all student records  


//getting a specific record  
public Credentials getRecordBySoeid(String soeid)   
{  
return credRepository.findById(soeid).get();  
}  
	
	
	
}
