package com.example.demo.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.boot.context.properties.ConstructorBinding;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private int user_id;
    
    @Column(name = "first_name", nullable = false)
	private String username;
    
    @Column(name = "email", nullable = false)
	private String email;
    
    @Column(name = "password", nullable = false)
	private String password;
    
    @Column(name = "phone", nullable = false)
 	private Number phone;
    

    @Column(name = "adress", nullable = false)
 	private String adresse;
    
    @Column(name = "state", nullable = false)
 	private String state;
    
    @Column(name = "created_at", nullable = false)
	private Date created_at;
   
  
    @Column(name = "role", nullable = false)
 	private String role;
    

}
