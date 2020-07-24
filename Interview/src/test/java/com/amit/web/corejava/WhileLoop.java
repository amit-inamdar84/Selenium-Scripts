package com.amit.web.corejava;

public class WhileLoop {
	
	//It is used to iterate over data based on condition
	//i.e. while some condition is true keep executing the code in the body of while loop

	public static void main(String[] args) {
		// 0 will enter loop, increments to 1, prints 1 and increments to 2.
		// 2 enters loop, 2 increments to 3, prints 3 and increments to 4
		// 4 enters loop, 4 increments to 5, prints 5 and increments to 6 and
		// condition becomes false
		// Output 1,3,5
		int i = 0;
		while (i < 5) {
			i++;
			System.out.println(i++);
		}
		System.out.println("--------------------");
		// Output: 2,4,6,8,10
		int k = 1;
		while (k <= 10) {
			k++;
			System.out.println(k++);
		}
		System.out.println("--------------------");

		// Output 0,1,2,3,4
		int p = 0;
		while (p < 5) {
			System.out.println(p++);
		}
		System.out.println("--------------------");

		// Sum of numbers from 0 to 6
		int n = 0;
		int sum = 0;

		while (n <= 6) {
			sum = sum + n++;
			System.out.println("Value of sum: " + sum + "and Value of n: " + n);
		}
		System.out.println("Sum=" + sum);

	}

}
