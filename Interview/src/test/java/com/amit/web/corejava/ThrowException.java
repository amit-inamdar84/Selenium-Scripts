package com.amit.web.corejava;
//When we want to throw exception based on a condition, we can use throw keyword. This will be a runtime exception.

public class ThrowException {
	public void validateAge(int age){
		if(age<18){
			//Here we create object of ArithmeticException class using new keyword and call its constructor-
			//public ArithmeticException(String s)
			throw new ArithmeticException("Person is minor to vote");
		}
		else{
			System.out.println("Person can vote");
		}
	}
	
	public static void main(String[] args) {
		ThrowException obj = new ThrowException();
		obj.validateAge(17);
	}

}
