package com.ac.accessModifiers1;

public class A1 {
	
	//private String name;//private: scope of the private is within a class
	String name;//default: scope of the default is within a package

	protected String country;
	
	public A1() {
		// TODO Auto-generated constructor stub
	}
		
	public A1(String name) {
		this.name = name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() 
	{
		return "A1 [name=" + name + "]";
	}

}
