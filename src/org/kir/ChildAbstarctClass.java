package org.kir;

public class ChildAbstarctClass extends ParentAbstarctClass {
	@Override
	public void methodA() {
		System.out.println("This Abstract MethodA");

	}

	@Override
	public void methodB() {
		System.out.println("This Abstract MethodB");

	}

	public static void main(String[] args) {
		ChildAbstarctClass obj = new ChildAbstarctClass();
		obj.methodA();

		obj.methodB();

		obj.methodC();

		obj.methodD();

	}

}
