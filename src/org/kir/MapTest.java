package org.kir;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class MapTest {

	public static void main(String[] args) {

		HashMap hmap = new HashMap();
		
		hmap.put(1001, null);
		
		hmap.put(1002, null);
		
		System.out.println(hmap);
		
		LinkedHashMap lMap = new LinkedHashMap();
		lMap.put(1001, null);
		
		lMap.put(1002, null);
		
		System.out.println(lMap);
//		
		TreeMap tMap = new TreeMap();
		
		//tMap.put(null,1001);
		
		tMap.put(1001, null);
		
		tMap.put(1002, null);
		
		System.out.println(tMap);
//		
		Hashtable HTable = new Hashtable();

//		HTable.put(1002, null);

		HTable.put(null, 1002);
		
		System.out.println(HTable);
//		hmap.put("StundentId", 1001);
//
//		hmap.put("StundeName", "test");
//
//		hmap.put("StundetMArk", 486);
//
//		hmap.put("StundentAdderrs", "Chennai");
//
//		hmap.put("StundentId1", 1001);
//
//		hmap.put("StundeName1", "test");
//
//		hmap.put("StundetMArk1", 486);
//
//		hmap.put("StundentAdderrs1", "Chennai");
//
//		System.out.println(hmap);
//		
//		System.out.println(hmap.get("StundetMArk"));
//		
//		boolean containsKey = hmap.containsKey("StundetMArk");
//		
//		boolean containsValue = hmap.containsValue(1001);
//
//		System.out.println(containsKey);
//		
//		System.out.println(containsValue);
	}

}
