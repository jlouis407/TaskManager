package com.example.demo;


import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.model.Task;
import com.example.demo.model.User;
import com.example.demo.service.TaskService;
import com.example.demo.service.UserService;

@SpringBootTest
class TaskManagerApplicationTests {

	@Autowired
	private UserService userService;
	
	@Autowired
	private TaskService taskService;
	
	@Before
	public void initDb() {
		{
			User newUser = new User("testUser@mail.com", "testUser", "123456");
			userService.createUser(newUser);
		}
		{
			User newUser = new User("testAdmin@mail.com", "testAdmin", "123456");
			userService.createUser(newUser);
		}
		
		Task userTask = new Task("1/10/2022", "00:11", "11:00", "You need to work today.");
		User user = userService.findUser("testUser@mail.com");
		taskService.addTask(userTask, user);
	}

}
