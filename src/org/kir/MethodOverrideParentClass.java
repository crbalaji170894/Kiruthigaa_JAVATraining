package org.kir;

public class MethodOverrideParentClass {

	public void methodA() {
		System.out.println("The MethodA");
	}

	public void methodB() {
		System.out.println("The MethodB");
	}

	public void methodC() {
		System.out.println("The MethodC");
	}

	public static void main(String[] args) {

		MethodOverrideParentClass parent = new MethodOverrideParentClass();

		parent.methodA();

		parent.methodB();

		parent.methodC();

	}

}
