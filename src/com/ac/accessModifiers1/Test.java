package com.ac.accessModifiers1;

public class Test {

	public static void main(String[] args) {

		A1 a1 = new A1();
		a1.setName("Hello");

		System.out.println(a1.toString());

		System.out.println("---------------------");

		B1 b1 = new B1();
		b1.setName("Hi");
		System.out.println(b1.toString());

		System.out.println("---------------------");

		B2 b2 = new B2();
		b2.setName("Hey");
		System.out.println(b2.toString());

	}

}
