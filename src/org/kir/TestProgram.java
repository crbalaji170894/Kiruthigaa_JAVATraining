package org.kir;

public class TestProgram {

	private void methodA() {
		System.out.println("This is MethodA");

	}

	private void methodB() {
		System.out.println("This is MethodB");
	}

	private void methodC() {
		System.out.println("This is MethodC");
	}

	public void methodName() {

	}

	public static void main(String[] args) {

		TestProgram obj = new TestProgram();

		obj.methodA();
		obj.methodB();
		obj.methodC();

		System.out.println("Hello World !");
	}

}
