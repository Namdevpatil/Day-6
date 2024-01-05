package methodOverriding;

public class Test 
{
	
	public static void main(String[] args) 
	{
		
		Address address = new Address("Flat no: 1908, Modern Colony", "Delhi", 111010);
		
		System.out.println(address.getDetails());
		
		System.out.println(address.getClass().getSimpleName());
		
		System.out.println("===============================employee object=============================");
		
		Employee employee = new Employee(9090, "Satish Reddy");	
		
		System.out.println(employee.getDetails());		
		
		System.out.println(employee.getClass().getSimpleName());
		
	}

}
