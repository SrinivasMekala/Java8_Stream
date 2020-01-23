package com.srini.java8;

public class FirstLambdaExp1  {

	
	public static void main(String args[]) {
		//Thread t1= new Thread();
		new Thread(new Runnable(){
            public void run(){
                System.out.println("In run method, without lambda expression");
            }
        }).start();
		
	}
}
