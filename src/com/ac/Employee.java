package com.ac;

//Inheritance
public class Employee extends Address//Employee is a sub/child class and Address is super/parent class
{
	
	//non-static fields
	private int id;
	private String name;
	
	//static fields
	public  static String countryCode;

	
	//constructors	
	public Employee() 
	{
		
	}
	
	public Employee(int id, String name) {
		this.id = id;
		this.name = name;
	}



	//blocks 
	static
	{
		countryCode = "+91";
	}

	//re implementation
	public String getDetails() 
	{
		return "Employee [id=" + id + ", name=" + name + "]";
	}
	
	//static method
	public static String getCountryCode()
	{
		return countryCode;
	}

	
}
