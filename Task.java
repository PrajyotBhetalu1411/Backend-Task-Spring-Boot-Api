package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Task {
	
	@Id
    private Long id;
    private String task;
	

	@Override
	public String toString() {
		return "Task [id=" + id + ", task=" + task + "]";
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTask() {
		return task;
	}

	public void setTask(String task) {
		this.task = task;
	}

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
