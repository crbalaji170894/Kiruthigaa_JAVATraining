package org.kir;

public class ParentClass {

	String s = "Hello";

	public void methodOne() {
		System.out.println("Method One");
	}

	public void mehtodTwo() {
		System.out.println("Method Two");
	}

	public void methodThree() {
		System.out.println("Method Three");
	}

	public void methodFour() {
		System.out.println("Method Four");
	}

	public static void main(String[] args) {
		ParentClass object = new ParentClass();

		object.methodOne();

		object.mehtodTwo();

		object.methodThree();

		object.methodFour();

	}

}
