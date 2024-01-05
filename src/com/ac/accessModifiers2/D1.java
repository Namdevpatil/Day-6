package com.ac.accessModifiers2;

import java.util.Scanner;

import com.ac.accessModifiers1.A1;

public class D1 extends A1
{
	Scanner scanner;
	
	@Override
	public String toString() 
	{
		return "D1 [country=" + country + "]";//The field A1.country is not visible
	}

}
