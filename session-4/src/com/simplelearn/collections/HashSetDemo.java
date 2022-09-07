package com.simplelearn.collections;

import java.util.HashSet;
import java.util.Set;
import java.util.Iterator;

public class HashSetDemo {
	public static void main(String[] args) {
	
    Set<String> set =new HashSet<>();
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
	

}
}
