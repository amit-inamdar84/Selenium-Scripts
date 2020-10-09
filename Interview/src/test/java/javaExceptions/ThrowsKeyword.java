package javaExceptions;

import java.io.IOException;

//Throws keyword is used in method declaration to explicitly specify exceptions that a method might throw.
//Only checked exceptions can be handled using throws. The compiler will force you to do so.
//The statement that calls method should also specify throws keyword.
//When Throws keyword is declared and if exception does not occur then code will execute fine.
//Difference between throw and throws keyword:
//Throw keyword is used to forcible throw exception from within a method. When a throw statement is encountered, execution of current method is stopped
//and returned to the caller.
//Whereas throws keyword is used to declare that a method might throw one or more exceptions. The method caller also has to catch the exceptions.

public class ThrowsKeyword {
	
	public void validateAge(int age) throws IOException {
		if(age<18) {
			throw new IOException();
		}
		
		else {
			System.out.println("Person eligible to vote");
		}
		
	}

	public static void main(String[] args) throws IOException {
		ThrowsKeyword obj = new ThrowsKeyword();
		obj.validateAge(17);
	}

}
