package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.model.Task;
import com.example.demo.model.User;
import com.example.demo.repository.TaskRepository;

@Service
public class TaskService {
	
	private TaskRepository taskRepository;
	
	public void addTask(Task task, User user) {
		task.setUser(user);
		taskRepository.save(task);
	}
	
	public List<Task> findUserTask(User user){
		
		return taskRepository.findByUser(user);
	}

}
