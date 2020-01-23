package com.srini.java8;

public class Car implements Vehicle, Alarm {

	private String brand;
	
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public Car() {
		 
	 }
	public Car(String car) {
		 this.brand=car;
	 }

	@Override
	public String getBrand() {
		System.out.println("getBrand");
		return "getBrand";
	}

	@Override
	public String speedUp() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String slowDown() {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public String turnAlarmOff() {
		// TODO Auto-generated method stub
		return Alarm.super.turnAlarmOff();
	}
	@Override
	public String turnAlarmOn() {
		// TODO Auto-generated method stub
		return Alarm.super.turnAlarmOn();
	}
	
	public static void main(String[] args) { 
	    Vehicle car = new Car("BMW");
	    System.out.println(car.getBrand());
	    System.out.println(car.speedUp());
	    System.out.println(car.slowDown());
	    System.out.println(car.turnAlarmOn());
	    System.out.println(car.turnAlarmOff());
	}

}
