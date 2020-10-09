package com.amit.web.corejava;
//Return type is the last statement executed in a method. Any statements after the return type will be ignored. Finally block is the only exception.

public class ReturnType {
	
	public void test1(){
		
	}
	
	public int test2(){
		return 5;
	}
	
	public double test3(){
		return 3.99;
	}
	
	public boolean test4(){
		return true;
	}
	
	public char test5(){
		return 'a';
	}
	
	public String test6(){
		return "Test";
	}
	
	//If we are returning an object the return type should be of class type
	public ReturnType test7(){
		return new ReturnType();
	}
	
	public int[] test8(){
		return new int[7];
	}
	
	public static void main(String[] args) {
		ReturnType obj = new ReturnType();
		System.out.println(obj.test7());
		
		System.out.println(obj.test8());
	}

}
