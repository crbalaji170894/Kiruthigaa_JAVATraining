package org.kir;

import java.util.LinkedHashMap;

public class WordCoutHashMap {

	public static void main(String[] args) {
		String s1 = "Hi Welcome To The JAVA Traing and JAVA Coaching Class and To The Selenium and etc";

		LinkedHashMap<String, Integer> hmap = new LinkedHashMap();

		String[] wordArray = s1.split(" ");

		for (String eachword : wordArray) {

			if (hmap.containsKey(eachword)) {
				Integer value = hmap.get(eachword);
				hmap.put(eachword, value + 1);

			} else {
				hmap.put(eachword, 1);
			}

		}
		System.out.println(hmap);

		//
//		for(String eachword:wordArray) {
//			
//			System.out.println(eachword);
//			
//		}

	}

}
