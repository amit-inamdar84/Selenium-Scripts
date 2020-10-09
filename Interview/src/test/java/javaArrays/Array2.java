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
		System.out.println("Printing array a: ");
		for (int i = 0; i < 2; i++) {// Iterate row
			for (int j = 0; j < 2; j++) {// Iterate column
				System.out.print(a[i][j] + " ");
			}
			System.out.println();

		}
		
		//Another way to create 2D array.
		//{{00,01},{10,11}}
		int b[][] = {{12,24},{36,48}};
		System.out.println("Size: " + b.length);//2 elements inside outer braces.
		System.out.println("Printing array b: ");
		for (int i = 0; i < 2; i++) {// Iterate row
			for (int j = 0; j < 2; j++) {// Iterate column
				System.out.print(b[i][j] + " ");
			}
			System.out.println();

		}
		
		//one more 2D array
		int[][] c = {{2}};
		System.out.println("Size: " + c.length);//Only one element inside outer braces.
		System.out.println("Printing array c: ");
		for (int i = 0; i < 1; i++) {// Iterate row
			for (int j = 0; j < 1; j++) {// Iterate column
				System.out.print(c[i][j] + " ");
			}
			System.out.println();

		}
		
		//one more 2D array
		int[][] d = {{2,10}};
		System.out.println("Size: " + d.length);//Only one element inside outer braces.
		System.out.println("Printing array d: ");
		for (int i = 0; i < 1; i++) {// Iterate row
			for (int j = 0; j < 2; j++) {// Iterate column
				System.out.print(d[i][j] + " ");
			}
			System.out.println();

		}
	}

}
