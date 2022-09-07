package com.simplelearn.collections;

import java.util.Iterator;
import java.util.TreeSet;
import java.util.SortedSet;

public class TreeSetDemo {
	public static void main(String[] args) {
		
	    SortedSet<String> set =new TreeSet<>();
		set.add("john");
		set.add("jack");
		set.add("alex");
		set.add("best");
		System.out.println(set);
		set.remove("alex");
		System.out.println("After remove" +set);
		 Iterator<String> it = set.iterator();
	     
	     while(it.hasNext())
	         System.out.println(it.next());
	     System.out.println(set.contains("jack"));
	     System.out.println(set.size());
	     
	     SortedSet<String> desc = ((TreeSet<String>)set).descendingSet();
	     System.out.println(desc);
		

	}
	}



