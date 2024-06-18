package org.kir;

public class MethodOverirdeChildClass extends MethodOverrideParentClass {

	public void methodA() {

		super.methodA();
	}

	public void methodB() {
		System.out.println("the new for MethodB");
	}

	public void methodC() {
		System.out.println("the new for MethodC");
	}

	public static void main(String[] args) {

		MethodOverirdeChildClass obj = new MethodOverirdeChildClass();

		obj.methodA();

		obj.methodB();

		obj.methodC();
	}

}
