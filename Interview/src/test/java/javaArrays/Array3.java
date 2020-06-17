package javaArrays;

public class Array3 {

	int a[] = new int[5];

	public int[] test1() {
		return new int[] { 5, 10, 15, 20, 25 };
	}

	public int[][] test2() {
		return new int[][] { { 12, 24 }, { 36, 48 } };
	}

	public Object[][] test3() {
		return new Object[][] { { 12, 24 }, { 36, 48 } };
	}

	public static void main(String[] args) {
		Array3 obj = new Array3();
		System.out.println(obj.test1());
		System.out.println(obj.test2());
		System.out.println(obj.test3());

	}

}
