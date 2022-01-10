package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tasks")
public class Task {
	
	@Id
	@GeneratedValue
	private Long id;
	
	@Column(name = "date")
	private String date;
	
	@Column(name = "start_time")
	private String startTime;
	
	@Column(name = "stop_time")
	private String stopTime;
	
	@Column(name = "description")
	private String description;
	
	@ManyToOne
	@JoinColumn(name = "USER_EMAIL")
	private User user;
	
	public Task() {
		
	}
	
	public Task(String date, String startTime, String stopTime, String description) {
		this.date = date;
		this.startTime = startTime;
		this.stopTime = stopTime;
		this.description = description;
	}
	
	public Task(Long id, String date, String startTime, String stopTime, String description, User user) {
		this.id = id;
		this.date = date;
		this.startTime = startTime;
		this.stopTime = stopTime;
		this.description = description;
		this.user = user;
	}

	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getDate() {
		return date;
	}
	
	public void setDate(String date) {
		this.date = date;
	}
	
	public String getStartTime() {
		return startTime;
	}
	
	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}
	
	public String getStopTime() {
		return stopTime;
	}
	
	public void setStopTime(String stopTime) {
		this.stopTime = stopTime;
	}
	
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	public User getUser() {
		return user;
	}
	
	public void setUser(User user) {
		this.user = user;
	}
	
	

}
