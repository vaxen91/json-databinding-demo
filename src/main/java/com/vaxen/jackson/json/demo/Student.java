package com.vaxen.jackson.json.demo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import java.util.List;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class Student {
	
	private int id;
	private String firstName;
	private boolean active;
	private String lastName;
	private Address address;
	private List<String> languages;
	
	public Student() {
		
	}

}
