package com.ac;

public class Address
{	
	private String address;
	private String city;
	private long pincode;
	
	public Address() {
		// TODO Auto-generated constructor stub
	}

	public Address(String address, String city, long pincode) {
		this.address = address;
		this.city = city;
		this.pincode = pincode;
	}

	//original implementation
	public String getDetails() 
	{
		return "Address [address=" + address + ", city=" + city + ", pincode=" + pincode + "]";
	}
	
}
