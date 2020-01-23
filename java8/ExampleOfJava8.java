package com.srini.java8;

public class ExampleOfJava8 {

	
	@FunctionalInterface 
	interface MyInterface{  
	    void display();  
	}  
	@FunctionalInterface
	interface caluculate{
		public int print(int a,int b);
	}
	public void myMethod(){  
		System.out.println("Instance Method");  
	    }  
	    public static void main(String[] args) {  
	    	ExampleOfJava8 obj = new ExampleOfJava8();   
		// Method reference using the object of the class
		MyInterface ref = obj::myMethod;  
		// Calling the method of functional interface  
		ref.display(); 
		
		caluculate add =  (number1, number2) -> number1 + number2;
		System.out.println("ADD "+add.print(5, 7));
		
		caluculate Sub =  (number1, number2) -> number1 - number2;
		System.out.println("Sub "+Sub.print(15, 7));
		
		
	    }  
}
