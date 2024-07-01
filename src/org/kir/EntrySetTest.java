package org.kir;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class EntrySetTest {

	public static void main(String[] args) {

		HashMap<Integer, String> hashMap = new HashMap();

		hashMap.put(101, "JAVA");
		hashMap.put(102, "SELNIUM");
		hashMap.put(102, "RUBY");
		hashMap.put(104, "PYTHON");
		hashMap.put(106, "TEST");

		System.out.println(hashMap);

		Set<Entry<Integer, String>> entrySet = hashMap.entrySet();

		System.out.println(entrySet);

		for (Entry<Integer, String> eachEntry : entrySet) {

			Integer key = eachEntry.getKey();

			System.out.println(key);

			String value = eachEntry.getValue();

			System.out.println(value);
		}

	}

}
