package org.kir;

public class MethodOverloadTest {

	public void testMethod() {

		System.out.println("no arguments has been passed");
	}

	public void testMethod(int n) {

		System.out.println("Integer Value is " + n);
	}

	public void testMethod(int n, String s) {

		System.out.println("The integer value is " + n + "The string valus is " + s);
	}

	public void testMethod(int n, String s, boolean bool) {

		System.out.println("The integer value is " + n + "The string valus is " + s + "the boolean value is " + bool);
	}

	public static void main(String[] args) {
		MethodOverloadTest obj = new MethodOverloadTest();

		obj.testMethod(90);

		obj.testMethod();

		obj.testMethod(90, "hello");

		obj.testMethod(90, "hello", true);

	}

}
