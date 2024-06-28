package org.kir;

public class SupperClassMethodB extends SuperClassA{
	public void methodA() {
//		System.out.println("ClassBMehtodA");
		super.methodA();
		int a =20;
		
		System.out.println(a);
	}

	public void methodB() {
		System.out.println("ClassBMehtodB");
	}
	public static void main(String[] args) {
		SupperClassMethodB obj = new SupperClassMethodB();

		obj.methodA();

		obj.methodB();

	}

}
