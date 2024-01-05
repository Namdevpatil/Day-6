package moreAboutJavaOOPS;

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
	
	public Employee(String address, String city, long pincode) 
	{
		super(address, city, pincode);
	}
	
	//blocks 
	static
	{
		countryCode = "+91";
	}

	public String getEmployee() 
	{
		return "Employee [id=" + id + ", name=" + name + "]";
	}
	
	//static method
	public static String getCountryCode()
	{
		return countryCode;
	}

	
}
