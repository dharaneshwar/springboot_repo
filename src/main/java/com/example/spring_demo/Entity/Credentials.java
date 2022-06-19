package com.example.spring_demo.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;



	  
@Entity  
	 
@Table  
public class Credentials   
{  

	@Id  

	@Column  
	private String soeid;  

	@Column  
	private String password;  

	@Column  
	private String role;
	
	 
		public String getSoeid() {
			return soeid;
		}


		public void setSoeid(String soeid) {
			this.soeid = soeid;
		}


		public String getPassword() {
			return password;
		}


		public void setPassword(String password) {
			this.password = password;
		}


		public String getRole() {
			return role;
		}


		public void setRole(String role) {
			this.role = role;
		}

}
