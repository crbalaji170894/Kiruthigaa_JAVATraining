package org.kir;

public class ArraysTest {

	int a = 10;

	// i need to store multiple values irrespective same data type in a single
	// variable we go for arrays.

	// int[] b = {10, 20 , 30, 40, 50 , 60};// index based 0 to n-1

	int c[] = new int[5];

	public void testMethod() {
		int c[] = new int[5];
		c[0] = 10;
		c[1] = 20;
		c[2] = 30;
		c[3] = 40;
		c[4] = 50;
//		c[5] = 60;
//		for (int eachValue : c) {
//			System.out.println(eachValue);
//		}
		
		System.out.println(c[2]);
	}

	public static void main(String[] args) {
		ArraysTest obj = new ArraysTest();
		obj.testMethod();
	}

}
