package org.kir;

public class SingleTonTest1 {

	public static void main(String[] args) {
//		SingleTonTest1 obj1 = new SingleTonTest1();
//
//		SingleTonTest1 obj2 = new SingleTonTest1();
//
//		System.out.println(obj1.hashCode());
//		System.out.println(obj2.hashCode());

		SingleTonClass singleTonObject1 = SingleTonClass.getSingleTonObject();

		SingleTonClass singleTonObject2 = SingleTonClass.getSingleTonObject();

		SingleTonClass singleTonObject3 = SingleTonClass.getSingleTonObject();

		SingleTonClass singleTonObject4 = SingleTonClass.getSingleTonObject();
		
		

		System.out.println(singleTonObject1.hashCode());

		System.out.println(singleTonObject2.hashCode());

		System.out.println(singleTonObject3.hashCode());

		System.out.println(singleTonObject4.hashCode());
	}

}
