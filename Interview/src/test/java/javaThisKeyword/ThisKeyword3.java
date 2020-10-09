package javaThisKeyword;
//When this class constructor is invoked, it accepts this keyword as an argument which is nothing but the object of another class. Then the constructor
//initializes global variable i using the statement i=obj.i. Here we are referring to the global variable i of another class using its object obj.
//When the method display is invoked, the value of i which is already initialized using constructor is printed.

public class ThisKeyword3 {
	int i;

	ThisKeyword3(ThisKeyword2 obj) {
		i = obj.i;
	}

	void display() {
		System.out.println("Value of i is: " + i);
	}

}
