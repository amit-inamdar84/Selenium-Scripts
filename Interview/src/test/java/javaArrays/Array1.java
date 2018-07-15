package javaArrays;

/**
 * Arrays will store multiple set of data of same type We can get data based on
 * index Array size is fixed. It make code optimized and can retrieve or sort
 * data easily Types: Single and multi dimension
 */

public class Array1 {

	public static void main(String[] args) {
		int a[] = new int[5];
		//Can also be declared as int[] a = new int[5];
		a[0] = 5;
		a[1] = 10;
		a[2] = 15;
		a[3] = 20;
		a[4] = 25;

		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}

	}

}
