package com.amit.web.corejava;

public class ForLoop {

	public static void main(String[] args) {
		// For each loop with int array
		int arr[] = { 10, 20, 30, 40 };
		for (int i : arr) {
			System.out.println("Array elements: " + i);
		}
		System.out.println("------------------------------");

		// For loop with variable declared before
		int i;
		for (i = 10; i < 15; i++) {
			System.out.println(i);
		}
		System.out.println("------------------------------");

		// For loop with variable declared in loop
		for (int p = 55; p >= 50; p--) {
			System.out.println(p);
		}
		System.out.println("------------------------------");

		// For each loop with string array
		String name[] = { "XYZ", "ABC" };
		for (String j : name) {
			System.out.println("Array elements: " + j);
		}
		System.out.println("------------------------------");

		// Labelled for loop
		Label1: for (int x = 1; x <= 3; x++) {
			Label2: for (int y = 1; y <= 3; y++) {
				if (x == 2 && y == 2) {
					break Label2;
				}
				System.out.println(x + " " + y);
			}
		}

	}

}
