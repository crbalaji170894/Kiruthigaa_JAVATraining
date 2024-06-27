package org.kir;

public class StaticKeywordTest {

	
	
	public static void methodA() {
		 int a =10;
		System.out.println("This is MethodA");
	}

	public static void  methodB() {
		System.out.println("This is MethodB");
	}

	public void methodC() {
		System.out.println("This is MethodC");
	}
	 static
	 {
		 System.out.println("static block is invoked");
		 }  

	public static void main(String[] args) {

		StaticKeywordTest obj = new StaticKeywordTest();

//		obj.methodA();
//
//		obj.methodB();

		obj.methodC();
		
//		StaticKeywordTest.methodA();
//		
//		StaticKeywordTest.methodB();
		
		methodA();
		
		methodB();
		

	}

}
