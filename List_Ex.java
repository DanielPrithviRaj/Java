package com.collections;

import java.util.*;

public class List_Ex {

	public static void main(String[] args) {
		
		List<Integer> value = new ArrayList<>();
		
		value.add(66);
		value.add(54);
		value.add(28);
		value.add(45);
		System.out.println(value);
		
		value.add(3,26);
		System.out.println(value);
		
		value.remove(3);
		System.out.println(value);
		
		LinkedList<String> car = new LinkedList<>();
		
		car.add("Swift");
		car.add("Baleno");
		System.out.println(car);
		
		car.remove(1);
		System.out.println(car);
		

		car.add("Swift");
		car.add("Baleno");
		
		
		//System.out.println(car.get(0));
		System.out.println(car.peek()); //retrieves the first element but not removing it from the list
		
		
		System.out.println(car.poll());

	}

}
