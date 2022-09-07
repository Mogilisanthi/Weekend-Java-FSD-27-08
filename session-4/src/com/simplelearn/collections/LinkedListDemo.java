package com.simplelearn.collections;

import java.util.LinkedList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class LinkedListDemo {
	public static void main(String[] args) {
		
		List<Integer> list = new LinkedList<>();
		Integer linked[]= {10,20,30,40,50};
		Collections.addAll(list, linked);
		System.out.println(list);
		list.remove(1);
		System.out.println("After remove:"+list);
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

