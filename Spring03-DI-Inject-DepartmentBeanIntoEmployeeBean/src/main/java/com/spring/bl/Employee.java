package com.spring.bl;

public class Employee {

	private int id;
	private String username;
	private int age;
	private String location;
	private Department department;

	public Employee(int id, String username, int age, String location) {
		this.id = id;
		this.username = username;
		this.age = age;
		this.location = location;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String name) {
		this.username = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}
	
	public void setDepartment(Department department) {
		this.department = department;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", username=" + username + ", age=" + age
				+ ", location=" + location + ", department=" + department + "]";
	}

	
}
