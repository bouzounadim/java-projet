package com.example.demo.model;

import java.sql.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import org.springframework.data.repository.NoRepositoryBean;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Teacher  extends User {

	@OneToMany(mappedBy = "teacher", cascade = CascadeType.ALL)
    private Set<Groupe> group;
	
	private String a;
	private String abc ;
	    public Teacher (int user_id, String username, String email, String password , Number phone, String adresse , String state , Date created_at, String role) {
	        super(user_id, username,email,password,phone,adresse,state,created_at,role);
	        this.setRole("teacher");
	    }
	
	
  
}
