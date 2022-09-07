package com.simplelearn.collections;

import java.util.LinkedHashSet;
import java.util.HashSet;
import java.util.Set;
import java.util.Iterator;

public class LinkedHashSetDemo {
	public static void main(String[] args) {
	
    Set<String> set =new LinkedHashSet<>();
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
	

}
}
