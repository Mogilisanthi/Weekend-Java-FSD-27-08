package com.simplelearn.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo {
	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<>();
		Integer array[]= {10,20,30,40,50};
		Collections.addAll(list, array);
		System.out.println(list);
		
		System.out.println(list.contains(20));
		System.out.println("list size" +list.size());
		System.out.println("Iterate using for each loop");
		for (int num:list)
			System.out.println(num);
		System.out.println("Use Iterator");
		Iterator<Integer> it=list.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
