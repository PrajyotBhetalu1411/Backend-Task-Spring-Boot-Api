package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Task;
import com.example.demo.repository.TaskRepository;

@Service
public class TaskService {
	
	@Autowired
	private TaskRepository taskRepository;

	public static Task save(Task task) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Task> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	public Object findById(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	public void delete(String id) {
		// TODO Auto-generated method stub
		
	}

	public List<Task> findAll1() {
		// TODO Auto-generated method stub
		return null;
	}

	public Task save1(Task task) {
		// TODO Auto-generated method stub
		return null;
	}
	

}
