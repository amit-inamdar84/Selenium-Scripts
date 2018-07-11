package javaArrays;

public class Sum2DArray {

	public static void main(String[] args) {
		int a[][] = { { 2, 3, 5 }, { 5, 8, 4 } };
		int b[][] = { { 8, 1, 7 }, { 0, 6, 3 } };

		int c[][] = new int[2][3];

		// Adding 2D array
		for (int i = 0; i < 2; i++) {// Iterate row
			for (int j = 0; j < 3; j++) {// Iterate column
				c[i][j] = a[i][j] + b[i][j];
				System.out.print(c[i][j] + " ");
			}
			System.out.println();

		}

	}

}
