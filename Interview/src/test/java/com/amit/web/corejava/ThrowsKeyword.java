package com.amit.web.corejava;

import java.io.IOException;

//Throws keyword is used in method declaration to explicitly specify exceptions that a method might throw.
//Only checked exceptions can be handled using throws
//The statement that calls method should also specify throws keyword.

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
