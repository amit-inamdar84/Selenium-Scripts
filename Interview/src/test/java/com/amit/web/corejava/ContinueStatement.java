package com.amit.web.corejava;

public class ContinueStatement {

	public static void main(String[] args) {
		for (int i = 1; i <= 10; i++) {
			if (i == 5) {
				continue;
			}
			System.out.println(i);
		}

		System.out.println("---------------------------------");

		for (int x = 1; x <= 3; x++) {
			for (int y = 1; y <= 3; y++) {
				if (x == 2 && y == 2) {
					continue;
				}
				System.out.println(x + " " + y);
			}
		}

		System.out.println("---------------------------------");

		for (int x = 1; x <= 3; x++) {
			for (int y = 1; y <= 3; y++) {//In case of inner loop, it breaks only inner loop.
				if (x == 2 && y == 2) {
					break;
				}
				System.out.println(x + " " + y);
			}
		}

	}

}
