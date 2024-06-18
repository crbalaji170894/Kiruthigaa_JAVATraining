package org.kir;

public class FullyAbstractionChildClass implements FullyAbstractionClassA {

	@Override
	public void methodA() {
		System.out.println("This is MethodA");

	}

	@Override
	public void methodB() {
		System.out.println("This is MethodB");

	}

	@Override
	public void methodC() {
		System.out.println("This is MethodC");

	}

	@Override
	public void methodD() {
		System.out.println("This is MethodC");

	}

	public static void main(String[] args) {

		FullyAbstractionChildClass obj = new FullyAbstractionChildClass();

		obj.methodA();

		obj.methodB();

		obj.methodC();

		obj.methodD();

	}

}
