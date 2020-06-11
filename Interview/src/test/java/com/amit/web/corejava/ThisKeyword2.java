package com.amit.web.corejava;
//This program demonstrates use of this to pass as an argument to constructor call. Here the object created in main method calls the constructor
//In the constructor we create an object of another class and also pass the current class object using this keyword. So when we try to create the object it
//invokes the constructor of that class.
//Then we invoke display method of another class.

public class ThisKeyword2 {
	int i = 90;

	ThisKeyword2() {
		ThisKeyword3 obj = new ThisKeyword3(this);
		obj.display();

	}

	public static void main(String[] args) {
		ThisKeyword2 obj = new ThisKeyword2();
	}

}
