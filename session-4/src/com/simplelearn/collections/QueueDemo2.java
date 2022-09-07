package com.simplelearn.collections;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Iterator;

public class QueueDemo2 {
	public static void main(String[] args) {
		PriorityQueue<Integer> queue = new PriorityQueue<>();
		
		queue.add(10);
		queue.add(20);
		queue.add(30);
		
		System.out.println(queue.peek());
		System.out.println(queue.poll());
		System.out.println(queue.peek());
		System.out.println("Use Iterator");
		
        Iterator<Integer> it = queue.iterator();
        
        while(it.hasNext())
            System.out.println(it.next());
		
	}

}
