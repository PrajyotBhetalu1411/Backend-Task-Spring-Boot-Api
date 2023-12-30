package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity

public class Task {
	@Id
    private Long id;
    private String task;
	

	public Object getDescription() {
		// TODO Auto-generated method stub
		return null;
	}

	public void setDescription(Object description) {
		// TODO Auto-generated method stub
		
	}

	public Object isCompleted() {
		// TODO Auto-generated method stub
		return null;
	}

	public void setCompleted(Object completed) {
		// TODO Auto-generated method stub
		
	}

}
