package com.example.spring_demo.Entity;

import javax.persistence.Column;  
import javax.persistence.Entity;  
import javax.persistence.Id;  
import javax.persistence.Table;  
//mark class as an Entity   
@Entity  
//defining class name as Table name  
@Table  
public class Employee   
{  
//mark id as primary key  
@Id  
//defining id as column name  
@Column  
private String soeid;  
//defining name as column name  
@Column  
private String name;  
//defining age as column name  
@Column  
private int age;  
//defining email as column name  
@Column  
private String email;

@Column  
private String phone_number;



public String getSoeid()   
{  
return soeid;  
}  
public void setSoeid(String soeid)   
{  
this.soeid = soeid;  
}  
public String getName()   
{  
return name;  
}  
public void setName(String name)   
{  
this.name = name;  
}  
public int getAge()   
{  
return age;  
}  
public void setAge(int age)   
{  
this.age = age;  
}  
public String getEmail()   
{  
return email;  
}  
public void setEmail(String email)   
{  
this.email = email;  
}  

public String getPhone_number() {
	return phone_number;
}
public void setPhone_number(String phone_number) {
	this.phone_number = phone_number;
}

}  
