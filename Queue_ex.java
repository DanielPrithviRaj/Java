package com.collections;

import java.util.*;

public class Queue_ex {

	public static void main(String[] args) {

		priorityQueue();
		deQueue();
	}

	public static void priorityQueue() {
		Queue<String> user = new PriorityQueue<>();
		
		user.add("Kiran");
		user.add("Mani");
		user.add("Sunil");
		user.add("Max");
		user.add("Hari");
		
		System.out.println(user);
		
		System.out.println(user.peek());
		System.out.println(user);

		System.out.println(user.poll());
		System.out.println(user);

	}
	public static void deQueue() {
		Deque<String> user = new ArrayDeque<>();
		
		user.add("Kiran");
		user.add("Mani");
		user.add("Sunil");
		user.addFirst("Max");
		user.addLast("Hari");
		
		System.out.println(user);
		
		System.out.println(user.peekLast());
		System.out.println(user);

		System.out.println(user.pollLast());
		System.out.println(user);
		
		//Insertion order
		//double end operation (first and last element)

	}

}
