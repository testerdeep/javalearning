package com.deep.training.queue;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class QueueMainLauncher {

	public static void main(String[] args){
		
		Queue<String> myQueue=new LinkedList<>();
		myQueue.add("Deep");
		myQueue.add("Ravi");
		myQueue.add("Kavi");
		myQueue.add("abc");
		myQueue.add("Kavi");
		myQueue.add(null);
		myQueue.add(null);
		System.out.println(myQueue);
		myQueue.remove();
		System.out.println("After remove" + myQueue);
		
		System.out.println(myQueue.poll());
		System.out.println("After poll" + myQueue);
		
		System.out.println(myQueue.peek());
		System.out.println("After peek" + myQueue);
		
		Deque<String> myDqueue= new ArrayDeque();
		
		
		
		
		
	}
	
}
