package org.kir;

public class SuperClassA {

	int a ;

	public void methodA() {
		System.out.println("ClassAMehtodA");
		
		 a =10;
	}

	public void methodB() {
		System.out.println("ClassAMehtodB");
	}

	public static void main(String[] args) {
		SuperClassA obj = new SuperClassA();

		obj.methodA();

		obj.methodB();
	}

}
