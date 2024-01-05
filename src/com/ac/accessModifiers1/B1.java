package com.ac.accessModifiers1;

public class B1 extends A1
{
	
	@Override
	public String toString() 
	{
		return "B1 [name=" + name + "]";//The field A1.name is not visible
	}

}
