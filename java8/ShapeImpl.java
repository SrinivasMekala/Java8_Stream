package com.srini.java8;

public class ShapeImpl implements ShapeInterface, ShapeInterface2 {

	
	// Overriding default show method 
    public void show() 
    { 
        // use super keyword to call the show 
        // method of ShapeInterface interface 
    	ShapeInterface.super.show(); 
  
        // use super keyword to call the show 
        // method of ShapeInterface2 interface 
    	ShapeInterface2.super.show(); 
    } 
	public static void main(String[] args) {
		ShapeImpl s= new ShapeImpl();
		s.show();

	}

}
