package com.projectOverview.controller;

public class Project {
		
	
	private String name;
	private String owner;
	private String state;
	
	public Project() {
		
	}
	
	public Project(String name, String owner, String state) {
		super();
		this.name = name;
		this.owner = owner;
		this.state = state;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}
	
}
