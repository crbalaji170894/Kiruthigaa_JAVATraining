package org.kir;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetTest {

	public static void main(String[] args) {

//		HashSet hset = new HashSet();
		
		Set<Integer> hSet = new HashSet();

		LinkedHashSet hset = new LinkedHashSet();

		hset.add(10);

		hset.add("Test");

		hset.add('c');

		hset.add(true);

		hset.add(10.50f);

		hset.add(10);

		hset.add("Test");

		hset.add('c');

		hset.add(true);

		hset.add(10.50f);

		// System.out.println(hset);

		TreeSet tset = new TreeSet();

		tset.add(100);

		tset.add(20);

		tset.add(301);

		tset.add(97);

		tset.add(403);

		System.out.println(tset);
		
		tset.remove(100);
		System.out.println(tset);
		
	}

}
