package com.highill.practice.java.jdk.collection;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CollectionDemo {

	public static void main(String[] args) {
		String[] stringArray = new String[]{"a", "abc", "b", "demo", "base", "demo base", "base demo"};
		List<String> stringList = Arrays.asList(stringArray);
		System.out.println("-----stringList: " + stringList);
		
		stringList.sort((s1, s2) -> (s1.compareTo(s2)));
		System.out.println("-----stringList sort1: " + stringList);
		
		stringList.sort((s1, s2)  -> (s2.compareTo(s1)));
		System.out.println("-----stringList sort2: " + stringList);
		
		Collections.sort(stringList);
		System.out.println("-----Collections sort stringList: " + stringList);
		
		Collections.sort(stringList, (s1, s2) -> (s2.compareTo(s1)));
		System.out.println("------Collection sort with Comparator stringList: " + stringList);
		

	}

}
