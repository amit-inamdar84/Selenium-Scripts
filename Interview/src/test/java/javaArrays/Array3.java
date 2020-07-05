package javaArrays;

public class Array3 {

	int a[] = new int[5];

	public int[] test1() {
		return new int[] { 5, 10, 15, 20, 25 };
	}

	public int[][] test2() {
		return new int[][] { { 12, 24 }, { 36, 48 } };
	}

	// 2D array - Array of array
	public Object[][] test3() {
		return new Object[][] { { 12, 24 }, { 36, 48 } };
	}

	// 3D array - Array of array of array
	public void test4() {
		int[][][] data = { { { 12, 24 }, { 36, 48 } }, { { 8, 9 }, { 5, 9 } } };
		// System.out.println(data[0][0][0]+" "+data[0][0][1]);
		for (int i = 0; i < 2; i++) {

			for (int j = 0; j < 2; j++) {

				for (int k = 0; k < 2; k++) {
					System.out.println(data[i][j][k]);
				}
				System.out.println();
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		Array3 obj = new Array3();
		System.out.println(obj.test1());
		System.out.println(obj.test2());
		System.out.println(obj.test3());
		obj.test4();
	}

}
