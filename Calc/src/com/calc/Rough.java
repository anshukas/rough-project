package com.calc;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Rough {
	public static void main(String[] args){
		/*String str = "    AN,    KSN";
		String[] strAr =str.split(",");
		for (int i = 0; i < strAr.length; i++) {
			System.out.println(strAr[i].trim());
		}
		System.out.println(strAr[0].trim());
		System.out.println(strAr[1].trim());
		System.out.println("   ,".trim());*/
		
		/*Map<String, Object> map = new HashMap<String, Object>();
		Map<String, String[]> map2 = new HashMap<String, String[]>();
		
			String[] arry = {"A","B","C"};
			System.out.println(arry.length);
			map.put("folderId", "XYZ1");
			map.put("", arry);
			*/
		
		/*Set<String> set = new HashSet<String>();
		set.add("100005");
		set.add("200005");
		
		Set<String> set2 = new HashSet<String>();
		set2.add("100005");
		set2.add("200005");
		set2.add("300005");
		
		
		System.out.println(set.containsAll(set2));*/
		/*String str = "A";
		String str1 = str.substring(0, 1).toUpperCase() + str.substring(1).toLowerCase();
		System.out.println(str1);*/
			
		String s = "abdsd3\\asda\\asasdd$sadas";
		//int counter = s.split("\\\\", -1).length - 1;
		int counter = 0;
		for( int i=0; i<s.length(); i++ ) {
		    if( s.charAt(i) == '\\' ) {
		        counter++;
		    } 
		}
		System.out.println(counter);
	}
}
