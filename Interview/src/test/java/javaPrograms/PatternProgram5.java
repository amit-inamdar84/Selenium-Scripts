package javaPrograms;

import java.util.Scanner;

/*
7 6 5 4 3 2 1
7 6 5 4 3 2
7 6 5 4 3
7 6 5 4
7 6 5
7 6
7
*/

public class PatternProgram5 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter input num");
		int num = scanner.nextInt();
		for (int i = 1; i<=num; i++) {
			for (int j = num; j >= i; j--) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}

}
