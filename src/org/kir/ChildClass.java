package org.kir;

public class ChildClass extends ParentClass {

	public void childMethodA() {
		System.out.println("childMethodA");
	}

	public void childMethodB() {
		System.out.println("childMethodB");

	}

	public static void main(String[] args) {
		ChildClass childObj = new ChildClass();

		
		System.out.println(childObj.s);
		childObj.childMethodA();

		childObj.childMethodB();

		childObj.methodOne();

		childObj.mehtodTwo();

		childObj.methodThree();

		childObj.methodFour();
	}

}
