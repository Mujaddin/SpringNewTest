package com.mitrais.spring;

public class Employee {
	private String name;
	private String gender;

	public Employee(String name, String gender) {
		this.name = name;
		this.gender = gender;
	}

	public Employee() {

	}

	public void setName(String name) {
		this.name = name;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getName() {
		return name;
	}

	public String getGender() {
		return gender;
	}

}
