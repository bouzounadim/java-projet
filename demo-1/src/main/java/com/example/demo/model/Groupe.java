package com.example.demo.model;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Groupe {
	
	 @Id
	 @GeneratedValue(strategy = GenerationType.AUTO)
	private long groupe_id;
	private String name;
	private Date year;
	
	    @ManyToOne
	    @JoinColumn(name="teacher_id", nullable=false)
	    private Teacher teacher;

}
