package com.srini.java8.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamFunctions1 {

	public static void main(String[] args) {
		List<String> strings = Arrays.asList("abc", "", "bc", "efg", "abcd","", "jkl");
		List<Integer> intList = Arrays.asList(1, 2, 3, 3, 4,5, 7);
		List<Integer> intValeList = Arrays.asList(17, 11, 3, 10, 5,6, 7);
		
	//	1)FILTER
		//Empty value removal
		strings.forEach(x->System.out.println(" Before Empty Removal : "+x));
		List<String> filtered=strings.stream().filter(x->!x.isEmpty()).collect(Collectors.toList());
		
		
	//	for(String s:filtered) {
	////		System.out.println(" After Empty Removal :"+s);
	//	}
		//2) ForEach
		filtered.forEach(System.out::println);
		
		//3)MAP
		//get list of unique squares
		List<Integer> sqaureValueList = intValeList.stream().map( i -> i*i).distinct().collect(Collectors.toList());
		sqaureValueList.forEach(System.out::println);
		
		//4 Limit
		
		intValeList.stream().limit(4).distinct().forEach(x->System.out.println(x));
		//5 Sorted
		intValeList.parallelStream().sorted().forEach(x->System.out.println(x));
		
		
		
		
		 System.out.println("List: " +intList.size());
	      System.out.println("Highest number in List : " + getMax(intList));
	    //  System.out.println("Lowest number in List : " + getMin(integers));
	     // System.out.println("Sum of all numbers : " + getSum(integers));
	     // System.out.println("Average of all numbers : " + getAverage(integers));
	     // System.out.println("Random Numbers: ");
	      
	     
	      
	    //6 FlatMap
	      
	      List<String> stringList = new ArrayList<String>();

	      stringList.add("One flew over the cuckoo's nest");
	      stringList.add("To kill a muckingbird");
	      stringList.add("Gone with the wind");

	      Stream<String> stream = stringList.stream();

	      stream.flatMap((value) -> {
	          String[] split = value.split(" ");
	          return (Stream<String>) Arrays.asList(split).stream();
	      })
	      .forEach((value) -> System.out.println("FlatMap :     "+value)) ;
	      
	    
	      //Ex2
	   // Creating a list of Prime Numbers 
	        List<Integer> PrimeNumbers = Arrays.asList(5, 7, 11,13); 
	          
	        // Creating a list of Odd Numbers 
	        List<Integer> OddNumbers = Arrays.asList(1, 3, 5); 
	          
	        // Creating a list of Even Numbers 
	        List<Integer> EvenNumbers = Arrays.asList(2, 4, 6, 8); 
	  
	        List<List<Integer>> listOfListofInts =  Arrays.asList(PrimeNumbers, OddNumbers, EvenNumbers); 
	  
	        System.out.println("The Structure before flattening is : " + 
	                                                  listOfListofInts); 
	        // Using flatMap for transformating and flattening. 
	        List<Integer> listofInts  = listOfListofInts.stream() 
	                                    .flatMap(list -> list.stream()) 
	                                    .collect(Collectors.toList()); 
	  
	        System.out.println("The Structure after flattening is : " + 
	                                                         listofInts);
	        
	      //7 Reduce -- Terminal Operations
	        
	        List<String> stringList1 = new ArrayList<String>();

	        stringList1.add("One flew over the cuckoo's nest");
	        stringList1.add("To kill a muckingbird");
	        stringList1.add("Gone with the wind");

	        Stream<String> stream1 = stringList1.stream();

	        Optional<String> reduced = stream1.reduce((value, combinedValue) -> {
	            return combinedValue + " + " + value;
	        });

	        System.out.println(reduced.get());
	        
	        
	        //8 AllMatch  -  Terminal Operators
	        
	        List<String> stringList2 = new ArrayList<String>();

	        stringList2.add("One");
	        stringList2.add("One");
	        stringList2.add("One");

	        Stream<String> stream2 = stringList2.stream();

	        boolean allMatch = stream2.allMatch((value) -> { return value.startsWith("One"); });
	        System.out.println(allMatch);
	        
	        
	      
	}
	private static int getMax(List<Integer> numbers) {
        int max = numbers.get(0);
  		
        for(int i = 1;i < numbers.size();i++) {
  		
           Integer number = numbers.get(i);
  			
           if(number.intValue() > max) {
              max = number.intValue();
           }
        }
        return max;
     }

}
