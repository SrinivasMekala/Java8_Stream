package com.srini.java8;

public interface ShapeInterface {
	
	//public void square (int a); 
	  
    // static method 
	default  void show() 
    { 
        System.out.println("Static Method Executed"); 
    } 
    
}
