package com.srini.java8;

public class MyDataImplWithStaticMethodImpl implements MyDataWithStaticMethod {
	
	public boolean isNull(String str) {
		System.out.println("Impl Null Check");

		return str == null ? true : false;
	}
	
	public static void main(String args[]){
		MyDataImplWithStaticMethodImpl obj = new MyDataImplWithStaticMethodImpl();
		obj.print("");
		obj.isNull("abc");
	}
	
	

}
