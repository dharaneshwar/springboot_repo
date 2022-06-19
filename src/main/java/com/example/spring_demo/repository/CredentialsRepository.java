package com.example.spring_demo.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.example.spring_demo.Entity.Credentials;  


public interface CredentialsRepository extends JpaRepository<Credentials, String> {

}
