package com.spring.bl;

public class EmployeeFactory {

	public Employee getEmployeeObject(int id,String username,int age,String location)
	{
		System.out.println("Factory getEmployeeObject method called");
		return new Employee(id,username,age,location);
	}
}
