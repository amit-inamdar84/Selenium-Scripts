package javaPrograms;
/*
1
1 2 1
1 2 3 2 1
1 2 3 4 3 2 1
1 2 3 4 5 4 3 2 1
1 2 3 4 5 6 5 4 3 2 1
1 2 3 4 5 6 7 6 5 4 3 2 1
*/

public class PatternProgram7 {

	public static void main(String[] args) {
		for (int i = 1; i <= 7; i++) {
			System.out.println("Value of i is: " + i);
			for (int j = 1; j <= i; j++) {
				System.out.print(j + " ");
			}

			for (int k = i - 1; k >= 1; k--) {
				System.out.print(k + " ");
			}
			System.out.println();
		}
	}

}
