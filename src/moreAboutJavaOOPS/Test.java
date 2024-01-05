package moreAboutJavaOOPS;

public class Test {
	

	public static void main(String[] args) {
		
		Address address = new Address("Flat no: 1908, Modern Colony", "Delhi", 111010);
		
		System.out.println(address.getDetails());
		
		System.out.println("===============================employee object=============================");
		
		Employee employee = new Employee("Flat no: 9090, John Colony", "USA", 786543);	
		
		System.out.println(employee.getDetails());		
		
	}

}
