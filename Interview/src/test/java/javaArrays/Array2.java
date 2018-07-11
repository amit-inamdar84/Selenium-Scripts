package javaArrays;

public class Array2 {

	public static void main(String[] args) {

		int a[][] = new int[2][2];
		// Row 0 column 0, column 1
		a[0][0] = 12;
		a[0][1] = 24;

		// Row 1 column 0, column 1
		a[1][0] = 36;
		a[1][1] = 48;

		System.out.println("Size: " + a.length);
		for (int i = 0; i < 2; i++) {// Iterate row
			for (int j = 0; j < 2; j++) {// Iterate column
				System.out.print(a[i][j] + " ");
			}
			System.out.println();

		}

	}

}
