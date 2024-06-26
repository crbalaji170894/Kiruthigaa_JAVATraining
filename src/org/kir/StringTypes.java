package org.kir;

public class StringTypes {

	public static void main(String[] args) {
//		String s1 = "Hello World"; // Literal String
//
//		System.out.println(System.identityHashCode(s1));
//
//		String s2 = "Hello World"; // Literal String
//
//		System.out.println(System.identityHashCode(s2));
//
//		String s3 = "Hello World"; // Literal String
//
//		System.out.println(System.identityHashCode(s3));

//		String s1 = new String("Hello World");
//
//		System.out.println(System.identityHashCode(s1));
//
//		String s2 = new String("Test World"); // Non literal string
//
//		System.out.println(System.identityHashCode(s2));

//		String s3 = new String("Hello World");
//
//		System.out.println(System.identityHashCode(s3));

		StringBuffer s1 = new StringBuffer("Hello Test");
		
		System.out.println(System.identityHashCode(s1));
		
		StringBuffer s2 = new StringBuffer("welcome Test");
		
		System.out.println(System.identityHashCode(s2));
		
		StringBuffer s3 = s1.append(s2);
		
		System.out.println(System.identityHashCode(s3));
	}

}
