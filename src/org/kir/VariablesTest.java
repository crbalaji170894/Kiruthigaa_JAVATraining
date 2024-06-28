package org.kir;

public class VariablesTest {

	static int a = 30; // class Level or global or instance variable

	public void methodA() {
		int a = 20; // local variable
		System.out.println(a);
		System.out.println(this.a);
		this.a=this.a+10;
	}

	public void methodB() {
		System.out.println(a);
        this.methodA();
	}

	public void methodC() {
		System.out.println(a);

	}

	public static void main(String[] args) {
		VariablesTest obj = new VariablesTest();

		obj.methodA();

		obj.methodB();

		obj.methodC();
		
		VariablesTest obj2 = new VariablesTest();

		obj2.methodA();

		obj2.methodB();

		obj2.methodC();
	}

}
