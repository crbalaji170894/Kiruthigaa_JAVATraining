package org.kir;

public class ConstructorTest {

	public ConstructorTest() {// default constructor
		System.out.println("This is Default Constructor");
	}
	
	
	public ConstructorTest(int a) {// default constructor
		System.out.println("This is parameterized Constructor");
	}

	public static void main(String[] args) {
		ConstructorTest constructorObj = new ConstructorTest();
		
		ConstructorTest constructorObj1 = new ConstructorTest(10);
		
		
	}
}
