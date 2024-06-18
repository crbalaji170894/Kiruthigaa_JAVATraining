package org.kir;

public abstract class ParentAbstarctClass {// partial

	public abstract void methodA();

	protected abstract void methodB();

	public void methodC() {

		System.out.println("This is MethodC");
	}

	public void methodD() {

		System.out.println("This is MethodD");
	}

	
//	public  static void main(String[] args) {
//		ParentAbstarctClass obj = new ParentAbstarctClass();
//
//		obj.methodA();
//
//		obj.methodB();
//
//		obj.methodC();
//
//		obj.methodD();
//	}

}
