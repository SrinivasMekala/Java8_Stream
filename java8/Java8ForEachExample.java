package com.srini.java8;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

public class Java8ForEachExample {

	
	public static void main(String args[]) {
		//creating sample Collection
		List<Integer> myList = new ArrayList<Integer>();
		for (int i=0; i<10; i++) {
			myList.add(i);
		}
		//traversing using Iterator
		Iterator it=myList.iterator();
		
		while (it.hasNext()) {
			System.out.println("  List items : "+it.next());
		}
		//traversing through forEach method of Iterable with anonymous class
		
		myList.forEach(x->System.out.println(" Iterating Using ForEachMethod :  "+x));
		
		
		//traversing through forEach method of Iterable with anonymous class
		myList.forEach(new Consumer<Integer>() {

			public void accept(Integer t) {
				System.out.println("forEach anonymous class Value::"+t);
			}

		});
		
		
		
	}
}
