package org.kir;

public class SingleTonClass {

	public void methodA() {
		System.out.println("This is MethodA");
	}

	public void mehtodB() {
		System.out.println("This is MethodB");
	}

	public void methodC() {
		System.out.println("This is MethodC");
	}

	public void methodD() {
		System.out.println("This is MethodD");
	}

	// step 1

	private static SingleTonClass singleton_object = null;

	// create a static method

	public static synchronized SingleTonClass getSingleTonObject() {

		if (singleton_object == null) {
			 singleton_object = new SingleTonClass();
		}
		return singleton_object;

	}

}
