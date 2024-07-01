package org.kir;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Vector;

public class ArrayListTest {

	public static void main(String[] args) {

		ArrayList arrayLi = new ArrayList();

		ArrayList arrayLi1 = new ArrayList();
		
		LinkedList li1 = new LinkedList();
		
		ArrayList<Boolean>li3 = new ArrayList();
		
		li3.add(10);
		
		Vector ve = new Vector();
		
	

		arrayLi.add(100);

		arrayLi.add(200);

		arrayLi.add(300);

		arrayLi.add(400);

		System.out.println(arrayLi);

		arrayLi1.add(100);

		arrayLi1.add(600);

		arrayLi1.add(700);

		arrayLi1.add(800);

		System.out.println(arrayLi1);
		
		arrayLi.removeAll(arrayLi1);
		
		System.out.println(arrayLi);

		// // List arryLi2=new ArrayList();
//
//		arrayLi.add(10);
//
//		arrayLi.add("HelloWorld");
//
//		arrayLi.add('c');
//
//		arrayLi.add(true);
//
//		arrayLi.add(9095702844l);
//
//		arrayLi.add(20.40f);
//
//		arrayLi.add(10);
//
//		arrayLi.add("HelloWorld");
//
//		arrayLi.add('c');
//
//		arrayLi.add(true);
//
//		arrayLi.add(9095702844l);
//
//		arrayLi.add(20.40f);
//
//		System.out.println(arrayLi);
//
//		Object object = arrayLi.get(1);
//
//		System.out.println(object);
//
//		System.out.println(arrayLi.size());
//
//		Object remove = arrayLi.remove(1);
//
//		System.out.println(arrayLi);
//
//		boolean contains = arrayLi.contains(true);
//
//		System.out.println(contains);
//
//		System.out.println(arrayLi.indexOf(10));
//		System.out.println(arrayLi.lastIndexOf(10));
//
//		System.out.println(arrayLi.isEmpty());
//		
//		arrayLi.clear();
//		
//		System.out.println(arrayLi);

	}

}
